package _3_progObiektowe3.agregacjaiKompozycja;

public class Agregacja {
    public static void main(String[] args) {

        Pracownik p = new Pracownik("Paweł",new Adres("Sezamkowa", 2));

        System.out.println(p);
    }
}

class Pracownik
{
    //Kompozycja, Praca nie moze istniec bez pracownika
    String imie;
    Adres adres;// -> Agregacja

    public Pracownik(String imie, Adres adres) {
        this.imie = imie;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", adres=" + adres +
                '}';
    }
}


class Adres
{
    String ulica;
    int nrDomu;

    public Adres(String ulica, int nrDomu) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "ulica='" + ulica + '\'' +
                ", nrDomu=" + nrDomu +
                '}';
    }
}

