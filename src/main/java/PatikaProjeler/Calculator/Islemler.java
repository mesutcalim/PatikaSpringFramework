package PatikaProjeler.Calculator;

public class Islemler {
    public double toplama(double x,double y){
        return x+y;
    }
    public double cikarma(double x,double y){
        return x-y;
    }
    public double carpma(double x,double y){
        return x*y;
    }
    public double bolme(double x,double y){
        return x/y;
    }
    public void usAlma(double x,double y){
        long sonuc = 1;

        while (y != 0)
        {
            sonuc *= x;
            --y;
        }

        System.out.println("CEVAP = " + sonuc);
    }
    public void karekokAlma(double x){
        double karekok= Math.sqrt(x);
        System.out.println(karekok);
    }
    public void turevAlma(double derece,double[] katsayi){
        System.out.println("Denklemin Türevi: ");
        for(int i=0;i<katsayi.length-1;i++){
            System.out.print(katsayi[i]*(derece-i)+" ");
        }
    }
    public void integralAlma(double katsayiIntegral,double dereceIntegral,double a,double b){
        double h,sonuc=0,x,F,F_ilk,F_son;
        //h=(b-a)/n;

        h=0.0001;
        for(x=a+h;x<=b;x+=h)
        {
            F=Math.pow(x, dereceIntegral);
            F=F*katsayiIntegral;
            sonuc=sonuc+F*h;
        }
        F_ilk=Math.pow(a, dereceIntegral);
        F_ilk=F_ilk*katsayiIntegral;
        F_son=Math.pow(b, dereceIntegral);
        F_son=F_son*katsayiIntegral;
        sonuc=sonuc+h/2*(F_ilk+F_son);

        System.out.println("x= "+a+" ve "+b+" aralığında, fonksiyonun yaklaşık olarak integrali: "+(int)sonuc);
    }

    public void faktoriyelHesaplama(double sayi){
        int faktoriyel = 1;
        for(int i = 1; i <= sayi; i++)
        {
            faktoriyel = faktoriyel * i;
        }
        System.out.println(sayi + "!= " + faktoriyel);
    }
    public void modAlma(double sayi,double mod){
        while (sayi>=mod)
        {
            sayi-=mod;
        }
        System.out.println("Mod : "+sayi);
    }
    public void mutlakDeger(double sayi){
        if (sayi >= 0){
            System.out.println(sayi);
        }else {
            System.out.println(sayi*-1);
        }
    }

}
