package _3_progObiektowe1.referencje;

public class Porównanie2String {
    public static void main(String[] args) {
        String imie = "Arkadiusz";
        String imie2 = "Arkadiusz";

        // do porównia equals lepiej niz ==
        if (imie.equals(imie2)){
            System.out.println("Sa równe = metoda equals");
        }

        if(imie == imie2) {
            System.out.println("Sa rowne metoda "=="");
        }
    }
}
