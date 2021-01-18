package com.example.fintechapp.transfer;

import java.util.ArrayList;
import java.util.List;

public class StorageFake implements Storage {

    private List<String> messages = new ArrayList<>();

    @Override
    public void save(String message) {
        messages.add(message);
    }

    @Override
    public List<String> getMessages() {
        return this.messages;
    }
}
