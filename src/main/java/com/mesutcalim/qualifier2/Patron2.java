package com.mesutcalim.qualifier2;

@QualifierMultiple
public class Patron2 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "qualifier multiple 1 "+data;
    }
}
