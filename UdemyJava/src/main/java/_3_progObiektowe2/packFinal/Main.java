package _3_progObiektowe2.packFinal;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        final double PI = 3.14; // ustwilem stala wartosc, nie moge jej juz zmienic

        Pracownik p = new Pracownik();

        System.out.println(p.dataZatrudnienia);
    }
}
// final jest ustawieniem finalnym, ostatecznym
// klasy final nie moge juz rozszerzyc extends, bezsensem jest robienie klasy final i abstract

abstract class Osoba
{

}

class Pracownik extends Osoba
{
    // przypisanie obecnej daty dla pracownika, jest ona finalna i już jej nie moge zmienic
    final Date dataZatrudnienia = new Date();

    // w oparciu o konstruktory
    final Date dataZatrudnienia2;
    // Domyslny bezparametrowy
    Pracownik(){
        this.dataZatrudnienia2 = new Date();
    }

    Pracownik(Date data){
        this.dataZatrudnienia2 = data;
    }

    final Date getDataZatrudnienia2(){
        return this.dataZatrudnienia2;
    }

}

class Programista extends Pracownik{
    // jesli dowolna metoda z klasy Praownik bedzie final nie moge jej juz nadpisać

//    Date getDataZatrudnienia2(){
//        return this.dataZatrudnienia2;
//    }
}
