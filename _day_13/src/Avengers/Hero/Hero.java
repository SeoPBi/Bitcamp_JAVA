package Avengers.Hero;

import Avengers.Enemay.Enemy;

public class Hero {
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }


    public void setHp(int hp) {
        this.hp = hp;
    }


    private String name;
    private int hp;
    private int atk;

    public Hero(String name, int hp, int atk) {
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

    public void attack(Enemy enemy) {
        enemy.setHp(enemy.getHp() - this.atk);
        System.out.println(this.name + "이(가) 공격했다. " + enemy.getName() + " 체력 감소");

    }
}
