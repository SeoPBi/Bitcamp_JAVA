import poly.instanceof_.Human;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("섭섭", 123);
        human1.showInfo();

        System.out.println("-----------------------------");

        Human human2 = new Human();
        human2.showInfo();
    }
}