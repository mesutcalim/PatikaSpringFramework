package com.mesutcalim.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

//cdi => bean
@Named(value = "namedtuto")
@ApplicationScoped
public class _01_Named {
    private Long namedId;
    private String namedData= "Merhabalar Named CDI Bean ";

}
