package day27_stringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();

        System.out.println(sb1.capacity()); // 16
        System.out.println(sb1.length()); // 0

        sb1.append("Mustafa");

        System.out.println(sb1.capacity()); // 16
        System.out.println(sb1.length()); // 7

        sb1.append(" YilmazTürk");

        System.out.println(sb1.length()); // 18
        System.out.println(sb1.capacity()); // 34
        System.out.println(sb1.length()); // 18

        sb1.append(" javayi cok sever, sabah aksam Java calisir.");

        System.out.println(sb1.length()); // 62
        System.out.println(sb1.capacity()); // 70

        // 2. yontem
        StringBuilder sb2 = new StringBuilder("Java Candir");
        System.out.println(sb2.capacity()); // 27
        System.out.println(sb2.length()); // 11

        // 3. yontem

        StringBuilder sb3= new StringBuilder();
        sb3.append("36985214712");
        System.out.println(sb3.capacity());// 16
        System.out.println(sb3.length());// 11
        sb3.append(" : TC No");
        System.out.println(sb3);// 36985214712 : TC No
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());

        String str = "Java Candir";

        sb3.append(str,4,str.length());

        System.out.println(sb3); // 54464473321 : Tc No Candir

        // trim :

        sb3.trimToSize();
        System.out.println(sb3.capacity()); // 26
        System.out.println(sb3.length()); // 26


    }
}
