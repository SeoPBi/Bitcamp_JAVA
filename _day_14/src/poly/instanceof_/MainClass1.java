package poly.instanceof_;

import java.util.concurrent.Callable;

public class MainClass1 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.showInfo();

        Student student = new Student("난학생", 1);

        Human human2 = new Human("난사람", 12);
        human2.showInfo();

        Cat cat = new Cat("냥이", 3);
        cat.Meow();

        System.out.println(human1 instanceof  Human);
        System.out.println(student instanceof  Human);

        System.out.println("-------------------------------");


        Cup cup1 = new Cup("일반컵", 5000);
        cup1.showInfo();

        System.out.println("-------------------------------");

        Cup cup2 = new Cup();
        cup2.showInfo();
    }
}
