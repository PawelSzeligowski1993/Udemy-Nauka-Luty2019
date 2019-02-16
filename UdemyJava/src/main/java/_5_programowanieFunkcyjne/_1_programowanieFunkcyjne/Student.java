package _5_programowanieFunkcyjne._1_programowanieFunkcyjne;

final public class Student {
    private String name;
    private int age;

    private Indeks indeks;

    public Student(String name, int age, String indeksNumber){
        this.name = name;
        this.age = age;
        this.indeks = new Indeks(indeksNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
