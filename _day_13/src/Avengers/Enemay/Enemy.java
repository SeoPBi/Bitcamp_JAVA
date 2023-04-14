package Avengers.Enemay;

import Avengers.Hero.Hero;

public class Enemy {

    public void setHp(int hp) {
        this.hp = hp;
    }

    private String name;
    private int hp;
    private int atk;

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public Enemy(String name, int hp, int atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }

    public void showStatus() {
        System.out.println("이름 : " + this.name);
        System.out.println("체력 : " + this.hp);
        System.out.println("공격력 : " + this.atk);
        System.out.println("-----------------------");
    }

    public void attack(Hero hero) {
        hero.setHp(hero.getHp() - this.atk);
        System.out.println(this.name + "이(가) 공격했다. " + hero.getName() + " 체력 감소");
    }
}
