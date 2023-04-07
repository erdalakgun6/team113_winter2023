package day14_methodOverloading_whileLoop;

public class C04_MethodOverloading {
    public static void main(String[] args) {
        /*
            Java overlooding kurallari
            1- isim ve parametreleri ayni olan birden fazla method olusturulamaz
            2- data turleri farkli olan parametrelerin yerlerini degistirirsek
            java yeni bir method olarak kabul eder(int, double)(double, int)

            Overlooding olan classlarda
            java hangi methodun calistirilacagina su sekilde karar verir

            1- cagrilan isimde method var mi ?
            2- method call da kullanilan arguments ile methodlardaki
               parametrelerin %100 uyumlu oldugu varmi ?
            3- argument ile parametre ayni olmasa bile
               verilen argumentleri kabul edecek parametre varmi?
            4- Casting ile birden fazla methodu kullanabiliyorsa
            daha az casting ile calisacak methodu kullanir
         */

        topla(3,5); // 8
        topla(3.4, 2.8); // 6.199999999999
        // topla("ali", "veli"); CTE bu argumentleri kabul edebilecek parametre yok

        topla('a','b'); // iki int 195
        topla(3f,4f); // iki double 7.0
        topla(3f, 4); // double ve int 7.0
    }

    public static void topla(int a, int b){

        System.out.println("iki tam sayinin toplami : "+ (a+b));
    }

    public static void topla(double a, double b){
        System.out.println("iki double sayinin toplami : "+(a+b));
    }

    public static void topla(int sayi1, double sayi2 ){
        System.out.println("int ve double sayilarinin toplamı : "+ (sayi1+sayi2));
    }
    public static void topla(double sayi1, int sayi2){
        System.out.println("double ve int sayilarin toplami : "+(sayi1+sayi2));
    }



}
