package com.supplierregistry.supplierregistry.rest.model;

public class BaseResponse {
    private boolean success;
    private String message;

    public BaseResponse() {}

    public BaseResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    // Gettery a settery
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
