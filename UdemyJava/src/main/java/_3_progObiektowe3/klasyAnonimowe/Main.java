package _3_progObiektowe3.klasyAnonimowe;

public class Main {
    public static void main(String[] args) {

//        ZachowaniePoWciśnieciu z = new ZachowaniePoWciśnieciu() {
//            @Override
//            public void akcja() {
//                System.out.println("Jestem z klasy anonimowej");
//            }
//        };


        Przycisk p = new Przycisk();
        p.dodajAkcje(new ZachowaniePoWciśnieciu() {
            @Override
            public void akcja() {
                System.out.println("Jestem z klasy anonimowej");
            }
        });
    }
}

interface ZachowaniePoWciśnieciu {
    void akcja();
}

class Przycisk {
    void dodajAkcje(ZachowaniePoWciśnieciu z) {
        z.akcja();
    }
}

//class Przycisk2 implements ZachowaniePoWciśnieciu{
//
//    @Override
//    public void akcja() {
//        System.out.println("Jestem z przycisku 2");
//    }
//}
