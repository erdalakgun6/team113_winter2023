package day42_Queue;

import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {
        // Deque Double ended queue
        // cift tarafli kuyruk

        Deque<String> harfler = new LinkedList<>();
        harfler.add("J");
        harfler.add("K");
        System.out.println(harfler); // [J, K]

        harfler.addFirst("B");
        System.out.println(harfler); // [B, J, K]

        System.out.println(harfler.remove()); // B
        System.out.println(harfler); // [J, K]

        harfler.addFirst("T"); //
        System.out.println(harfler); // [T, J, K]
        harfler.addLast("T"); // [T, J, K, T]
        harfler.add("L"); // [T, J, K, T]
        System.out.println(harfler); // [T, J, K, T, L]
        harfler.removeLastOccurrence("T"); // true
        System.out.println(harfler); // [T, J, K, L]
        harfler.removeFirstOccurrence("R");// false
        System.out.println(harfler); // [T, J, K, L]

        System.out.println(harfler.peekFirst()); // T
        System.out.println(harfler.peekLast()); // L
        System.out.println(harfler.hashCode()); // 3499480

        LinkedList<String> karakterler = new LinkedList<>();
        karakterler.add("*");
        karakterler.add("?");
        System.out.println(karakterler); // [*, ?]
        karakterler.push("&");
        System.out.println(karakterler); // [&, *, ?]

        LinkedList<String> copy = (LinkedList<String>) karakterler.clone();
        System.out.println(copy);


    }
}
