package com.example.fintechapp.transfer;

public class TransferResponse {
    private Integer code;
    private String message;

    public TransferResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
