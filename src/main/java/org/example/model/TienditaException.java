package org.example.model;


public class TienditaException extends Exception {
    private int code;

    public TienditaException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

}