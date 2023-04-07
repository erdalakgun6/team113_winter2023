package day38_exception_garbageCollector;

public class C02_Final_Finally_Finalize {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE); // -2147483648

        System.out.println(Math.PI); // 3.141592653589793

        try {
            System.out.println(10/0);
            System.out.println("bolmenin sonrasinda ki satir");

        } catch (Exception e) {

            System.out.println("catch blogundaki satir");

        } finally {

            System.out.println("finally blogundaki satir");

        }


    }
}
