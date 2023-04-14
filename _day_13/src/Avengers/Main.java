package Avengers;

import Avengers.Enemay.Thanos;
import Avengers.Enemay.Ultron;
import Avengers.Hero.IronMan;

public class Main  {
    public static void main(String[] args) {
        IronMan ironMan = new IronMan();
        Thanos thanos = new Thanos();

        ironMan.showStatus();
        ironMan.attack(thanos);
        thanos.showStatus();
        thanos.attack(ironMan);
        ironMan.showStatus();
    }
}
