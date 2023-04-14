package poly.noinheri;

public class MainClass4 {
    public static void main(String[] args) {
        // 전사 객체 생성
        Warrior warrior = new Warrior("이름길게만들다가너무길어서");

        // 돼지 객체 생성
        Pig pig = new Pig();

        // 전사 상태 확인
        warrior.showStatus();

        // 돼지 공격
        warrior.huntPig(pig);

        System.out.println("-----------------------");
        // 돼지 공격 후 전사 상태 확인
        warrior.showStatus();


    }
}
