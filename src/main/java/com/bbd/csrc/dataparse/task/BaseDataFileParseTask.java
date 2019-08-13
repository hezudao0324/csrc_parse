package com.bbd.csrc.dataparse.task;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wish on 2018/10/16.
 */
public class BaseDataFileParseTask {

    private final Map<String,Lock> lockMap = new ConcurrentHashMap<>();

    /**
     * 对文件加锁
     * @param path 文件路径
     * @param fileName 文件名
     */
    public void lockWithFile(String path, String fileName) {
        String key = path + fileName;
        Lock lock = lockMap.get(key);
        if(lock == null) {
            lock = new ReentrantLock();
            lockMap.put(key, lock);
        }
        lock.lock();
    }

    /**
     * 对文件解锁
     * @param path 文件路径
     * @param fileName 文件名
     */
    public void unlockWithFile(String path,String fileName) {
        String key = path + fileName;
        Lock lock = lockMap.get(key);
        if(lock == null) {
            return;
        }
        lock.unlock();
        lockMap.remove(key);
    }
}
