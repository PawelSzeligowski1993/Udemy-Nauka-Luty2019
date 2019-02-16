package _3_progObiektowe3.klasyzagnieżdżone;

public class KlasyZgnieżdżone {
    public static void main(String[] args) {

        A zewnętrzna = new A();

        A.B tmp = zewnętrzna.new B();
    }
}


//Mam dostemp do tego co jest zewnątrz, ale nie do wnętrza równoległej klasy
// ale jak stworze obiekt to juz tak
class A{
    A(){
        System.out.println("Jestem z klasy zewnętrznej");
    }
    class B
    {
        B(){
            System.out.println("Jestem z klasy zagnieżdzonej ");
        }

        void cos(){
            test = 5;
        }

        private int tmp;
    }

    class C{
        C(){
            System.out.println("Jestem z klasy zagnieżdżonej C");
        }
    }

    void cos2(){
        // tmp =2 // nie moge
    }

    private int test;
}