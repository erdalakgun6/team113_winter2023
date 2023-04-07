package day31_inharitance;

public class CToyota extends BAraba{
    String str2 = "Toyota";

    CToyota(){
        super("java");
        System.out.println("Parametresiz Toyota constructori calisti");
    }

    CToyota(int sayi){
        System.out.println("Int Parametreli Toyota constructori calisti");

    }

    CToyota(String s){
        System.out.println("String Parametreli Toyota constructori calisti");
    }

}
