package _3_progObiektowe1.modyfikatoryDostepu.pack1;

import _3_progObiektowe1.modyfikatoryDostepu.pack3.Klasa3;
// public pozwala mi importować klase z innego pakunku, gdy usune publick bedzie ona dostepna tylko dla danego pakietu
// publiczna moze byc tylko klasa glowna danej klasy
// private dostepne tylko wewnatrz klasy
// protected


public class Klasa1 {
    public static void main(String[] args) {
        System.out.println(Klasa3.a);



    }
}
