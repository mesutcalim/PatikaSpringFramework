package PatikaProjeler.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int girdi=1;
        while(girdi!=12) {
            System.out.println("Yapmak istediğniz işlemi seçiniz:");
            System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme\n" +
                    "5.Üs alma\n" +
                    "6.Karekök alma\n" +
                    "7.Türev alma\n" +
                    "8.Integral Alma\n" +
                    "9.Faktöriyel Hesaplama\n" +
                    "10.Mod Alma\n" +
                    "11.Mutlak Değer Hesaplama\n12.Çıkış");
            girdi = input.nextInt();
            Islemler islemler = new Islemler();

            switch (girdi) {
                case 1:
                    int x, y;
                    System.out.println("1.sayıyı giriniz");
                    x = input.nextInt();
                    System.out.println("2.sayıyı giriniz");
                    y = input.nextInt();
                    System.out.println(islemler.toplama(x, y));
                    break;
                case 2:
                    System.out.println("1.sayıyı giriniz");
                    x = input.nextInt();
                    System.out.println("2.sayıyı giriniz");
                    y = input.nextInt();
                    System.out.println(islemler.cikarma(x, y));
                    break;
                case 3:
                    System.out.println("1.sayıyı giriniz");
                    x = input.nextInt();
                    System.out.println("2.sayıyı giriniz");
                    y = input.nextInt();
                    System.out.println(islemler.carpma(x, y));
                    break;
                case 4:
                    System.out.println("1.sayıyı giriniz");
                    x = input.nextInt();
                    System.out.println("2.sayıyı giriniz");
                    y = input.nextInt();
                    if (y > 0) {
                        System.out.println(islemler.bolme(x, y));
                    } else {
                        System.out.println("Bölen sayı 0 olamaz...");
                        System.out.println("Tekrar giriniz: ");
                        y = input.nextInt();
                        if (y > 0) {
                            System.out.println(islemler.bolme(x, y));
                        } else {
                            System.out.println("Ana menüye dönülüyor...");
                        }
                    }
                    break;
                case 5:
                    System.out.println("1.sayıyı giriniz");
                    x = input.nextInt();
                    System.out.println("2.sayıyı giriniz");
                    y = input.nextInt();
                    islemler.usAlma(x,y);
                    break;
                case 6:
                    System.out.println("Karekökünü bulmak istediğinz sayıyı giriniz:");
                    x = input.nextInt();
                    islemler.karekokAlma(x);
                    break;
                case 7:
                    System.out.println("Denklemin Derecesini Giriniz");
                    int derece = input.nextInt();
                    double[] katsayi = new double[derece + 1];

                    System.out.println("Denklemin Katsayılarını Giriniz");
                    for (int i = 0; i < katsayi.length; i++) {

                        katsayi[i] = input.nextInt();
                    }
                    islemler.turevAlma(derece, katsayi);
                    break;
                case 8:
                    double katsayiIntegral, dereceIntegral, a, b;

                    System.out.print("Değişkenin Katsayısını Giriniz: ");
                    katsayiIntegral = input.nextDouble();
                    System.out.print("Değişkenin Kuvvetini Giriniz: ");
                    dereceIntegral = input.nextInt();
                    System.out.print("integrali alınacak fonksiyonun ilk x noktasını belirleyiniz: ");
                    a = input.nextDouble();
                    System.out.print("integrali alınacak fonksiyonun son x noktasını belirleyiniz: ");
                    b = input.nextDouble();
                    islemler.integralAlma(katsayiIntegral, dereceIntegral, a, b);
                    break;
                case 9:
                    System.out.println("Faktoriyelini hesaplamak istediğiniz bir sayi giriniz: ");
                    int sayi = input.nextInt();
                    islemler.faktoriyelHesaplama(sayi);
                    break;
                case 10:
                    int mod;
                    System.out.println("Mod hesaplamak için sayı giriniz");
                    sayi = input.nextInt();
                    System.out.println("Bölmek istediğniz sayıyı giriniz");
                    mod = input.nextInt();
                    islemler.modAlma(sayi, mod);
                    break;
                case 11:
                    System.out.println("Mutlak değerini hesaplamak istediğiniz sayıyı giriniz");
                    sayi = input.nextInt();
                    islemler.mutlakDeger(sayi);
                    break;
                case 12:
                    break;
                default:
                    System.out.println("Eksik veya hatalı değer girdiniz...");
            }
        }

    }
}
