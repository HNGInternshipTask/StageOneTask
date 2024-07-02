package com.semicolon.StageOneTask.exception;

public class InternalServerError extends RuntimeException {
    public InternalServerError(String message){
        super(message);
    }
}
