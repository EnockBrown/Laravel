package com.example.laravel.Models;

public class LoginResults {

    private Boolean error;
    private String message;
    private String success;
    private User user;

    public LoginResults(Boolean error, String message, String success, User user) {
        this.error = error;
        this.message = message;
        this.success = success;
        this.user = user;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
