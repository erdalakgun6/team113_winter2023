package day38_exception_garbageCollector;

public class C01_ThrowKeyword {
    public static void main(String[] args) {
        int sayi = 10;


        try {
            if (sayi<10){
                throw new IllegalArgumentException("sayi negatif olmamali");

            }
            System.out.println("sartli calisacak satir 1");
            System.out.println("sartli calisacak satir 2");
            System.out.println("sartli calisacak satir 3");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        System.out.println("yola devam");

    }
}
