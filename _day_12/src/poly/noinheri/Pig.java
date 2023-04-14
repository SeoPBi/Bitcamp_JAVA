package poly.noinheri;

import javax.swing.plaf.PanelUI;

public class Pig {

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setDef(int def) {
        this.def = def;
    }

    private int hp;

    private int atk;

    private int def;

    public Pig() {
        this.hp = 500;
        this.atk = 100;
        this.def = 300;
    }


    // 해당 몬스터 사망 여부를 boolean으로 체크해주는 getter
    public boolean isRatActive() {
        return hp > 0 ? true : false;
    }

    // 공격받은뒤에 살아있는지 죽었는지 체크
    public boolean isAttackedRatActive(int userAtk) {
        return (hp - userAtk) > 0 ? true : false;
    }

    public void setDamagedHp(int userAtk) {
        this.hp = this.hp - (userAtk - this.def);
    }
}
