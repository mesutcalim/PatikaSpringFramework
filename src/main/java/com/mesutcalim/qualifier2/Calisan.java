package com.mesutcalim.qualifier2;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "qualifierCdi")
@ApplicationScoped
public class Calisan {
    @Inject
    @QualifierMultiple
    private PatronInterface patronInterface;

    //parametresiz constructor
    public Calisan() {

    }

    public String getData(String data){
        return patronInterface.surum(data);
    }
}
