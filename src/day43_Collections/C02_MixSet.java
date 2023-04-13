package day43_Collections;

import java.util.*;

public class C02_MixSet {
    public static void main(String[] args) {
        Set<Object>mixSet=new HashSet<>();

        mixSet.add(12);
        mixSet.add("java");
        mixSet.add('S');
        mixSet.add(true);

        int[] arr=new int[3];
        arr[2]=34;
        arr[1]=71;
        mixSet.add(arr);

        List<Object> mixlist = new ArrayList<>();
        mixlist.add("Hava");
        mixlist.add(24);

        mixSet.add(mixlist);

        System.out.println(mixlist); // [Hava, 24]
        System.out.println(mixSet); // [[Hava, 24], java, S, 12, [I@58ceff1, true]
        // Collections objeleri birarada tutan yapilardir.

        System.out.println(mixSet.size()); // 6
        System.out.println(mixSet.contains(24)); // false
        System.out.println(mixSet.contains(12)); // true
        System.out.println(Arrays.toString(arr)); // [0, 71, 34]

        // Data türü olarak object secilirse icine her data turunden element konulabilir
        // Ancak elementlere ulasmamiz yada update etmek gibi islemleri yapmamiz
        // mumkun olmayabilir yada cok zor olabilir


    }
}
