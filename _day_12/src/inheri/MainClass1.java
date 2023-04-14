package inheri;

import inheri.Warrior;

public class MainClass1 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("원펀치맨");
        Rabbit rabbit1 = new Rabbit();
        Rat rat1 = new Rat();

        warrior.showStatus();

        warrior.hunt(rabbit1);

        warrior.showStatus();

        warrior.hunt(rat1);
        warrior.hunt(rat1);

        warrior.showStatus();

    }
}
