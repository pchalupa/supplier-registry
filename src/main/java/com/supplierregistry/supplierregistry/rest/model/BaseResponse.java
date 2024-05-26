package com.supplierregistry.supplierregistry.rest.model;

public class BaseResponse<T> {
    private boolean success;
    private T data;

    public BaseResponse(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public T getData() {
        return data;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setData(T data) {
        this.data = data;
    }
}
