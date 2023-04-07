package day35_interfaces;


import day34_abstractClasses.CAvciKuslar;

public class C01_ChildOfI01 extends CAvciKuslar implements I01_interface{

        @Override
        public void toplama() {

        }

        @Override
        public void cikarma() {

        }

        @Override
        public String ekleme() {

            return null;
        }

        @Override
        public int faktoryel() {

            return 0;
        }

        public static void main(String[] args) {

            System.out.println(I01_interface.str);

        }
}
