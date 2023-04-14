package OverloadExample;

public class Cat {
    public String name;

    public String kind;

    public Cat() { // void생성자 : 파라미터에 입력된 자료가 없는 경우
        kind = "품종을 적지 않았습니다.";
        name = "이름을 입력하지 않았습니다.";
    }

    public Cat(String k, String n) { // String, String 생성자
        kind = k;
        name = n;
        System.out.println("지금부터 이 아이의 이름은 " + n + " 입니다.");
    }

    public void call() { // void 파라미터 메소드
        System.out.println("야옹아 이리와");
    }

    public void call(String name) { // String 파라미터 메서드
        System.out.println(name + "아 이리와");
    }
}
