package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan notunu alin
        //         50 ve daha büyükse "Sinifi Gectin"
        //         50'den kucukse "Maalesef Kaldin" yazdirin.
        /*
        if Statements'da sart parantezinden sonra {} kullanmazsak
        Java ilk ;'e kadar olan kismi if body olarak kabul eder
        if body zaten bir satir ise bu bir sorun olmaz
        ama if bofy 1 satirdan coksa, ilk satirdan sonrasi her durumda calisir
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Notunuzu Giriniz");
        double not = scan.nextDouble();
        if (not >=50 && not<=100)
            System.out.println("Sinifi Gectin");
        if (not<50)
        System.out.println("Maalesef Kaldin");


    }
}
