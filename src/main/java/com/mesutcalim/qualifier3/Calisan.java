package com.mesutcalim.qualifier3;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "qualifier3Cdi")
@ApplicationScoped
public class Calisan {
    @Inject
    @QualifierMultiple2(EFazlaSecenekler.BIRINCI)
    private PatronInterface patronInterface;

    //parametresiz constructor
    public Calisan() {

    }

    public String getData(String data){
        return patronInterface.surum(data);
    }
}
