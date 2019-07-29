package com.stackroute.Muzix.exceptions;

public class TrackAlreadyExists extends Exception {
    private String message;
    public TrackAlreadyExists()
    {

    }
    public TrackAlreadyExists(String message)
    {
        super(message);
        this.message=message;
    }
}
