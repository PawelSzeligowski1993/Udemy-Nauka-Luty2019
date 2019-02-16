package _5_programowanieFunkcyjne.wyrazeniaLamnda_InterfejsFunkcyjny.interfejsFunkcyjny2;

@FunctionalInterface
public interface Sum {
    int calculate(int a, int b);

}

/**
 * Z paczki interfejsów funkcyjnych
 * Consumer<T> - niczego nie zwraca ale pochłania jedną wartość
 * Supplier<T> - nie przyjmuje żadnych parametrów/argumentów , ale zwraca jakąś wartość określonego typu
 */
