package _5_programowanieFunkcyjne.wyrazeniaLamnda_InterfejsFunkcyjny.interfejsFunkcyjny2;

import java.util.Arrays;
import java.util.List;

public class TestApp {
    public static void main(String[] args) {

//       // Jest to zapis klasy wewnętrznej który skracany jest przy pomocy Lamdy
//        Sum sum = new Sum() {
//            @Override
//            public int calculate(int a, int b) {
//                return a+b;
//            }
//        };
        Sum sum = (a,b) -> a+b;
        System.out.println(sum.calculate(2,5));

        System.out.println("------------------------");
        Factor factor = a -> a * a;
        System.out.println(factor.factor(8));

        System.out.println("------------------------");
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
//        integerList.forEach(element -> System.out.println(element));
        integerList.forEach(element -> {
            System.out.println(element);
        });


        System.out.println("------------------------");
        integerList.forEach(element -> {
            int x=5;
            element +=5;
            System.out.println(element*10);
        });

        //Pierwszy sposob do odwolania sie do metody bez parametrów
        NothingSpecial nothingSpecial = () -> printMessage();
        //drugi sposob do odwolania sie do metody bez parametrów
        NothingSpecial nothingSpecial1 = TestApp::printMessage;

        nothingSpecial.nothing();

        nothingSpecial1.nothing();
    }

    private static void printMessage(){
        System.out.println("Hello");
    }
}
/**
 *Sa 4 rodzaje do refernencji metod
 *
 */