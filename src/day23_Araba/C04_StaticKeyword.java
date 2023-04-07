package day23_Araba;

public class C04_StaticKeyword {

    static String hastaneismi = "Yildiz HAstanesi";
    static String hastanetelefonu = "3122343434";
    static String bashekimIsmi= "Kemal Aydin";

    String persIsmi ;
    String perAdresi;
    String perTelefonu;

    public static void main(String[] args) {
        C04_StaticKeyword personel1 = new C04_StaticKeyword();

        System.out.println(personel1.persIsmi);
        System.out.println(hastaneismi);


        C04_StaticKeyword personel2 = new C04_StaticKeyword();
        personel2.persIsmi="dogan";

        System.out.println(personel2.persIsmi); // Dogan
        System.out.println(personel1.persIsmi); // null

        personel2.bashekimIsmi= "Sumeyra Gunel";
        System.out.println(personel1.bashekimIsmi);


        /*
            1- static variablelar tum class icin gecerlidir(class variable)
            2- static variablelar tum objeler icin ayni degeri tasidiklari icin
               her obje icin ayrica olusturulmaz sadece 1 variable olur
            3- static variablelara ulasmak veya update etmek icin obje ismi kullanmaya gerek yoktur
               direk ulasilabilir.
               Baska classdan static variablea ulasmak icin classismi.staticVariableIsmi yazilir
         */
    }

}
