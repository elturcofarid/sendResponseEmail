package com.util.email.model;

public class ResponsePosmark {

    private Object response;

    private Object data;


    public ResponsePosmark(){}

    public ResponsePosmark(Object response, Object data) {
        this.response = response;
        this.data = data;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
