package poly;

public class MainClass1 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("전사");
        Rabbit rabbit = new Rabbit();
        Rat rat1 = new Rat();
        Rat rat2 = new Rat();
        Mage mage = new Mage("법사");

        mage.showStatus();
        mage.fireBall(rabbit);
        mage.showStatus();
        mage.fireBall(rat1);
        mage.showStatus();
        mage.hunt(rat1);
        mage.showStatus();
    }
}
