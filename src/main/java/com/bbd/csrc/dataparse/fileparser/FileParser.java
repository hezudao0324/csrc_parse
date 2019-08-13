package com.bbd.csrc.dataparse.fileparser;

/**
 * 文件处理接口
 * Created by wish on 2018/9/3.
 */
public interface FileParser {
    /**
     * 处理文件
     * @param filePath 文件路径
     * @param fileName 文件名
     */
    void handleWithFile(String filePath, String fileName);
}
