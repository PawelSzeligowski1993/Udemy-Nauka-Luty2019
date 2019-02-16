// klasy zagnieżdżonych fajnie jest używać gdy chcemy sobie wszystko posegregować i dane klasy będą używane tylko w
// tym jednym Main a nie w innych klasach

package _3_progObiektowe3.klasyzagnieżdżone;

public class Main {
    public static void main(String[] args) {

        KontoBoankowe kontoBoankowe = new KontoBoankowe(1000000);

        System.out.println(kontoBoankowe.getStnaKonta());
        kontoBoankowe.start(5);
        System.out.println(kontoBoankowe.getStnaKonta());
        kontoBoankowe.oplacRachunki(20,40,50);
        System.out.println(kontoBoankowe.getStnaKonta());
    }
}

class KontoBoankowe {

    private double stnaKonta;

    public KontoBoankowe(double stnaKonta) {
        this.stnaKonta = stnaKonta;
    }


    public double getStnaKonta() {
        return stnaKonta;
    }


    void start(double stopa){
        Odsetki odsetki = new Odsetki(stopa);
        odsetki.zmienStanKOnta(stopa);
    }

    void oplacRachunki(double prad, double czynsz, double woda){
        Rachunki rachunki = new Rachunki(prad,czynsz,woda);
        rachunki.oplac(prad,czynsz,woda);

    }


    class Odsetki {
        private double stopaprocentowa;

        public Odsetki(double stopaprocentowa) {
            this.stopaprocentowa = stopaprocentowa;
            this.zmienStanKOnta(stopaprocentowa);
        }

        void zmienStanKOnta(double stopa) {
            double odsetki = (stnaKonta * stopa) / 100;
            stnaKonta += odsetki;
        }

    }

    // -------- Klasa oplata rachunków ----
    class Rachunki{
        //Oplaty Miesieczne
        private double pradOplata;
        private double czynszOplata;
        private double wodaOplata;

        public Rachunki(double pradOplata, double czynszOplata, double wodaOplata) {
            this.pradOplata = pradOplata;
            this.czynszOplata = czynszOplata;
            this.wodaOplata = wodaOplata;
            this.oplac(pradOplata, czynszOplata, wodaOplata);
        }
        void oplac(double pradOplata, double czynszOplata, double wodaOplata){
            stnaKonta -= pradOplata;
            stnaKonta -= czynszOplata;
            stnaKonta -= wodaOplata;
        }

//        void oplacCzyns(double czynszOplata){
//            stnaKonta -=czynszOplata;
//        }
//
//        void oplacWode(double wodaOplata){
//            stnaKonta -=wodaOplata;
//        }


    }


}

