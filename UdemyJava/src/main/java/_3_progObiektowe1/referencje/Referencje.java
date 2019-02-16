package _3_progObiektowe1.referencje;

public class Referencje {
    public static void main(String[] args) {
        int a = 53;
        int b =a;

        b = 30;

        System.out.println(a);

        Test x = new Test(); // pod x nie znajduje sie zadna  wartosc zwykla tylko ADRES
        Test y = x;

        y.a = 40;

        System.out.println(x.a);
    }
}

class Test{
    int a = 20;
}
