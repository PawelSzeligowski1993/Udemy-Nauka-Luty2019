package _3_progObiektowe3.obslugaWyjatków;

class ZaMałoWody extends Exception{
    public ZaMałoWody(String string) {
        super(string);
    }
}

public class ButelkaWyjatki {

    private double ileLitrów;


    ButelkaWyjatki(double ileLitrów){
        this.ileLitrów = ileLitrów;
    }

    double getIleLitrów(){
        return ileLitrów;
    }

    void wlej(double ilosc){
        this.ileLitrów += ilosc;
    }

    void wylej(double ilosc)throws ZaMałoWody{
        if (ilosc < ileLitrów) {
            this.ileLitrów -= ilosc;

        }throw new ZaMałoWody("Za mało wody");

    }

    void przelej(double ilosc,ButelkaWyjatki gdzie) throws ZaMałoWody {
        this.wylej(ilosc);
        gdzie.wlej(ilosc);

    }

    public static void main(String[] args) {

        ButelkaWyjatki[] buteleczki = new ButelkaWyjatki[3]; // Null

        buteleczki[0] = new ButelkaWyjatki(5);
        buteleczki[1] = new ButelkaWyjatki(8);
        buteleczki[2] = new ButelkaWyjatki(10);

        buteleczki[0].wlej(4);
        try {
            buteleczki[0].przelej(25, buteleczki[1]);
        }
        catch (ZaMałoWody ex){
            System.out.println(ex.getMessage());
        }




        System.out.println(buteleczki[0].getIleLitrów());
        System.out.println(buteleczki[1].getIleLitrów());
        System.out.println(buteleczki[2].getIleLitrów());
    }
}
