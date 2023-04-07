package day37_ThrowKeyword;

import java.util.Scanner;

public class C01_ThrowKeyword {
    /*
            Kodlari yazarken bazen muhtemel bir durumda
            bazi kodlarin ignore edilmesi istenebilir

            bu durumda kodlari IGNORE etme yontemi olarak
            isteyerek exception firlatip
            sonra da calismasini istedigimiz yerde
            catch ile yakalayip yolumuza devam edebiliriz
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Yasinizi Giriniz : ");
        int yas = scan.nextInt();
        try {
            if (yas<0) {
                throw new IllegalArgumentException("yas negatif olamaz");
            }
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }

}
