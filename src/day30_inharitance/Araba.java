package day30_inharitance;

public class Araba {

    // marka gozetmeksizin tum arabalarin sahip olacagi ozellikleri
    // bu classa koyariz

    String marka = "Tum arabalarin markasi olur";
    String model = "Tum arabalrin modeli olur";
    String vites = "Tum arabalarin vitesi olur";
    String yakit = "Tum arabalrin yakitla calisir";

    public void uretimyeri(){
        System.out.println("Tum arabalar fabrikada uretilir");
    }
    public void motor(){ System.out.println("Tum arabaların motoru olur"); }

    public static void main(String[] args) {

    }

}
