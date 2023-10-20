package com.academia.socialMedia.exceptions;

public class UserNotFoundException extends RuntimeException {

    private int userId;

    public UserNotFoundException(int userId){
        this.userId = userId;
    }

    @Override
    public String getMessage() {
        return "The user with id: " + userId + " was not found..";
    }
}
