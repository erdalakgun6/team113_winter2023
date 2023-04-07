package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan yasini isteyin,
        //         65 yas üzeri ise "Emekli Olabilirsin" yazdirin.
        //         yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen Yasinizi Giriniz");
        double yas = scan.nextDouble();
        if (yas >=65){
            System.out.println("Emekli Olabilirsin");
        }
        else {
            System.out.println("Emekli Olabilmek icin daha : "+(65-yas)+" yil calismalisin");
        }

    }
}
