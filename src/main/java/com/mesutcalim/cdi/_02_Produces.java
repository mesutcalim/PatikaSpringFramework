package com.mesutcalim.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named(value = "producetuto")
@ApplicationScoped
public class _02_Produces {

    @Produces //üretiyor
    public List<String> getList(){
        List<String> liste = new ArrayList<>();
        liste.add("HTML5");
        liste.add("Java");
        liste.add("CSS3");
        liste.add("React");
        return liste;
    }
}
