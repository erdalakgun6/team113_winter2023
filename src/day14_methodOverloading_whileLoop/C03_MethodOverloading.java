package day14_methodOverloading_whileLoop;

public class C03_MethodOverloading {
    public static void main(String[] args) {

        /*
            Bir class'da ayni isme sahip
            farkli islem yapan methodlar olabilir
            Jaxa bu methodlardan hangisinin calisacagina
            parametrelere gore karar verir

            Bir classda ismi ayni, parametreleri farkli methodlar olmasina
            method OVERLOADING denir.
         */

        String str= "Bu is olacak";
        System.out.println(str.replace("bu is", "Java Guzel")); // Java Guzel olacak

        System.out.println(str.replace('u', 'e')); // Be is olacak

    }
}
