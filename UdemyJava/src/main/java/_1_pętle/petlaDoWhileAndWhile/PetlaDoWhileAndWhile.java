package _1_pętle.petlaDoWhileAndWhile;

public class PetlaDoWhileAndWhile {
    public static void main(String[] args) {
        String[] kursyProgramowania =
                {
                        "Java",
                        "Java Aplikacje",
                        "Java Strumienie",
                        "Java Aspekty Zaawansowane",
                        "Java Android",
                        "C#",
                        "C# Tworzenie Aplikacji"
                };
        int i = 0;

        // while

        // zostanie wykonana gdy warunek jest spełniony
        while (i <kursyProgramowania.length ){
            if(i==0){
                System.out.println("Pętla While");
            }
            System.out.println(kursyProgramowania[i]);
            i++;
        }


        //wykona się zawsze 1 raz i później kolejny gdy warunek jest spełniony
        int j = 0;

        do {
            if (j == 0 ){
                System.out.println("\nPętla do{}while()");
            }
            System.out.println(kursyProgramowania[j]);
            j++;
        }while (j<kursyProgramowania.length);
    }
}
