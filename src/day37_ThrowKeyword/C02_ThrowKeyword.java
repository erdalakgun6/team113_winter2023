package day37_ThrowKeyword;

public class C02_ThrowKeyword {
    public static void main(String[] args) {

        String a=null;
        String b="";
        try {


            try {
                int c = a.length() + b.length();
            } catch (NullPointerException e) {
                if (b.length() == 0) {
                }  throw new RuntimeException(e);
                }
                System.out.println("Null Point vardir. Islem Yapilamaz");
            } catch (RuntimeException e) {
                System.out.println("Throw Keyword Calisti");
            }



    }
}
