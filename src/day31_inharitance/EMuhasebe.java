package day31_inharitance;

public class EMuhasebe extends FPersonel {

    String sgkNo = "Calisan sgk no belirtilmedi";
    boolean raporluMu;

    public void fazlaMesai(int fazlaMesaiSaati) {
        System.out.println(fazlaMesaiSaati * 200);
    }

    public void nobetUcreti(int nobetSayisi) {
        System.out.println(nobetSayisi * 500);
    }

}
