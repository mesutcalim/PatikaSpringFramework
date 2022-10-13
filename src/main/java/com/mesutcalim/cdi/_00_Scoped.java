package com.mesutcalim.cdi;

import jakarta.enterprise.context.*;
import jakarta.inject.Named;
import jdk.jfr.Registered;

//kapsam
//yaşam süresi
//performans
@Named
//@ApplicationScoped  //bütün uygulama boyunca yaşar.
//@RequestScoped //1 istek boyunca yaşar.
//@SessionScoped //1 kullanıcı için yaşar ancak logout olunca ölür.
//@Dependent //bukalemun gibi
//@ConversationScoped //belli istek boyunca yaşar
public class _00_Scoped {

}
