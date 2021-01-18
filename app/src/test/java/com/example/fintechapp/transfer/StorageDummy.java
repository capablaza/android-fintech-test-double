package com.example.fintechapp.transfer;

import java.util.List;

public class StorageDummy implements Storage{
    @Override
    public void save(String message) {

    }

    @Override
    public List<String> getMessages() {
        return null;
    }
}
