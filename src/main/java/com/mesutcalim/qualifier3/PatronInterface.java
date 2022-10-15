package com.mesutcalim.qualifier3;

public interface PatronInterface {
    //@Alternative // Aynı anda sadece 1 adet sınıf çalışabilir.
    //@Qualifier   // Aynı anda 1 den fazla sınıf aktif ancak default olarak çalışacak oloanı seçebiliyoruz.
    public String surum(String data);
}
