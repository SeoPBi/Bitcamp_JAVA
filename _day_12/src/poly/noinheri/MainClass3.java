package poly.noinheri;

public class MainClass3 {
    public static void main(String[] args) {
        // Rat도 2마리 만들어서 한 마리를 사냥하는 상황도 만들어주세요.
        Rat rat1 = new Rat();
        Rat rat2 = new Rat();

        Warrior w1 = new Warrior("나무꾼");
        w1.showStatus();

        System.out.println("----------------");

        w1.huntRat(rat1);

        System.out.println("----------------");

        w1.showStatus();
    }
}
