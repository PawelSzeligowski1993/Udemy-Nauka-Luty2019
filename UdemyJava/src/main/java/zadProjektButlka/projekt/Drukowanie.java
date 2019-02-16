package zadProjektButlka.projekt;

import zadProjektButlka.Butelka.Butelka;

public class Drukowanie {


    public void drukowanie(Butelka ktora){
        //METALOWA    -> 100% = 25
        //PLASTIKOWA  -> 100% = 20
        //SZKLANA     -> 100% = 15
        //PORCELANOWA -> 100% = 10

        double pojemnośćDouble = ktora.getPojemność();
        double zawartośćDouble = ktora.getZawartość();
        double prcntPojemnosci = (zawartośćDouble*100)/pojemnośćDouble ;

        int pojemność = (int)ktora.getPojemność();
        int zawartość = (int)ktora.getZawartość();



        System.out.println("\nButelka nr RfId = " + ktora.getRfId()+"\nZawartość = " + prcntPojemnosci + "%" );
        System.out.println(ktora.getClass());

        //int wartoscGraf = (int)prcntPojemnosci/4;

        //System.out.println("Graficznie = " + wartoscGraf);
        int licznikPl = 0;
        int licznikMet = 0;
        int licznikSzkl = 0;
        //---Plastikowa-------------------------------------
        if (pojemność ==25){
            int wartoscGraf = (int)prcntPojemnosci/4;
            String[][] tabPl = new String[8][5];
            System.out.println("Graficznie = " + wartoscGraf);
            if (wartoscGraf==25){
                System.out.println(" ___ ");
                System.out.println(" |=| ");
                System.out.println("--o--");
            }else {
                System.out.println(" ___ ");
                System.out.println(" |=| ");
                System.out.println("-- --");
            }

            for (int i = 0; i <tabPl.length ; i++) {
                for (int j = 0; j <tabPl[i].length ; j++) {

                    if(j !=0 && j !=4) {

                        if ((25-(licznikPl+1)) <= wartoscGraf) {
                            tabPl[i][j] = "o";
                        } else {
                            tabPl[i][j] = " ";
                        }
                        System.out.print(tabPl[i][j]);
                        licznikPl++;
                    }else {
                        tabPl[i][j] = "|";
                        System.out.print(tabPl[i][j]);
                    }
                }
                System.out.print("\n");
            }
            System.out.print("=====");
            System.out.print("\n");
        }
        //----Metalowa--------------------------------------
        else if(pojemność==20){
            int wartoscGraf2 = (int)prcntPojemnosci/5;
            System.out.println("Graficznie = " + wartoscGraf2);
            String[][] tabMet = new String[6][5];
            if (wartoscGraf2==20){
                System.out.println(" ___ ");
                System.out.println(" | | ");
                System.out.println(" |o| ");
                System.out.println("--o--");
            }else if (wartoscGraf2==19){
                System.out.println(" ___ ");
                System.out.println(" | | ");
                System.out.println(" | | ");
                System.out.println("--o--");
            }else {
                System.out.println(" ___ ");
                System.out.println(" | | ");
                System.out.println(" | | ");
                System.out.println("-- --");
            }

            for (int i = 0; i <tabMet.length ; i++) {
                for (int j = 0; j <tabMet[i].length ; j++) {

                    if(j !=0 && j !=4) {

                        if ((20-(licznikMet+2)) <= wartoscGraf2) {
                            tabMet[i][j] = "o";

                        } else {
                            tabMet[i][j] = " ";
                        }
                        System.out.print(tabMet[i][j]);
                        licznikMet++;
                    }else {
                        tabMet[i][j] = "|";
                        System.out.print(tabMet[i][j]);
                    }
                }
                System.out.print("\n");
            }
            System.out.print("=====");
            System.out.print("\n");
        }
        //-----Szklana-----------------------------------------------
        else if (pojemność==15) {
            int wartoscGraf3 = (int) (prcntPojemnosci / (100 / 15));
            System.out.println("Graficznie = " + wartoscGraf3);
            String[][] tabSzk = new String[5][5];
            System.out.println(" ___ ");
            System.out.println(" |=| ");
            System.out.println("-- --");

            for (int i = 0; i < tabSzk.length; i++) {
                for (int j = 0; j < tabSzk[i].length; j++) {
                    if (j != 0 && j != 4) {

                        if ((15 - licznikSzkl) <= wartoscGraf3) {
                            tabSzk[i][j] = "o";

                        } else {
                            tabSzk[i][j] = " ";
                        }
                        System.out.print(tabSzk[i][j]);
                        licznikSzkl++;
                    } else {
                        tabSzk[i][j] = "|";
                        System.out.print(tabSzk[i][j]);
                    }
                }
                System.out.print("\n");
            }
            System.out.print("=====");
            System.out.print("\n");
        }
        //---Porcelanowa----------------------------------------------
        else if (pojemność==10){
            int wartoscGraf4 = (int)prcntPojemnosci/10;
            System.out.println("Graficznie = " + wartoscGraf4);
            String[][] tabPorc = new String[5][4];
            System.out.println(" __ ");
            System.out.println("_==_");

            for (int i = 0; i <tabPorc.length ; i++) {
                for (int j = 0; j <tabPorc[i].length ; j++) {
                    if (j != 0 && j != 3) {

                        if ((10 - licznikSzkl) <= wartoscGraf4) {
                            tabPorc[i][j] = "o";

                        } else {
                            tabPorc[i][j] = " ";
                        }
                        System.out.print(tabPorc[i][j]);
                        licznikSzkl++;
                    } else {
                        tabPorc[i][j] = "|";
                        System.out.print(tabPorc[i][j]);
                    }
                }
                System.out.print("\n");
            }
            System.out.print("====");
            System.out.print("\n");
        }else {
            System.out.println("Brak instrukcji graficznej dla danej Butelki");
        }
    }
}
