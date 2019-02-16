package _3_progObiektowe3.obslugaWyjatków;

public class Wyjatki {
    public static void main(String[] args) throws Exception{

        int a=12;

        //throw - rzucanie wyjątkiem

        try {

            if (a == 10) {
                throw new MojWyjatek("A = 10, grzeszysz");
            }else if(a==12){
                throw new MojWyjatek("A=12, jeszcze bardziej grzeszysz");
            }
        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }




        try {
            System.out.println(5/0);
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Powstal wyjatek" + ex.getMessage());
        }finally {
            System.out.println("Coś co zawsze zostanie wywołane");
        }
        System.out.println("Cokolwiek");
    }



}

class MojWyjatek extends Exception
{


    public MojWyjatek(String string){
        super(string);
    }
}

/**
 * try
 * {
 *     //INSTRUKCJE KTORE POTENCJALNIE MOGA SPOWODOWAC BLAD
 * }
 * catch(Nazwa zwróconego Wyjatku NazwaZmiennej)
 * {
 *     //INSTRUKCJE OBSLUGUJACE ZLAPANY WYJATEK
 * }
 *
 */
