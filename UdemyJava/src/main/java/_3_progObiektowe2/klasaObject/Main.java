package _3_progObiektowe2.klasaObject;

public class Main {
    public static void main(String[] args) {
        //Object a = new Punkt(4,50);
        Punkt punkt = new Punkt(4,10);
        Punkt punkt1 = new Punkt(10,15);
        Punkt punkt2 = new Punkt(4,10);
        // każda klasa, każdy obiekt dziedziczy po klasie Object

        // getClass - wypisanie nazwy klasy
        System.out.println(punkt.getClass());

        // equals
        System.out.println("equals");
        System.out.println(punkt.equals(punkt2));

        Object[] punkty = new Punkt[4];

        punkty[0] = new Punkt(2,8);
        punkty[1] = new Punkt(4,8);
        punkty[2] = new Punkt(7,8);
        punkty[3] = new Punkt(88,8);

        for (int i = 0; i<punkty.length; i++)
        {
            System.out.println(punkty[i]);
        }

    }
}

class Punkt
{
    private int x;
    private int y;


    Punkt(){

    }

    Punkt(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o)
    {
        Punkt przyslany = (Punkt)o;
        //sprawdzenie czy isnieje taki object
        if (o == null)
            return false;
        //sprawdzenie czy porownywane sa 2 takie same obiekty
        if (this == o)
            return true;
        //sprawdzenie czy porownywane sa 2 takie same klasy
        if (this.getClass() != o.getClass())
            return false;

    // przez this odwolamy sie do "punkt", o jest "punkt2"
        return this.x == przyslany.x && this.y == przyslany.y;
    }

    @Override
    public String toString(){
        return "aaaa";
    }
}
