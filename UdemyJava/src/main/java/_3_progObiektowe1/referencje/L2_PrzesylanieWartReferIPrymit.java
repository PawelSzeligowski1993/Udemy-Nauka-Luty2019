package _3_progObiektowe1.referencje;

public class L2_PrzesylanieWartReferIPrymit {
    public static void main(String[] args) {


        int a = 5;

        Test2 x = new Test2();

        a= x.zmienwartosc(a);

        System.out.println(a);

        Foo foo = new Foo();
        System.out.println(foo.y);
        x.zmienZawarosc(foo);
        System.out.println(foo.y);

    }
}

class Test2{
    int zmienwartosc(int zm){
        zm = zm + 2;
        return zm;
    }
    void zmienZawarosc(Foo zm){
        zm.y = zm.y+40;
    }
}

class Foo
{
    int y = 20;
}


