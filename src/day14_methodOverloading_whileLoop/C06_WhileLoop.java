package day14_methodOverloading_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        // kullanicidan toplanmak uzere sayilar alin
        // toplam 500u asinca
        // kac sayi girdigini ve sayilarin toplamini yazdirin

        Scanner scan = new Scanner(System.in);

        int girilenSayi = 0;
        int toplam = 0;
        int girilenSayiAdedi = 0;

        while (toplam<500){ // toplam 500den kucuk oldugu sure boyunca
            System.out.println("Toplanmak uzere bir tam sayi giriniz");
            girilenSayi = scan.nextInt();
            toplam += girilenSayi;
            girilenSayiAdedi++;
        }
        System.out.println("Toplam "+girilenSayiAdedi+ " adet sayi girildi ve toplami : "+toplam );
    }
}
