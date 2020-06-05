package com.boot.response;

public class CustomAdminResponse {

    int status;
    String description;
    String message;
    int output;

    public CustomAdminResponse(int status, String description, int output, String message) {
        this.status = status;
        this.description = description;
        this.output = output;
        this.message = message;
    }

    public CustomAdminResponse(int status, String description, String message) {
        this.status = status;
        this.description = description;
        this.message = message;
    }

    public CustomAdminResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "CustomAdminResponse{" + "status=" + status + ", description=" + description + ", message=" + message + ", output=" + output + '}';
    }
}