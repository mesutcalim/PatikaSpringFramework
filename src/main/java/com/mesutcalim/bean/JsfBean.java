package com.mesutcalim.bean;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named(value = "cdiBean")
@ApplicationScoped
@Getter
@Setter
public class JsfBean {
    private String patika;

    public JsfBean() {
        this.patika = "Spring Boot Eğitimine Hoşgeldiniz";
    }


}
