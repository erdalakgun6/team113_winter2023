package day03_dataCasting;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {
        //Soru 6-Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen cemberin yaricapini giriniz");
        // kullanicinin girdiği bilgiyi kaydedebilecek data turunde bir variable olusturun
        // kullanicidan bilgiyi almak icin scan objesini ve ilgili next method'unu kullanin

        double yaricap = scan.nextDouble();

        // cevresini ve alanini yazdirin
        System.out.println("cemberin cevresi : " + 2 * 3.14 * yaricap);
        System.out.println("dairenin alani : " + 3.14 * yaricap * yaricap);

    }
}
