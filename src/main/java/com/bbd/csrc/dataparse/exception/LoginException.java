package com.bbd.csrc.dataparse.exception;

/**
 * 公共异常,所有的自定义异常请继承自此类,也可以直接使用此类
 *
 * @author Ian.Su
 * @version $Id: CommonException.java, v 0.1 2017/4/21 16:54 Ian.Su Exp $
 */
public class LoginException extends CommonException {
    public LoginException(String message) {
        super(message);
    }
}
