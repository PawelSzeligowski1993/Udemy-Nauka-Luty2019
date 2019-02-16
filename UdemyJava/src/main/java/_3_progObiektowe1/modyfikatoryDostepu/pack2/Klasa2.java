package _3_progObiektowe1.modyfikatoryDostepu.pack2;

public class Klasa2 {
    public static void main(String[] args) {
        Test.a = 10;
        System.out.println(Test.a);
    }
}

class Test
{
   public static int a=5;
}
