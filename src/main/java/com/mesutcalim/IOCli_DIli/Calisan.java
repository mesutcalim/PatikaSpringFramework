package com.mesutcalim.IOCli_DIli;

import com.mesutcalim.IOCsiz_DIsiz.Patron;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "ıoclicdiliCalisan")
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
