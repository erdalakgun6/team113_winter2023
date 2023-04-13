package day41_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList {
    public static void main(String[] args) {
        /*
        Collections objeleri bir arada tutan yapilardir
        Gunluk hayatta karsilasilan durumlarla ilgili olusan
        ihtiyaclara göre farkli collections yapilari vardir

        Bir uygulamada hangi collectioni kullancagimiza biz ozelligine gore karar veririz

        3 ana collectiondan bahsedebiliriz
            1- List
            2- Queue
            3- Set
            4- Interface ile kurallari belirleniyor.

        Interface lerde obje olusturamadigimiz icin childclass lardan conctructorlarini kullanilir
        Ozellikleri constructorlar degil DATA TURU olarak sectigimiz collection belirler.

         */
        LinkedList<String>Linked1 = new LinkedList<>();
        List<String> Linked2 = new LinkedList<>();
        Queue<String> Linked3 = new LinkedList<>();
        Deque<String> Linked4 = new LinkedList<>();




    }
}
