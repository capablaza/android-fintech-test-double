package com.example.fintechapp.transfer;

public class TransferService {

    private TransferClient client;
    private Storage storage;

    public TransferService(TransferClient client, Storage storage) {
        this.client = client;
        this.storage = storage;
    }

    TransferResponse transfer(TransferRequest request) {

        TransferClientResponse response = client.transfer(request);

        if (response.code() == 520) {
            storage.save("Try transfer amount not valid");
            return new TransferResponse(520, "The amount must be major than zero.");
        }
        if (response.code() == 521) {
            storage.save("Try transfer amount not valid");
            return new TransferResponse(521, "The amount can't be major than 200.000.");
        }
        if (response.code() == 522) {
            storage.save("Try with same accounts for transactions");
            return new TransferResponse(522, "The accounts can't be equals.");
        }

        if (response.code() == 503) {
            storage.save("Service Unavailable");
            return new TransferResponse(503, "The operation can't be process, please try again.");
        }

        return new TransferResponse(response.code(), response.message());
    }
}
