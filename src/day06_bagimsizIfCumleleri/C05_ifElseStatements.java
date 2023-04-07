package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C05_ifElseStatements {
    public static void main(String[] args) {
        /*  Eger bir olay icin
            sadece 2 olasilik varsa
            ve bu olasiliklardan birisi mutlaka calisacaksa
            If Else Statements kullaniriz

            If-Else Statement'da if body'si veya else body'si mutlaka calisir
            ikisinin birden calisma ihtimali YOKTUR
            ikisinin de calismama ihtimali YOKTUR

         */

        // Soru 5- Kullanicidan notunu alin
        //         50 veya daha buyukse "Sinifi Gectin",
        //         50'den kucukse "Maalesef Kaldin" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Notunuzu Giriniz");
        double not = scan.nextDouble();
        if (not>=50 && not<=100) {
            System.out.println("Sinifi Gectin");
        }
        else {
            System.out.println("Maalesef Kaldin");
        }
        // Kullanicidan pozitif bir tamsayi alin
        // sayinin tek veya cift sayi oldugunu yazdirin

        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = scan.nextInt();
        if (sayi % 2 == 0 ) {
            System.out.println("Girilen sayi cift sayidir");
        }
        else  {
            System.out.println("Girilen sayi tek sayidir");
        }
        /*
        Kullanicidan pozitif bir tamsayi alin
        5 ile bolunup bolunmedigini yazdirin
         */
        if (sayi % 5==0){
            System.out.println("sayi 5 ile tam olarak bolun");
        }
        else {
            System.out.println("sayi 5 tam olarak bolunemez");
        }

    }
}
