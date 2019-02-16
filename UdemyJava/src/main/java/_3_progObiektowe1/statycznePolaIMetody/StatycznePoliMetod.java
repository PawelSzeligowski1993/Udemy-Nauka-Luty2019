package _3_progObiektowe1.statycznePolaIMetody;

//cos co jest static istnieje zawsze i nie moge sie w nim odwolac do czegos niestatycznego
public class StatycznePoliMetod {

    int blabla;
    void test(){
        this.blabla = 5;
    }


    public static void main(String[] args) {

        Matematyka test = new Matematyka();
        double wynik = test.dodaj(10,20);
        System.out.println(wynik);

        double wynik2 = Matematyka.dodaj2(1,2,3);
        System.out.println(wynik2);

        Klient klient = new Klient("Paweł");
        Klient klient1 = new Klient("Arkadiusz");
        Klient klient2 = new Klient("Mariusz");

        System.out.println(klient.id);
        System.out.println(klient1.id);
        System.out.println(klient2.id);



    }
}


class Matematyka
{
    double dodaj (double a, double b)
    {
        return a+b;
    }

    // static pozwala mi na dostanie sie do metody bez tworzenia jej instancji
    static double dodaj2 (double a, double b, double c)
    {
        return a+b+c;
    }
}

class Klient{

    String imie;
    int id = 0;
    // wartosc statyczna wspolna dla wszystkich
    static int nastepneId = 0;

    Klient (String imie)
    {
        this.imie = imie;
        nastepneId++;
        id = nastepneId;
    }
}
