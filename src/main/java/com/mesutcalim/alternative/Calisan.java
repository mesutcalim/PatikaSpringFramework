package com.mesutcalim.alternative;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "alternativedi")
@ApplicationScoped
public class Calisan {
    @Inject
    private PatronInterface patronInterface;

    //parametresiz constructor
    public Calisan() {

    }

    public String getData(String data){
        return patronInterface.surum(data);
    }
}
