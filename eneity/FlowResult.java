package com.qianye.zhaimi.pipeline.entity;

/**
 * Created by leo on 16/1/12.
 */
public class FlowResult {

    private boolean status;

    private Integer code;

    private Object message;

    public FlowResult() {
    }


    public FlowResult(boolean status) {
        this.status = status;
    }

    public FlowResult(boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public FlowResult(boolean status, Integer code, Object message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
}
