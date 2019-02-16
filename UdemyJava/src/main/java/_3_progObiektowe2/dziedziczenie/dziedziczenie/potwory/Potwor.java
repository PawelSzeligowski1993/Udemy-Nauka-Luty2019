package _3_progObiektowe2.dziedziczenie.dziedziczenie.potwory;

// nie mozna stworzyc instancji klasy abstrakcyjnej, ona sluzy do dziedziczenia i przesylania dalej
public abstract class Potwor {
    protected double predkoscChodzenia = 10;
    protected double zywotnosc;

    public void atakuj(){
        /*

         */
        System.out.println("To jest metoda atakuj z klasy Potwory");
    }

    // abstrakcyjna metoda nie moze miec ciala, bo nie mozna jej opisać
    // taka metoda nie zbedna ktora nie ma ciala ona musi zostac zaimplementowana wszedzie i moze byc nadpisana
    abstract protected void opis();


    //Konstruktor domyslny

    public Potwor()
    {
        System.out.println("Domyślny konstruktor z klasy potwor");
    }
    public Potwor(double predkoscChodzenia, double zywotnosc)
    {
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;

        System.out.println("Nie domyślny konstruktor z klasy potwor");
    }



}
