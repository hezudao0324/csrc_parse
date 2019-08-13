package com.bbd.csrc.dataparse.parse;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件处理
 * Created by wish on 2018/9/21.
 */
@Component
@Slf4j
public class FileHandler {

    /**
     * 查找所有文件
     * @param path
     * @return
     */
    public List<String> findAllFiles(String path) {
        List<String> files = new ArrayList<>();
        findAllFiles(path, files);
        return files;
    }

    /**
     * 查找文件夹中的文件列表
     * @param path
     * @return
     */
    public List<String> list(String path) {
        List<String> list = new ArrayList<>();
        File file = new File(path);
        if (file.exists() && file.isDirectory()) {

            for (String s : file.list()) {
                StringBuilder sb = new StringBuilder(path).append(s);
                if(isDirectory(sb.toString())) {
                    sb.append(File.separator);
                }
                list.add(sb.toString());
            }
        }
        return list;
    }



    /**
     * 复制文件到目标目录
     * @param srcPath
     *            源文件绝对路径
     * @param destDir
     *            目标文件所在目录
     * @param overwriteExistFile
     *            是否覆盖目标目录下的同名文件
     * @return boolean
     */
    public boolean copyFile(String srcPath, String destDir, boolean overwriteExistFile) {
        boolean flag = false;

        File srcFile = new File(srcPath);
        if (!srcFile.exists() || !srcFile.isFile()) { // 源文件不存在
            return false;
        }

        //获取待复制文件的文件名
        String fileName = srcFile.getName();
        String destPath = destDir + File.separator +fileName;
        File destFile = new File(destPath);
        if (destFile.getAbsolutePath().equals(srcFile.getAbsolutePath())) { // 源文件路径和目标文件路径重复
            return false;
        }
        if(destFile.exists() && !overwriteExistFile) {    // 目标目录下已有同名文件且不允许覆盖
            return false;
        }

        File destFileDir = new File(destDir);
        if(!destFileDir.exists() && !destFileDir.mkdirs()) { // 目录不存在并且创建目录失败直接返回
            return false;
        }

        try {
            FileInputStream fis = new FileInputStream(srcPath);
            FileOutputStream fos = new FileOutputStream(destFile);
            byte[] buf = new byte[1024];
            int c;
            while ((c = fis.read(buf)) != -1) {
                fos.write(buf, 0, c);
            }
            fos.flush();
            fis.close();
            fos.close();

            flag = true;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return flag;
    }


    /**
     *
     * @param srcPath    源文件夹路径
     * @param destDir    目标文件夹所在目录
     * @return
     */
    public boolean copyDirectory(String srcPath, String destDir, boolean overwriteExistDir) {
        if(destDir.contains(srcPath))
            return false;
        boolean flag = false;

        File srcFile = new File(srcPath);
        if (!srcFile.exists() || !srcFile.isDirectory()) { // 源文件夹不存在
            return false;
        }

        //获得待复制的文件夹的名字，比如待复制的文件夹为"E:\\dir\\"则获取的名字为"dir"
        String dirName = srcFile.getName();

        //目标文件夹的完整路径
        String destDirPath = destDir + File.separator + dirName + File.separator;
        File destDirFile = new File(destDirPath);
        if(destDirFile.getAbsolutePath().equals(srcFile.getAbsolutePath())) {
            return false;
        }
        if(destDirFile.exists() && destDirFile.isDirectory() && !overwriteExistDir) {    // 目标位置有一个同名文件夹且不允许覆盖同名文件夹，则直接返回false
            return false;
        }

        if(!destDirFile.exists() && !destDirFile.mkdirs()) {  // 如果目标目录不存在并且创建目录失败
            return false;
        }

        File[] fileList = srcFile.listFiles();    //获取源文件夹下的子文件和子文件夹
        if(fileList.length==0) {    // 如果源文件夹为空目录则直接设置flag为true，这一步非常隐蔽，debug了很久
            flag = true;
        }
        else {
            for(File temp: fileList) {
                if(temp.isFile()) {    // 文件
                    flag = copyFile(temp.getAbsolutePath(), destDirPath, overwriteExistDir);     // 递归复制时也继承覆盖属性
                }
                else if(temp.isDirectory()) {    // 文件夹
                    flag = copyDirectory(temp.getAbsolutePath(), destDirPath, overwriteExistDir);   // 递归复制时也继承覆盖属性
                }

                if(!flag) {
                    break;
                }
            }
        }

        return flag;
    }

    /**
     *  删除文件夹
     *  @param  folderPath
     */
    public  void  delFolder(String  folderPath) {
        try {
            delAllFile(folderPath);
            //删除完里面所有内容
            String filePath = folderPath;
            filePath = filePath.toString();
            File myFilePath = new File(filePath);
            myFilePath.delete();
            //删除空文件夹
        } catch (Exception e) {
            System.out.println("删除文件夹操作出错");
            e.printStackTrace();
        }
    }

    /**
     *  删除文件夹里面的所有文件
     *  @param  path  String  文件夹路径  如  c:/fqf
     */
    public void delAllFile(String  path)  {
        File  file  =  new  File(path);
        if  (!file.exists())  {
            return;         }
        if  (!file.isDirectory())  {
            return;
        }
        String[]  tempList  =  file.list();
        File  temp  =  null;
        for  (int  i  =  0;  i  <  tempList.length;  i++)  {
            if  (path.endsWith(File.separator))  {
                temp  =  new  File(path  +  tempList[i]);
            }             else  {
                temp  =  new  File(path  +  File.separator  +  tempList[i]);
            }
            if  (temp.isFile())  {
                temp.delete();
            }
            if  (temp.isDirectory())  {
                delAllFile(path+"/"+  tempList[i]);//先删除文件夹里面的文件
                delFolder(path+"/"+  tempList[i]);//再删除空文件夹
            }
        }
    }


    /**
     * 移动文件
     * @param oldPath
     * @param newPath
     */
    public void moveFolder(String oldPath, String newPath) {
        // 先复制文件
        copyDirectory(oldPath, newPath, true);
        // 则删除源文件，以免复制的时候错乱
        delFolder(oldPath);
    }







    /**
     * 是否是目录
     * @param path
     * @return
     */
    public boolean isDirectory(String path) {
        File file = new File(path);
        return file.exists() && file.isDirectory();
    }

    /**
     * 查找所有文件
     * @param path
     * @param files
     */
    private void findAllFiles(String path, List<String> files) {
        File file = new File(path);
        if (file.exists() && file.isDirectory()) {
            for (String f : file.list()) {
                File temp = new File(path, f);
                f = temp.getAbsolutePath();
                if (temp.isFile()) {
                    files.add(f);
                } else if (temp.isDirectory()) {
                    findAllFiles(f, files);
                }
            }
        }
    }

    /**
     * 判断文件夹是否存在
     * @param path
     * @return
     */
    public boolean isExist(String path) {
        File file = new File(path);
        return file.exists();
    }

    /**
     * 创建文件夹
     * @param path
     * @return
     */
    public void createDitionary(String path) {
        File file = new File(path);
        if(!file.exists()) {
            file.mkdir();
        }
    }

    /**
     * 移动文件
     * @param filePath
     * @param targetDictionary
     * @return
     */
    public boolean moveFile(String filePath, String targetDictionary)
    {
        File file = new File(filePath);
        File targetFloder = new File(targetDictionary);
        //检查目标路径是否合法
        if(targetFloder.exists())
        {
            if(targetFloder.isFile())
            {
                log.error("目标路径是个文件，请检查目标路径！");
                return false;
            }
        }else
        {
            if(!targetFloder.mkdirs())
            {
                log.error("目标文件夹不存在，创建失败！");
                return false;
            }
        }
        //检查源文件是否合法
        if(file.isFile() &&file.exists())
        {
            String destinationFile = targetDictionary + File.separator + file.getName();
            if(!file.renameTo(new File(destinationFile)))
            {
                log.error("移动文件失败！");
                return false;
            }
        }else
        {
            log.error("要备份的文件路径不正确，移动失败！");
            return false;
        }
        log.info("已成功移动文件"+file.getName()+"到"+targetDictionary);
        return true;
    }

    /**
     * 文件内容是否为空
     * @param filePath
     * @return
     */
    public boolean isEmpty(String filePath) {
        File file = new File(filePath);
        return !file.exists() || file.length() == 0;
    }

    /**
     * 删除文件
     * @param filePath
     */
    public void deleteFile(String filePath) {
        File file = new File(filePath);
        file.delete();
    }
}
