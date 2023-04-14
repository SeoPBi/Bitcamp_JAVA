package OverloadExample;

import Example.override.Human;

public class mainClass {
    public static void main(String[] args) {
        OverloadExample overloadExample = new OverloadExample();
        overloadExample.input(1);
        overloadExample.input(1,2);
        overloadExample.input(3.5,"가나다");
        overloadExample.input("하이");
        overloadExample.input("바이", 99.99);

    }
}
