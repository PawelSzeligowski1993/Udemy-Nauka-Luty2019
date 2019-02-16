package _4_StrumienieOperacjeNaPlikach.OdczytZapis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Plik2 {
    public static void main(String[] args) throws IOException {

        Pracownik[] pracowniks = new Pracownik[8];
        pracowniks[0]=new Pracownik("Karol","Pierwszy");
        pracowniks[1]=new Pracownik("Kamil","Drugi");
        pracowniks[2]=new Pracownik("Karol","Trzeci");
        pracowniks[3]=new Pracownik("Adam","Czwarty");
        pracowniks[4]=new Pracownik("Wacław","Piąty");
        pracowniks[5]=new Pracownik("Patryk","Szusty");
        pracowniks[6]=new Pracownik("Michał","Śódmy");
        pracowniks[7]=new Pracownik("Krzysztof","Ósmy");


        for (int i = 0; i <pracowniks.length ; i++) {
            System.out.println(pracowniks[i]);
        }

        //-----------Zapis do pliku -------------------
        String fileName = "plik.txt";
        FileWriter fileWriter = null;
        String textScan;

        try {
            Scanner scanner = new Scanner(System.in);
            fileWriter = new FileWriter(fileName);
            fileWriter.write("Tekst1\n");
            fileWriter.write("Tekst2\n");
            fileWriter.write("Tekst3\n");
            fileWriter.write("Tekst4\n");
            fileWriter.write("Tekst5\n");

            //fileWriter.close(); // zamyka strumien
            //fileWriter.flush();//opróżnienie strumienia

            //Zapis z konsoli
//            System.out.println("Podaj Tekst: , (STOP NOW = Koniec)");
//            for (int i = 0; i <10 ; i++) {
//                textScan = scanner.nextLine();
//                fileWriter.write(textScan+"\n");
//            }

            for (int i = 0; i <pracowniks.length ; i++) {
                fileWriter.write(pracowniks[i]+"\n");
            }





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
class Pracownik{
    String firstname;
    String lastname;

    public Pracownik(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
