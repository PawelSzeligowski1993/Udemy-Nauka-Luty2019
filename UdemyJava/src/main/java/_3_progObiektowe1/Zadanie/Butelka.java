package _3_progObiektowe1.Zadanie;

// stworzyc pojemnosc żeby niemożliwe bylo wlanie wiecej niz jest pojemnosci

public class Butelka {
    private double ileLitrow;
    private double pojemność;

    Butelka (double ileLitrow, double pojemność)
    {
        this.ileLitrow = ileLitrow;
        this.pojemność = pojemność;
    }

    double getIleLitrow(){
        return ileLitrow;
    }

    public double getPojemność() {
        return pojemność;
    }

    boolean wlej (double ilosc){
        if(ilosc<(pojemność -ileLitrow)){
       // if (ilosc<(gdzieWlac.pojemność-gdzieWlac.ileLitrow)) {
            //System.out.println("Wlej");
            this.ileLitrow += ilosc;}
        else {
            System.out.println("za duzo");
            return false;

        }
        return true;
    }

    boolean wylej(double ilosc) {
        //System.out.println("Wylej");
        if (ilosc < ileLitrow) {
            this.ileLitrow -= ilosc;
            return true;
        } else {
            return false;
        }
    }

    void przelej(double ilosc, Butelka gdziePrzelac){
        //System.out.println("Przelej");
        if (this.wylej(ilosc)) {
            gdziePrzelac.wlej(ilosc);
        } else
            System.out.println("Za mało");
    }

    public static void main(String[] args) {
        Butelka[] butelkas = new Butelka[3];  //Null

        butelkas[0] = new Butelka(10, 20);
        butelkas[1] = new Butelka(8, 20);
        butelkas[2] = new Butelka(19,20);

        System.out.println("Butelka0 "+butelkas[0].getIleLitrow());
        System.out.println("Butelka1 "+butelkas[1].getIleLitrow());
        System.out.println("Butelka2 "+butelkas[2].getIleLitrow());

        butelkas[0].wlej(4);
        butelkas[2].wylej(3);

        System.out.println("\n");
        System.out.println("Butelka0 "+butelkas[0].getIleLitrow());
        System.out.println("Butelka1 "+butelkas[1].getIleLitrow());
        System.out.println("Butelka2 "+butelkas[2].getIleLitrow());

        butelkas[0].przelej(5,butelkas[2]);

        System.out.println("\n");
        System.out.println("Butelka0 "+butelkas[0].getIleLitrow());
        System.out.println("Butelka1 "+butelkas[1].getIleLitrow());
        System.out.println("Butelka2 "+butelkas[2].getIleLitrow());

    }
}
