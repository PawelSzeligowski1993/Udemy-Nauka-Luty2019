package _3_progObiektowe2.dziedziczenie;

import _3_progObiektowe2.dziedziczenie.dziedziczenie.potwory.*;

public class Dzedziczenie {
    public static void main(String[] args) {
        //Potwór (super klasa) -> Zombie, Szkielet (subklasy)

        //Potwor potwor = new Potwor(10, 100);

        //Tu jest tworzona instancja i szkieletu i potwora
        //Polimorfizm - przy pomocy 1 nazwy możemy odwolac się do wielu nazw jednoczesnie
        Potwor potwor1 = new Szkielet(10,100);

        potwor1.atakuj();

    }

    void metoda(Potwor potwor)
    {
        // tu moge wstawic i zombie i potwora
    }
}
//Abstrakcja metoda nie moze miec ciala