package _2_tablice.jednowymiarowe;

public class Tablice {
    public static void main(String[] args) {

        int[] tab = new int[5];

        //tab = new int[5];
        tab[0] = 20;
        tab[1] =7;
        tab[2]= 27;
        tab[3]= 27;
        tab[4]= 27;

        System.out.println(tab[0]);

        int[] tab2 ={4, 14, 4, 412, 1254, 512};

        int[] tab3 = {tab[0]+tab2[0],tab[1]+tab2[1],tab[2]+tab2[2],tab[3]+tab2[3],tab[4]+tab2[4]};

        for (int x: tab3) {
            System.out.println(x);
        }

        System.out.println("tab.lenght = "+tab.length+" tab2.lenght =  "+tab2.length+" tab3.lenght = "+tab3.length);

    }
}
