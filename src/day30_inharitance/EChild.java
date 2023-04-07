package day30_inharitance;

public class EChild extends DParentAccessModifier {
    static int sayiChildStatic;

    public static void main(String[] args) {

        // inharitancede private class uyeleri inherit edilemez
        //

        EChild eChild = new EChild();
        System.out.println(eChild.sayiDefault);
        System.out.println(eChild.sayiProtected);
        System.out.println(eChild.sayiPublic);
        // icinde bulundugumuz classdaki static variablelar
        // obje uzerinden otomatik gelmez
        // ama manuel yazdigimizda Java kabullenir

        System.out.println(eChild.sayiChildStatic);

        // ancak parent classdaki static variablelar
        // obje uzerinden KULLANILMAZ
        // System.out.println(eChild.sayiStaticPrivate);

        System.out.println(DParentAccessModifier.sayiStaticProtected);
        // Bu kullanım icin inheritancea ihtiyac yok
        // herhangi bir class daki static variable i
        // classIsmi.staticVariableIsmi seklinde kullanabiliriz

    }

}
