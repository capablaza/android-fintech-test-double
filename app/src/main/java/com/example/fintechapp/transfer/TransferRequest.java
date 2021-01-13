package com.example.fintechapp.transfer;

public class TransferRequest {
    private Integer amount;
    private String from;
    private String to;

    public TransferRequest(Integer amount, String from, String to) {
        this.amount = amount;
        this.from = from;
        this.to = to;
    }
}
