package com.mesutcalim.alternative;

import jakarta.enterprise.inject.Alternative;

@Alternative
public class Patron1 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "sürüm "+data;
    }
}
