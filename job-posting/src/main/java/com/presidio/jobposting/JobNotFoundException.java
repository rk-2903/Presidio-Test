package com.presidio.jobposting;

public class JobNotFoundException extends Exception{

    public JobNotFoundException(String message){
        super(message);
    }

    public JobNotFoundException(String message, Throwable cause){
        super(message,cause);
    }
}
