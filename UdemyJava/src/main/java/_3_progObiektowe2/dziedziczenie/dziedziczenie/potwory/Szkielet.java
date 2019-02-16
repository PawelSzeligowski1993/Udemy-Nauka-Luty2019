package _3_progObiektowe2.dziedziczenie.dziedziczenie.potwory;

public class Szkielet extends Potwor {

    String typBroni;

    public Szkielet() {
        System.out.println("Domyślny konstruktor z klasy Szkielet");
    }

    public Szkielet(double predkoscchodzenia, double zywotnosc) {
        //Wywolanie konstruktora niedomyslnego z klasy wyzej
        super(predkoscchodzenia, zywotnosc);
        System.out.println("Niedomyslny konstruktor z klasy szkielet z 2 argumentami");
    }

    public Szkielet(double predkoscchodzenia, double zywotnosc, String typBroni) {
        //Wywolanie konstruktora niedomyslnego z klasy wyzej
        super(predkoscchodzenia, zywotnosc);
        this.typBroni = typBroni;
        System.out.println("Niedomyslny konstruktor z klasy szkielet z 3 argumentami");
    }

    @Override
    public void atakuj(){
        super.atakuj();
        /**
         * Bazowe instrukcje  ataku
         */
        System.out.println("To jest metoda atakuj z klasy Szkielet");
    }

    @Override
    protected void opis() {

    }
}
