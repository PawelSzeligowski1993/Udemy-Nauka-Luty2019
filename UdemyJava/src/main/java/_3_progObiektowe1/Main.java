package _3_progObiektowe1;

public class Main {

    static void test(){
        System.out.println("aaaaaaaa");
    }



    public static void main(String[] args) {
        /**
         * obiekty - to pojemniki do przechowywania zmiennych i funkcji tematycznie ze sobą
         *          powiazanuch do dalszego latwiejszego ponownego uzycia
         * klasy - foremki do tworzenia egzemplarzy obiektow
         * // obiekt to taka instancja klasy
         *
         * Properties
         * Metody - funkcje
         *
         */
        test();

        Monitor abc = new Monitor();
        abc.szerokosc = 123;
        Monitor abc2 = new Monitor();
        abc2.wysokosc = 215;
        System.out.println(abc.szerokosc);
        System.out.println(abc2.wysokosc);

        abc.wlacz();
        abc2.wylacz();

        new Punkt();

        // konstruktory sa to zbiory instrukcji ktore maja zostac wykonane podczas gdy tworzymy obiekty

        Punkt punkt = new Punkt();
        System.out.println(punkt.x+" "+punkt.y);

        punkt.x = 5;
        punkt.y = 20;

        System.out.println("p.x " + punkt.x);
        System.out.println("p.y " + punkt.y);

        Punkt2 punkt2 = new Punkt2(10,155);
        System.out.println("punkt2 x = " + punkt2.x+" punkt2 y = "+punkt2.y);

        Punkt2 punkt21 = new Punkt2(14,55);
        System.out.println("punkt21 x = " + punkt21.x+"punkt21 y = " + punkt21.y);

        Punkt3 punkt3 = new Punkt3(19,17);
        System.out.println("punkt3 x = " + punkt3.x+" punkt3 y = " + punkt3.y);
    }

    static class Monitor {
        int szerokosc;
        int wysokosc;


        void wlacz() {
            System.out.println("OFF");
        }

        void wylacz() {
            System.out.println("ON");
        }
    }

    static class Punkt{

        Punkt(){
            System.out.println("Wywolano konstruktor domyslny");
            x = 20;
            y = 20;
        }

        int x;
        int y;

        int x1;
        int y2;
    }

    static class Punkt2{
        int x;
        int y;
        Punkt2(int pierwszy, int drugi){
            System.out.println("Punkt2");
            x=pierwszy;
            y=drugi;
        }
    }

    static class Punkt3
    {
        int x;
        int y;

        Punkt3(int x, int y){
            System.out.println("Wywolano konstruktor Punkt3 z 2 parametrami");
            this.x=x;
            this.y=y;

        }
    }


}
