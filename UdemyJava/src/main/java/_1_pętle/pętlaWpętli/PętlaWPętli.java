package _1_pętle.pętlaWpętli;

public class PętlaWPętli {
    public static void main(String[] args) {
        /** Tabliczka Mnożenia
         *    1 2 3 4 5 6 7 8 9 10
         *  2
         *  3
         *  4
         *  5
         *  6
         *  7
         *  8
         *  9
         *  10
         *
         *  && = koniunkcja (1*1=1,0*1=0,1*0=0,0*0=0)
         *  || = Alternatywa(1*1=1,0*1=1,1*0=1,0*0=0
         */

        for (int j = 1; j <= 200; j++) {


            for (int i = 1; i <= 100; i++) {
                if ((i*j)<10){
                System.out.print(i*j + "     ");
                } else if((i*j)>=10 && (i*j)<100 ){
                    System.out.print(i*j + "    ");
                }else if((i*j)>=100  && (i*j)<1000){
                    System.out.print(i*j + "   ");
                }else if((i*j)>=1000  && (i*j)<10000){
                    System.out.print(i*j + "  ");
                }else if((i*j)>=10000){
                    System.out.print(i*j + " ");
                }

            }
            System.out.print("\n");
        }

    }
}
