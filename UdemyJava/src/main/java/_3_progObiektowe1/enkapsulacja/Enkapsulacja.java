package _3_progObiektowe1.enkapsulacja;

public class Enkapsulacja {

    public static void main(String[] args) {
        /**
         * Enkapsulacja (hermetyzacja) - pakowanie właściwości w taki sposób , aby nie było do nich bezpośredniego
         *                               dostępu z innych klas.
         */

        KontoBankowe oszczednosciowe = new KontoBankowe();
        //oszczednosciowe.saldo = 1000000000;

        oszczednosciowe.setSaldo(100);

        if(oszczednosciowe.wyplata(4)){
            System.out.println("Wyplacono");
            System.out.println(oszczednosciowe.getSaldo());
        }else {
            System.out.println("Za malo kasy");
            System.out.println(oszczednosciowe.getSaldo());
        }

        oszczednosciowe.wyplac(899);
        System.out.println(oszczednosciowe.getSaldo());

//        oszczednosciowe.setSaldo(10);
//        oszczednosciowe.wyplata(4);
//        System.out.println(oszczednosciowe.getSaldo());
    }
}

class KontoBankowe
{
    private int saldo;

    public KontoBankowe(){
        saldo =1000;
}

    int getSaldo(){
        return saldo;
    }

    void setSaldo(int saldo){
        /**
         * warunki
         *
         * jezeli warunki zostaly spelnione r
         *
         * return true
         */

        this.saldo = saldo;

    }

    boolean wyplata (int ile){

        if(saldo<ile){
            return false;
        }else
            setSaldo(saldo-ile);

        return  true;
    }

    boolean wyplac (int ile)
    {
        setSaldo(saldo +ile);
        return true;
    }
}
