package com.mesutcalim.qualifier3;

import jakarta.enterprise.inject.Default;

@Default
public class Patron1 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "default data:"+data;
    }
}
