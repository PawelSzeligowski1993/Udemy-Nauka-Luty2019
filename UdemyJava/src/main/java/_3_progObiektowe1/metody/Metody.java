package _3_progObiektowe1.metody;

public class Metody {
    public static void main(String[] args) {
        int c;
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        Test a = new Test();
        a.wypisz("Paweł", "Szeligowski");
        c = a.dodaj(3,4);
        System.out.println(c);

        double d = a.dodaj(3.13,5.3784);

    }


    static class Test {
        void wypisz(String imie, String nazwisko)
        {
            System.out.println("hahahaha");
            System.out.println(imie + " " + nazwisko);
        }

        // Metoda zwracjaca wynik dodawania
        int dodaj(int a, int b){

            return a+b;
        }

        // przeciązanie metody dodawania
        double dodaj (double a, double b){
            return a +b;
        }

        double dzielenie (double a, double b){
            if(b==0) {
                return 0;
            }else return a/b;
        }
    }
}
