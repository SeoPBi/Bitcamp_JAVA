package OverloadExample;

import Example.override.Human;

public class HumanMain {
    public static void main(String[] args) {
        // Human을 생성하시되
        // 하나는 void 생성자를 이용해주시고
        Human human1 = new Human();
        System.out.println(human1.name);
        System.out.println(human1.age);

        System.out.println("-------------------");

//        // 다른 하나는 (String, int) 생성자를 이용해주세요.
//        Human human2 = new Human("섭섭", 22);
//        System.out.println(human2.name);
//        System.out.println(human2.age);

    }
}
