package _5_programowanieFunkcyjne.wyrazeniaLamnda_InterfejsFunkcyjny;

public class Lamda2 {
    public static void main(String[] args) {
        ZachowaniePrzycisk z = () -> {
            System.out.println("Jestem Lamda");
        };

        ZachowaniePrzycisk2 z2 = (int a, int b) ->{
            System.out.println(a+b);
        };

        ZachowaniePrzycisk3 z3 = (int a, int b) ->{
            //System.out.println(a*b);
            return a*b;
        };

        Przycisk p = new Przycisk();
        p.dodajAkcje(z);
        p.dodajAkcje2(5,7,z2);

        int wynikMnozenia;
        wynikMnozenia =  p.dodajAkcje3(5,7,z3);
        System.out.println(wynikMnozenia);



    }
}

@FunctionalInterface
interface ZachowaniePrzycisk
{
    void akcja();
}

interface ZachowaniePrzycisk2{
    void akcja2(int a, int b);
}

interface ZachowaniePrzycisk3{
    int akcja3(int a, int b);
}

class Przycisk
{
    void dodajAkcje(ZachowaniePrzycisk z){
        z.akcja();
    }

    void dodajAkcje2(int a, int b ,ZachowaniePrzycisk2 z2){
        z2.akcja2(a, b);
    }

    int dodajAkcje3(int a, int b, ZachowaniePrzycisk3 z3){
        return z3.akcja3(a,b);

    }


}
