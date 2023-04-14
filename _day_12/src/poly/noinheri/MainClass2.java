package poly.noinheri;

public class MainClass2 {
    public static void main(String[] args) {
        // rabbit 인스턴스 2개, warrior 인스턴스 1개를 생성해주세요.
        Rabbit rabbit1 = new Rabbit();

        Rabbit rabbit2 = new Rabbit();

        Warrior warrior = new Warrior("나무꾼");

        // 초기 상태
        warrior.showStatus();

        System.out.println("---------------------");

        //토끼 사냥
        warrior.huntRabbit(rabbit1);

        System.out.println("---------------------");

        // 토끼 사냥 후 상태
        warrior.showStatus();

        // 쥐 인스턴스 생성
        Rat rat = new Rat();

        System.out.println("---------------------");

        // 쥐 공격
        warrior.huntRat(rat);

        System.out.println("---------------------");

        // 쥐 공격 후 상태
        warrior.showStatus();

        System.out.println("---------------------");


    }
}
