package com.mesutcalim.aop.decorator;

import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.inject.Inject;

@Decorator
abstract public class EvDecorator implements IEv{
    private @Inject @Delegate IEv iEv;



    @Override
    public String boyama(String data) {
        System.out.println("Decorator buradaydı...");
        String dataInformation = iEv.boyama(data);
        if(dataInformation.equals("mesut çalım"))
        {
            dataInformation=dataInformation.toUpperCase();
        }
        return null;
    }
}
