package _3_progObiektowe2.pkgInstanceof;


// instanceof pozwala sprawdzic czy cos jest instancja danego obiektu
// Rzutowanie w dół- chcemy zrzutować klasę niżej położoną w hierarhii do klasy wyżej położonej
public class Main {
    public static void main(String[] args) {
        Osoba[] osoba = new Osoba[200];
        osoba[0] = new Pracownik("Paweł", "Szeligowski", 100000);
        osoba[1] = new Student("Adam", "Wysoki", 1200);
        osoba[2] = new Pracownik("Karol", "Zuchwały", 700000);
        osoba[3] = new Student("Kamil", "Pilny",999);


        for (Osoba person: osoba) {


            if (person instanceof Pracownik) {
                ((Pracownik)person).pobierzOpis();
                ((Pracownik)person).pracuj();
                System.out.println("\n");
            } else if (person instanceof Student){
                ((Student)person).pobierzOpis();
                System.out.println("\n");
            }
            else
                break;

        }

//        for (int i = 0; i < osoba.length; i++) {
//            // Wykorzystanie różny od null
////            if (osoba[i] != null) {
////                osoba[i].pobierzOpis();
////            }
//            if (osoba[i] instanceof Osoba) {
//
//                osoba[i].pobierzOpis();
//            }
//             else
//                 break;
//
//        }

    }
}

abstract class Osoba {
    String imie;
    String nazwisko;

    Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    abstract void pobierzOpis();
}

class Pracownik extends Osoba {
    double wynagrodzenie;

    Pracownik(String imie, String nazwisko, double wynagrodzenie) {
        super(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }

    void pobierzOpis() {
        System.out.println("Jestem pracownikiem");
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wynagrodzenie: " + wynagrodzenie);
        //System.out.println("\n");
    }

    void pracuj()
    {
        System.out.println("Ja pracuje");
    }
}

class Student extends Osoba {
    double stypendium;
    Student(String imie, String nazwisko, double stypendium) {
        super(imie, nazwisko);
        this.stypendium = stypendium;
    }

    void pobierzOpis() {
        System.out.println("Jestem studentem");
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Stypendium: "+ stypendium );
       // System.out.println("\n");

    }
}