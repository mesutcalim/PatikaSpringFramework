package com.mesutcalim.alternative;

import jakarta.enterprise.inject.Alternative;

@Alternative //sadece 1 adet alternative class çalışıyor diğeri kapalı
public class Patron1 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "sürüm "+data;
    }
}
