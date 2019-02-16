package _2_tablice.wielowymiarowe;

public class WielowymiaroweTablice {
    public static void main(String[] args) {
        /*
          --------------------------------
            [0][0]  |  [0][1]  |  [0][2]
          --------------------------------
          --------------------------------
            [1][0]  |  [1][1]  |  [1][2]
          --------------------------------
          --------------------------------
            [2][0]  |  [2][1]  |  [2][2]
          --------------------------------
          --------------------------------
            [3][0]  |  [3][1]  |  [3 ][2]
          --------------------------------
         */

        int[][] tab = new int[4][3];

        tab[0][0] = 25;
        tab[3][2] = 25;

        int[][] tab2 =
                {
                        {  -4,   15,  17 },
                        {   5,   12,  125},
                        { 651, 1256,  -24},
                        {6555,    2,-2444}
                };

        System.out.println(tab.length);
        System.out.println(tab2.length);
        System.out.println(tab2[0].length);
        System.out.println("Math.abs(tab2[0][0]) = "+Math.abs(tab2[0][0]));


        System.out.println("\n\nDrukowanie tablicy tab[][]\n");
        for (int i = 0; i < tab2.length ; i++) {
           // System.out.println("\n------------------\n ");
            for (int j = 0; j < tab2[i].length; j++) {

                if(Math.abs(tab2[i][j])<10){
                    if (tab[i][j]>=0){
                        System.out.print("     "+tab2[i][j]+"|");
                    }else {
                        System.out.print("    "+tab2[i][j]+"|");
                    }
                }else if (Math.abs(tab2[i][j])>=10 && Math.abs(tab2[i][j])<100){
                    if (tab[i][j]>=0){
                        System.out.print("    "+tab2[i][j]+"|");
                    }else {
                        System.out.print("   "+tab2[i][j]+"|");
                    }
                }else if (Math.abs(tab2[i][j])>=100 && Math.abs(tab2[i][j])<1000){
                    if (tab[i][j]>=0){
                        System.out.print("   "+tab2[i][j]+"|");
                    }else {
                        System.out.print("  "+tab2[i][j]+"|");
                    }
                }else {
                    if (tab[i][j]>=0){
                        System.out.print("  "+tab2[i][j]+"|");
                    }else {
                        System.out.print(" "+tab2[i][j]+"|");
                    }
                }
            }
            System.out.println();
            //System.out.print("\n--------------------------------\n");
        }
    }


}
