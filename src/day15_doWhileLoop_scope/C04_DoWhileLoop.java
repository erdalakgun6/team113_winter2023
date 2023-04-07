package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        // kullanicidan toplanmak uzere sayilar alin
        // kullaniciya bitirmek icin 0 a basmasini soyleyin
        // kullanici 0 a bastiiginda
        // 0 haric kac sayi girildigini ve toplamlarini yazdirin

        Scanner scan= new Scanner(System.in);

        int girilenSayi=1;
        int toplam=0;
        int sayiAdedi=0;
        /*
        while (girilenSayi !=0){

            System.out.println("Toplanmak uzere tam sayi giriniz"+
                    "\nBitirmek İcin 0'a basiniz");
            girilenSayi = scan.nextInt();

            if (girilenSayi!=0){
                toplam += girilenSayi;
                sayiAdedi++;
            }

            System.out.println("Girilen "+sayiAdedi+"adet sayinin toplami : "+toplam);
        }

         */
        do {
            System.out.println("Toplanmak uzere tamsayi giriniz"+
                    "\nBitirmek icin 0'a basiniz");
            girilenSayi= scan.nextInt();

            if (girilenSayi!=0){
                toplam+= girilenSayi;
                sayiAdedi++;
            }

        }while (girilenSayi !=0);
    }
}
