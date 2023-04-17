package has_a;

public class MainClass {
    public static void main(String[] args) {
        // Gun은 new 키워드로 생성해야 Police 생성자에 전달 가능
        Gun gun = new Gun("발터", "36944542");

        Police police = new Police(gun,"나경찰", 180);
        police.shoot();
        police.shoot();
        police.shoot();
        police.shoot();
        police.shoot();
        police.shoot();
        gun.reload();
        police.shoot();
        police.shoot();
    }
}
