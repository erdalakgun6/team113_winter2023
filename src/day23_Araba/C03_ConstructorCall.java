package day23_Araba;

public class C03_ConstructorCall {
 /*
        Java'da ihtiyac olursa bir constructor icinden baska constructor cagirilabilir
        this(ilgili parametreler) yazarak istedigimiz constructor'i cagirabiliriz
        Constructor call icin 2 kural vardir
        1- constructor call icinde bulundugu constructor'in ilk satirinda olmalidir
        2-
     */

    int sayi;
    String str;

    public C03_ConstructorCall() {
        System.out.println("Parametresiz cons calisti");
    }
    public C03_ConstructorCall(int sayi) {
        System.out.println("int Parametreli cons calisti");
        this.sayi = sayi;
    }
    public C03_ConstructorCall(String str) {
        this(5);
        System.out.println("String Parametreli cons calisti");
        this.str = str;
    }
    public C03_ConstructorCall(int sayi, String str) {
        // C02_ConstructorCall(); boyle yazildiginda method call olarak algilar
        this(); // Java syntax olarak constructor call icin bunu belirlemistir

        this.sayi = sayi;
        this.str = "Java";
        System.out.println("2 Parametreli cons calisti");
    }
    public static void main(String[] args) {

        C03_ConstructorCall obj3 = new C03_ConstructorCall(7,"Selcuk");
        System.out.println(obj3.sayi); // 7
        System.out.println(obj3.str); // Java

        C03_ConstructorCall obj2 = new C03_ConstructorCall("Java");
        System.out.println(obj2.sayi);// 5
        System.out.println(obj2.str); // Java
        C03_ConstructorCall obj1 = new C03_ConstructorCall();


    }
}
