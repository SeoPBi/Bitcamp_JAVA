package poly.noinheri;

public class Ghost {
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

    public Ghost() {
        this.hp = 100;
        this.atk = 2000;
        this.def = 0;
    }
}
