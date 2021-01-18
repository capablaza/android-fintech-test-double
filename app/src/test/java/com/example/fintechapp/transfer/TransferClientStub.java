package com.example.fintechapp.transfer;

public class TransferClientStub implements TransferClient {

    private int code;
    private String message;

    public TransferClientStub(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public TransferClientResponse transfer(TransferRequest request) {
        return new TransferClientResponse(code, message);
    }
}
