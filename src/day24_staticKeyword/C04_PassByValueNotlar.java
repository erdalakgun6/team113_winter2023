package day24_staticKeyword;

public class C04_PassByValueNotlar {
        /*  Pass by Value ile ilgili en kritik noktalar:
               1- Size interview (iş görüşmesi, mülakat)'de sorduklarında Java "Pass by Value" yi
                  tercih etmiştir diyeceksiniz. (Pass by Reference değil )
               2- Pass by Value, bir methoda parametre olarak gönderdiğimiz variable'ımızın değeri
                  method'da değiştirildiğinde, bizim main methoddaki variable'ımızın değerinin değişmemesidir.
               3- Method'a gönderdiğimiz bir "List" veya "Array" gibi bir obje ise, bu durumda Pass by Value
                  nasıl çalışır? Eğer method'da "New" diye yeni bir değer ataması yoksa, sadece elementler değişiyorsa,
                  o zaman bizim main method'daki elementler de değişmiş olur. Yani araba aynı, yolcular değişmiş olur.
                  Ama eğer method'da "New" keyword ile objemize yeni bir değer atanmışsa, o zaman o yeni methoda atanan
                  değer method'da kalır, bizim main method'daki hem List'imiz ve Array'imiz hem de içindeki elementler
                  değişmemiş olur. Yani yeni araba varsa bizim değişimle işimiz yok.
         */
}
