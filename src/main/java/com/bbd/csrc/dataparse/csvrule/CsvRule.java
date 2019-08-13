package com.bbd.csrc.dataparse.csvrule;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**csv文件解析规则接口
 * Created by wish on 2018/9/19.
 */
public interface CsvRule<T> {
    /**
     * 解析生成目标类
     * @return
     */
    default Class getTargetClass() {
        ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericInterfaces()[0];
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        return (Class)actualTypeArguments[0];
    }

    /**
     * 处理之前操作
     */
    default void beforeDeal(){}


    /**
     * 处理之后操作
     */
    default void afterDeal(){}

    /**
     * 批量处理
     * @param list
     */
    void dealWithResult(List<T> list);


    /**
     * 对应文件名正则表达式
     * @return
     */
    String fileNameRegex();

}
