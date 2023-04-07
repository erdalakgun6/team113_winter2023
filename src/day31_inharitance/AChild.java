package day31_inharitance;

import day30_inharitance.FGrandParent;
import day30_inharitance.GParent;

public class AChild extends GParent {

    String childStr;
    AChild(){

        System.out.println("Child class constructor calisti");

    }

    public static void main(String[] args) {
        // System.out.println(childStr); static degil
        // System.out.println(sayiParent); static degil
        // System.out.println(sayiGrandparent); static degil

        AChild objeChild = new AChild();

    }




    /*
Java'da inheritance kullanırken child class'taki obje
parent classlardaki tüm özelliklere sahip olur. Bunu
sağlayan java mekanizması super() constructor call'dur

 extends keyword kullanılan bir classta oluşturulan her bir constructorun
 ilk satırında biz görmesek bile super() constructor call vardır.
 super() ==> önce parent class a gidip parametresiz constructoru çalıştır demektir.

 bu şekilde child classtaki constructor çalıştığında
 extends keyword kullanmayan parent buluncaya kadar
 parent classlara gider

 */

}
