package day11_stringManipulations_ForLoop;

public class C02_nullPointer {
    public static void main(String[] args) {

        // null bir deger degildir
        // null bir pointer'der
        // yanina yazildigi non-primitive variable'a deger atanmadıgını isaret eder
        String str; // str olusturuldu ama deger atanmadi

        // Java method icerisinde deger atamadan variable olusturulmasina izin verir
        // ama deger atamadan kullanilmasina izin vermez
        /*
        System.out.println(str); // CTE
        str.concat("Java"); // CTE
        */
        /*
        Bazen bu programlarda variable'lar olusturulur ama daha sonra deger atanacagi icin deger atamasi yapilmaz
        deger atamasi yapilmadan listeleme bile CTE verdigi icin deger verilmedigini isaretleyecek,
        ama CTE olusmasini engelleyecek bir cozum olarak null poınter olusturmustur.
         */
        str = null ; // str = "null" degil
                     // null olarak isaretlenmis, degeri null atanmis degil
        System.out.println(str); // null
        // System.out.println(str.concat("Java")); // Run TİME error --- NullPointerException
        // System.out.println(str.length()); // Run TİME error --- NullPointerException
        System.out.println(str + "Java"); // nullJava
        String str2 = str + "Java";
        System.out.println("str : " + str2);

        // int sayi = null ; primitive variable'lara null degeri olmaz
        Integer sayi = null;

        // biz genelde String bir ifade olusturup, sonra deger atayacaksak
        // hiclik degeri atariz

        String str3 =""; // str3'e deger atanmistir
                         // atanan deger hiclik'dir
        System.out.println(str3.concat("Java")); // Java

        // System.out.println(str.isEmpty()); // NullPointerException
        // null olarak isaretlenen bir String HİC BİR METHOD'la kullanilamaz
        // sadece yazdirilabilir veya + ile kullanilabilir
        System.out.println(str3.isEmpty()); // true



    }
}
