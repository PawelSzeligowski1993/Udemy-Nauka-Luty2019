package _4_StrumienieOperacjeNaPlikach.OdczytZapis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Plik {
    public static void main(String[] args) throws IOException {
        //-----------Zapis do pliku -------------------
        String fileName = "plik.txt";
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write("Tekst1\n");
            fileWriter.write("Tekst2\n");
            fileWriter.write("Tekst3\n");
            fileWriter.write("Tekst4\n");
            fileWriter.write("Tekst5\n");
            //fileWriter.close(); // zamyka strumien
            //fileWriter.flush();//opróżnienie strumienia
        }catch (IOException ex){
            System.out.println("Problem z dostępem do pliku");
        }finally {
            if (fileWriter==null){
                System.out.println("Problem");
            }else {
                fileWriter.close();
            }
        }
        //------------Odczyt------------------------------
        BufferedReader bf = null;

        try{
            bf = new BufferedReader(new FileReader(fileName));
            String linia = null;
            //odczyt w petli
            do {
                linia = bf.readLine();
                // robimy if żeby pozbyć się null
                if (linia!=null){
                    System.out.println(linia);
                }else {
                    System.out.println("Dupa Dupa Dupa!!!");
                }

            }while (linia != null);
        }catch (IOException ex){
            System.out.println("Problem z dostepem do pliku");

        }finally {
//            if (bf !=null){
//                System.out.println("Problem");
//                bf.close();
//            }else {
//                bf.close();
//            }
            bf.close();
        }
    }
}
