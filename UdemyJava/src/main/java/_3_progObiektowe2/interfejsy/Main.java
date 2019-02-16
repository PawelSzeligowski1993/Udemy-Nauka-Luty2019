package _3_progObiektowe2.interfejsy;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println(nazwaInterfejsu.PI);

        nazwaInterfejsu a = new Pracownik(1000);
        ((Pracownik) a).getWynagrodzenie();

        System.out.println(nazwaInterfejsu.PI);

        int[] tab = new int[7];

        tab[0] = 3;
        tab[1] = -5;
        tab[2] = 13;
        tab[3] = 100;
        tab[4] = -13;
        tab[5] = 15;
        tab[6] = 55;


        //Metoda sortowania
        Arrays.sort(tab);

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        // Tablica Pracownikow
        Pracownik[] pracowniks = new Pracownik[3];
        pracowniks[0] = new Pracownik(1100);
        pracowniks[1] = new Pracownik(1000);
        pracowniks[2] = new Pracownik(1500);

        System.out.println("\n\nTabla Pracownikow");
        for (Pracownik p: pracowniks){
            System.out.println(p.getWynagrodzenie());
        }

        System.out.println("Compare = "+pracowniks[0].compareTo(pracowniks[1]));
        //To dziala tylko dlatego że nadpisalem metode  compareTo(), ktora zostala zaimplementowana
        Arrays.sort(pracowniks);


        for (Pracownik p: pracowniks){
            System.out.println(p.getWynagrodzenie());
        }

        //odwrotne sortowanie: Collections.reverseOrder
        System.out.println("\n\nTabla Pracownikow - odwrotne sortowanie");

        Arrays.sort(pracowniks, Collections.<Pracownik>reverseOrder());


        for (Pracownik p: pracowniks){
            System.out.println(p.getWynagrodzenie());
        }

    }
}

// jesli chce stworzyc publiczny interface musze zrobic to w pakiecie
// tylko jedna klasa czy interface  może być na klase
// nie mozna zmienic wlasciwosci wartosci z interfejsu
// metody interfejsu sa zarazem publiczne jak i abstrakcyjne - musi zostac nadpisana wklasie ktora ja zaimplementuje
// implementowac mozna wiecej niz 1 interfejs
// nie mozna wielodziedziczyc w Javie, moge extends tylko 1 klase
// Downcasting - rzutowanie w dół

interface nazwaInterfejsu {
    double PI = 3.14; // public static final

    void cos(); //public abstract


}

interface cosik {

}


class Pracownik implements nazwaInterfejsu, cosik, Comparable {
    private double wynagrodzenie;

    public double getWynagrodzenie() {
        return this.wynagrodzenie;
    }

    Pracownik(double wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }


    @Override
    public void cos() {
        System.out.println();
    }

    //
    @Override
    public int compareTo(Object o) {

       Pracownik przyslany =  (Pracownik)o;

       if (this.wynagrodzenie < przyslany.wynagrodzenie){
           return -1;
       }else if (this.wynagrodzenie > przyslany.wynagrodzenie){
           return 1;
       }else
           return 0;

    }
}

class A {

}
//Nie dozwolone rozszerzać o wiecej niz 1 klase
//class Programista extends Pracownik, A{
//
//}