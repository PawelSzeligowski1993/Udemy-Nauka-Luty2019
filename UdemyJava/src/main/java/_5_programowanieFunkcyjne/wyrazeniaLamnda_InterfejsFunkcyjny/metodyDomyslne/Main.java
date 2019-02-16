package _5_programowanieFunkcyjne.wyrazeniaLamnda_InterfejsFunkcyjny.metodyDomyslne;

/**
 * default - metody domysle uzywane do implementacji Interface twórców Javy,
 * jesli coś w Javie zostanie ulepszone , metody default automatycznie to implementują i
 * program cały czas działa jak należy.
 */

public class Main {
    public static void main(String[] args) {
        Formula f = (int a) ->{
          return  5;
        };
    }
}
interface Formula{
    double calculate(int a);

    default double sqrt(int a)
    {
        return Math.sqrt(a);
    }
}

class A implements  Formula{

    @Override
    public double calculate(int a) {
       return this.sqrt(a*5);
    }
}
