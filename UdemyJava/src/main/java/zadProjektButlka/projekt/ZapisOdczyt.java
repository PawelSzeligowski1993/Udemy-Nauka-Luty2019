package zadProjektButlka.projekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ZapisOdczyt {

    private String fileName = "plik.txt";

    FileWriter fileWriter = null; //zapis
    BufferedReader bf = null;     //odczyt


    //----------Zapis--------------
    public void zapis(String text)throws IOException{
        try {
            fileWriter = new FileWriter(fileName,true);
            fileWriter.write(text+"\n");
        }catch (IOException ex){
            System.out.println("Problem z dostępem do pliku");
        }finally {
            if (fileWriter==null){
                System.out.println("Problem");
            }else {
                fileWriter.close();
            }
        }
    }
    //----------Odczyt--------------
    public void odczyt(String text) throws IOException{

        bf = new BufferedReader(new FileReader(fileName));
        String linia = null;

        //Odczyt w petli
        try {
            do {
                linia = bf.readLine();
                if (linia != null){
                    System.out.println(linia);
                }
//                else {
//                System.out.println();
//            }
            } while (linia != null);
        }catch (IOException ex){
            System.out.println("Problem z dostępem do pliku");
        }finally {
            bf.close();
        }
    }
}
