package com.chuwei.common.bean;

/**
 * Description:
 * Created by chuw@winning.com
 * Created Date 2017/12/14 18:51
 */
public class errorMessage<T> {

    private Integer code;
    private String message;
    private String url;
    private T data;

    public Integer getCode(){return this.code;}
    public void setCode(Integer code){this.code=code;}

    public String getMessage(){return this.message;}
    public void setMessage(String message){this.message=message;}

    public String getUrl(){return this.url;}
    public void setUrl(String url){this.url=url;}

    public T getData(){return this.data;}
    public void setData(T data){this.data=data;}
}
