package _5_programowanieFunkcyjne.wyrazeniaLamnda_InterfejsFunkcyjny;
/**
 * () -> {};
 * 1) Lamda może wykonywać rózne działąnia
 * (int a, int b) -> a +b;
 * 2) nie trzeba okreslac typów zmiennych, ale jest to nie zalecane
 * (a, b) -> a + b;
 * () -> a + b;
 * 3) Lamda może coś zwracać
 * () -> {return a + b)
 * 4) lamda może wykonywać puste równania
 * () -> System.out.println("Coś");
 * 5) wyrażenie lambda mozemy przypisać do jakiejs zmiennej
 * int s = (a,b)  -> a + b;
 * !!! Do zainicjalizowania wyrzen lamda potrzebny jest interface !!!
 * !!! Interface musi miec tylko 1 metodę abstrakcyjną !!!
 * !!! Interfejs jest funkcjonalny
 * Zbyt wiele Lambd zmniejsza czytelność
 */

// Lmda to skrócony zapis klasy Anoinmowej
// Lamda słóży do zaimplementowania pojednyńczych zachowań
// Wrażenia lamda są to funkcje anonimowe nie nazwane -  nie mają zadnej deklaracji
// Stosuje je się po to zeby korzystać z metody abstrakcyjnej nie przysłaniając jej
// Moge miec wiele metod o tej samej nazwie (przeciążanie) ale muszą one różnić się typami
//zwracanymi, lub ilośćią argumentów, lub lub typami argumentów - Lambda pozwala użyć jedną wspólną
//metode abstrakcyjną na wiele sposobów bez koniecznosci nadpisywania metod
public class Main {
    public static void main(String[] args) {
        //Jedna metoda może zostać użyta do wielu wyrażen Lamd
        //----------Lamda ------------------------
        KalkulatorInterface dodawanie = (a,b) -> a + b;
        KalkulatorInterface odejmowanie = (x,y) -> x-y;
        KalkulatorInterface pomnoz = (a,b) -> a * b;

        //------------Bez Lamda---------------------
        KalkulatorInterface k = new KalkulatorInterface() {
            @Override
            public int oblicz(int a, int b) {
                return a+b;
            }
        };

        KalkulatorInterface k2 = new KalkulatorInterface() {
            @Override
            public int oblicz(int a, int b) {
                return a-b;
            }
        };
        //-------------------------------------------------------

        System.out.println(dodawanie.oblicz(4,5));
        System.out.println(odejmowanie.oblicz(8,3));
        System.out.println(pomnoz.oblicz(4,4));

    }
}

