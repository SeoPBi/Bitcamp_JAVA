package poly;

public class Mage extends Warrior {
    private int mp;
    private int fireBallAtk;

    public Mage(String id) {
        super(id);
        this.mp = 10;
        this.fireBallAtk = 4;
    }

    public void showStatus() {
        super.showStatus();
        System.out.println("마나 : " + this.mp);
        System.out.println("파이어볼 공격력 : " + this.fireBallAtk);
        System.out.println("--------------------");
    }

    public void fireBall(Monster monster) {
        if (this.mp >= 5) {
            System.out.println("파이어볼 발사!");
            this.mp -= 5;
            if (monster.getHp() - this.fireBallAtk <= 0) {
                // 몬스터가 다음 공격에 죽으면 플레이어 경험치 획득
                monster.setAfterAttackHp(this.fireBallAtk);
                showMonsterNowDeadMessage(monster.getName());
                gainMonsterExp(monster.getExp());
            } else {
                // 몬스터가 다음 공격에 죽지 않는다면 반격해 플레이어 체력 차감
                monster.setHp(monster.getHp() - (this.fireBallAtk - monster.getDef()));
                setHpAfterMonsterAttack(monster.getAtk());
                showMonsterCounterAttackMessage(monster.getName());
            }
        } else {
            System.out.println("마나가 부족합니다.");
        }
    }
}
