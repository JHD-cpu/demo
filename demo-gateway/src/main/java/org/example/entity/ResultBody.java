package org.example.entity;


public class ResultBody <T>{
    public Integer code;
    public T data;
    public String status;

    public ResultBody() {
    }

    public  ResultBody(T data) {
        this.data = data;
        this.code=200;
        this.status="success";
    }

    public void error(T data,String message) {
        this.data = data;
        this.code=100;
        this.status=message;
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
