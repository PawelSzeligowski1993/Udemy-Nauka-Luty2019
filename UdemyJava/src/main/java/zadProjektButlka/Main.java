package zadProjektButlka;

import zadProjektButlka.Butelka.*;
import zadProjektButlka.projekt.Drukowanie;
import zadProjektButlka.projekt.ZapisOdczyt;

import javax.imageio.IIOException;
import java.io.IOException;
import java.util.Arrays;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        boolean czywyjsc = false;
        boolean czywyjsc1 = false;
        boolean czywyjsc3 = false;

        boolean czywyjsc11 = false;
        boolean czywyjsc12 = false;
        boolean czywyjsc13 = false;

        double wylIle;
        double wleIle;
        double przelIle;

        Scanner scanner = new Scanner(System.in);
        final double metalowaPojemność = 20;
        final double plastikowaPojemność =25;
        final double porcelanowaPojemność = 10;
        final double szklanaPojemniść = 15;

        Butelka[] butelki = new Butelka[8];
        butelki[0] = new MetalowaButelka(0,metalowaPojemność, 5, 5, "Aluminium");
        butelki[1] = new MetalowaButelka(1,metalowaPojemność, 5, 5, "Aluminium");
        butelki[2] = new PlastikowaButelka(2,plastikowaPojemność, 5, 1, "PET", "CocaCola");
        butelki[3] = new PlastikowaButelka(3,plastikowaPojemność, 5, 1, "PET", "CocaCola");
        butelki[4] = new PorcelanowaButelka(4,porcelanowaPojemność, 5, 4, "Porcelana Angielska",
                "EnglishPorcelain", Jakość.WYSOKA);
        butelki[5] = new PorcelanowaButelka(5,porcelanowaPojemność, 5, 4, "Porcelana Chińska",
                "ChinaPorcelain", Jakość.WYSOKA);
        butelki[6] = new SzklanaButelka(6,szklanaPojemniść, 5, 4, "Szkło", "Pepsi", true);
        butelki[7] = new SzklanaButelka(7,szklanaPojemniść, 5 , 4, "Szkło", "Pepsi", true);




        System.out.println("Program jest Symulacją układu dolewania, wylewania oraz przelewania cieczy z różnych butelek");
        System.out.println("Do wyboru są następujące butelki:");
        for (Object x : butelki) {
            System.out.println(x);
        }
//---------------------------- Pętla programu --------------------------------------
        do {
            System.out.println("\nMenum: \n1 = Operacje na butelkach,\n2 = Segregacja butelek,\n3 = Wyświetl/Drukuj burelki," +
                    "\n4 = Wyjście ");
            String znak = scanner.nextLine();
//----------------------------------------------------------------------------------
//--------------- 1 = Operacje na butelkach-----------------------------------------
            if (znak.equals("1")) {
                do {
                    System.out.println("Operacje na butelkach : \n1 = Wylej,\n2 = Wlej," +
                            "\n3 = Przelej,\n4 = Powrót ");
                    String znak1 = scanner.nextLine();

                    //--------------- 1= Wylewanie -----------------------------
                    if (znak1.equals("1")) {
                        int numerWyl;
                        System.out.println("Wylewanie. Podaj numer butelki(0-7)");
                        numerWyl = scanner.nextInt();
                        if (numerWyl>=0 && numerWyl<=7){
                            System.out.println("Podaj ilość którą chcesz wylać");
                            wylIle = scanner.nextDouble();
                            switch (numerWyl){
                                case 0:
                                    butelki[0].wylej(wylIle);
                                    break;
                                case 1:
                                    butelki[1].wylej(wylIle);
                                    break;
                                case 2:
                                    butelki[2].wylej(wylIle);
                                    break;
                                case 3:
                                    butelki[3].wylej(wylIle);
                                    break;
                                case 4:
                                    butelki[4].wylej(wylIle);
                                    break;
                                case 5:
                                    butelki[5].wylej(wylIle);
                                    break;
                                case 6:
                                    butelki[6].wylej(wylIle);
                                    break;
                                case 7:
                                    butelki[7].wylej(wylIle);
                                    break;
                            }
                        } else  {
                            System.out.println("Zły numer");
                        }
                        czywyjsc1 = false;
                    }
                    //--------------- 2 = Dolewanie -----------------------------
                    else if (znak1.equals("2")) {
                        int numerWle;
                        System.out.println("Dolewanie. Podaj numer butelki(0-7)");
                        numerWle = scanner.nextInt();
                        if (numerWle>=0 && numerWle<=7){
                            System.out.println("Podaj ilość którą chcesz dolać");
                            wleIle = scanner.nextDouble();
                            switch (numerWle){
                                case 0:
                                    butelki[0].wlej(wleIle);
                                    break;
                                case 1:
                                    butelki[1].wlej(wleIle);
                                    break;
                                case 2:
                                    butelki[2].wlej(wleIle);
                                    break;
                                case 3:
                                    butelki[3].wlej(wleIle);
                                    break;
                                case 4:
                                    butelki[4].wlej(wleIle);
                                    break;
                                case 5:
                                    butelki[5].wlej(wleIle);
                                    break;
                                case 6:
                                    butelki[6].wlej(wleIle);
                                    break;
                                case 7:
                                    butelki[7].wlej(wleIle);
                                    break;
                            }
                        }else  {
                            System.out.println("Zły numer");
                        }
                        czywyjsc1 = false;

                    }
                    //--------------- 3 = Przelewanie -----------------------------
                    else if (znak1.equals("3")) {

                        int numerPrzel1;
                        System.out.println("Przelewanie: Podaj numer butelki z której(0-7)");
                        numerPrzel1 = scanner.nextInt();
                        int numerPrzel2;
                        System.out.println("Przelewanie: Podaj numer butelki do której(0-7)");
                        numerPrzel2 = scanner.nextInt();

                        if (numerPrzel1>=0 && numerPrzel1<=7 && numerPrzel2>=0 && numerPrzel2<=7){
                            System.out.println("Podaj ilość którą chcesz Przelac");
                            przelIle = scanner.nextDouble();
                            //-----------------------------
                            Butelka doKtórej = null;
                            switch (numerPrzel2){
                                case 0:
                                    doKtórej = butelki[0];
                                    break;
                                case 1:
                                    doKtórej = butelki[1];
                                    break;
                                case 2:
                                    doKtórej = butelki[2];
                                    break;
                                case 3:
                                    doKtórej = butelki[3];
                                    break;
                                case 4:
                                    doKtórej = butelki[4];
                                    break;
                                case 5:
                                    doKtórej = butelki[5];
                                    break;
                                case 6:
                                    doKtórej = butelki[6];
                                    break;
                                case 7:
                                    doKtórej = butelki[7];
                                    break;
                            }

                            // --------------------------
                            if (doKtórej != null){
                            switch (numerPrzel1){
                                case 0:
                                    butelki[0].przelej(przelIle,doKtórej);
                                    break;
                                case 1:
                                    butelki[1].przelej(przelIle,doKtórej);
                                    break;
                                case 2:
                                    butelki[2].przelej(przelIle,doKtórej);
                                    break;
                                case 3:
                                    butelki[3].przelej(przelIle,doKtórej);
                                    break;
                                case 4:
                                    butelki[4].przelej(przelIle,doKtórej);
                                    break;
                                case 5:
                                    butelki[5].przelej(przelIle,doKtórej);
                                    break;
                                case 6:
                                    butelki[6].przelej(przelIle,doKtórej);
                                    break;
                                case 7:
                                    butelki[7].przelej(przelIle,doKtórej);
                                    break;
                            }
                            }
                        } else {
                            System.out.println("Zły numer");
                        }
                        czywyjsc1 = false;

                    }
                    //--------------- 4 = Powrót -----------------------------
                    else if (znak1.equals("4")) {
                        czywyjsc1 = true;
                    } else {
                        System.out.println("Zła odpowiedż");
                    }

                } while (czywyjsc1 == false);
                //czywyjsc = false;
            }
//------------------------------------------------------------------------------------
// ---------------- 2 = Segregacja butelek -------------------------------------------
             else if (znak.equals("2")) {

                Arrays.sort(butelki);
                //czywyjsc = false;
            }
//-------------------------------------------------------------------------------------
// ---------------- 3 = Wyświetl/Drukuj butelki ---------------------------------------
            else if (znak.equals("3")) {
                String znak3;
                do {
                    System.out.println("1 = Text, 2 = Graficznie, 3 = Powrót");
                    znak3 = scanner.nextLine();
                    if (znak3.equals("1")) {
                        System.out.println("Stan Butelek:");
                        for (Object x : butelki) {
                            System.out.println(x);
                        }
                        String znak31;
                        System.out.println("Czy zapisać ? 1 = tak, 2 = Nie");
                        znak31 = scanner.nextLine();
                        if (znak31.equals("1")){
                            ZapisOdczyt zapisOdczyt = new ZapisOdczyt();
                            for (Object x : butelki) {
                                String text = x.toString();
//                                System.out.println(text);
                                zapisOdczyt.zapis(text);
                            }
                        }

                        czywyjsc3 = false;
                    }
                    else if (znak3.equals("2")) {

                        Drukowanie d = new Drukowanie();
                        for (int i = 0; i <butelki.length ; i++) {
                            d.drukowanie(butelki[i]);
                        }
                        czywyjsc3 = false;
                    }else if(znak3.equals("3")){
                        czywyjsc3 = true;
                    }else {
                        System.out.println("Zły znak");
                        czywyjsc3 = false;

                    }
                    //czywyjsc = false;
                } while (czywyjsc3 == false);
            }
//--------------------------------------------------------------------------------------
//--------------------- 4 = Wyjście ----------------------------------------------------
             else if (znak.equals("4")) {
                System.out.println("Dowidzenia");
                czywyjsc = true;
            } else {
                System.out.println("Zły znak");
                //czywyjsc = false;
            }


        } while (czywyjsc == false);


    }
}




