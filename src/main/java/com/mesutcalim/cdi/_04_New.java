package com.mesutcalim.cdi;

import com.mesutcalim.StudentDto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.New;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;

@Named(value = "newtuto")
@ApplicationScoped
public class _04_New {
    //üretilen
    @Produces
    public String uretilenData(@New StudentDto studentDto){
        studentDto=StudentDto.builder().studentId(0L).studentName("Student name'si").studentSurname("faruk").build();
        return studentDto.getStudentName();
    }
    @Getter
    @Inject
    private String tuketilenData;
}
