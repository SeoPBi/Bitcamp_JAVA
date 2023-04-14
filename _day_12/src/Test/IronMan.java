package Test;

public class IronMan {

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk( ) {
        System.out.println("아이언맨이 공격하였습니다.");
        return atk;
    }

    public void setName() {
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

    public IronMan() {
        this.name = "아이언맨";
        this.hp = 20;
        this.atk = 5;
    }

    public void showStatus() {
        System.out.println("이름 : " + this.name);
        System.out.println("체력 : " + this.hp);
        System.out.println("공격력 : " + this.atk);
        System.out.println("-----------------------");
    }

    public void hunt(Hurk hurk) {

    }
}
