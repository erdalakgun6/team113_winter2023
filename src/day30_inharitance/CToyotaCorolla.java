package day30_inharitance;

public class CToyotaCorolla extends BToyota {

    String lastik = "Lassa 205-55-15";
    String model = "Corolla";
    String yakit= "Corolla dizel,benzinli, ve elektrikli";
    public void motor(){
        System.out.println("Corolla Araclar Turkiye de uretilen motorlari kullanir");
    }

    public static void main(String[] args) {
        CToyotaCorolla corolla = new CToyotaCorolla();
        System.out.println(corolla.lastik);
        System.out.println(corolla.model);
        System.out.println(corolla.yakit);
        corolla.motor();
        corolla.uretimyeri();
        System.out.println(corolla.marka);
        System.out.println(corolla.aku);
        corolla.guvenlik();
        System.out.println(corolla.vites);


    }

}
