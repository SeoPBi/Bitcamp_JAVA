package Test;

public class Hurk {
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    private String name;
    private int hp;
    private int atk;

    public Hurk() {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }
}
