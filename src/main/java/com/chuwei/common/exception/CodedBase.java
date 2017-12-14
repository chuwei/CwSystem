package com.chuwei.common.exception;

/**
 * Description:
 * Created by chuweicw@gmail.com
 * Created Date 2017/12/14 20:01
 *
 * @author chuweicw@gmail.com
 */
public interface CodedBase {
    int getCode();

    String getMessage();

    Throwable getCause();

    StackTraceElement[] getStackTrace();

    void throwThis() throws Exception;
}