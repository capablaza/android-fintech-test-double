package com.example.fintechapp.transfer;

public class TransferClientResponse {

    private String message;
    private Integer code;

    public TransferClientResponse(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }
}
