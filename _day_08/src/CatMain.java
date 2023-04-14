public class CatMain {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "작살";
        cat1.age = 21;
        cat1.kind = "풰루시안";
        cat1.color = "검정흰색";

        Cat cat2 = new Cat();
        cat2.name = "살작";
        cat2.age = 345;
        cat2.kind = "풰롤시안";
        cat2.color = "흰색검정";

        cat1.showCatInfo();
        System.out.println("------------");
        cat2.showCatInfo();

    }
}

