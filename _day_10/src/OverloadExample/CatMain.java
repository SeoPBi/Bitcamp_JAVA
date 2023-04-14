package OverloadExample;

public class CatMain {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        System.out.println(cat1.name);
        System.out.println(cat1.kind);

        System.out.println("--------------------");

        Cat cat2 = new Cat();
        cat1.call();

        System.out.println("--------------------");

        Cat cat3 = new Cat();
        cat2.call("냥냥");
    }
}
