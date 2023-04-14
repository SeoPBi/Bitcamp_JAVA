package poly;

public class Warrior {
    private String id;
    private int hp;
    private int atk;
    private int def;
    private int exp;

    public Warrior(String id) {
        this.id = id;
        this.hp = 20;
        this.atk = 3;
        this.def = 1;
        this.exp = 0;
    }

    public void showStatus() {
        System.out.println("아이디 : " + this.id);
        System.out.println("체력 : " + this.hp);
        System.out.println("공격력 : " + this.atk);
        System.out.println("방어력 : " + this.def);
        System.out.println("경험치 획득 : " + this.exp);
        System.out.println("--------------------");
    }

    // 파라미터로 모든 몬스터의 부모인 Monster를 선언하면
    // 다형성 원리에 의해서 상속 받은 모든 몬스터가 대입 가능합니다.
    public void hunt(Monster monster) {
        // 죽은 몬스터는 교전 불가 및 정료
        if (monster.isInActive()) {
            showMonsterAlreadyDeadMessage(monster.getName());
            return;
        }
        if (monster.getHp() - this.atk <= 0) {
            // 몬스터가 다음 공격에 죽으면 플레이어 경험치 획득
            monster.setAfterAttackHp(this.atk);
            showMonsterNowDeadMessage(monster.getName());
            gainMonsterExp(monster.getExp());
        } else {
            // 몬스터가 다음 공격에 죽지 않는다면 반격해 플레이어 체력 차감
            monster.setHp(monster.getHp() - (this.atk - monster.getDef()));
            setHpAfterMonsterAttack(monster.getAtk());
            showMonsterCounterAttackMessage(monster.getName());
        }
    }

    // 그냥 Warrior 내부에 적어도 되지만 코드 흐름을
    // 메서드 호출로만 제어하기 위해 분리
    public void gainMonsterExp(int monsterExp) {
        this.exp += monsterExp;
    }

    // 상단 Warrior 체력을 차감하는 로직을 메서드로 분리 및 재정의
    public void setHpAfterMonsterAttack(int monsterAtk) {
        if ((monsterAtk > 0) && (monsterAtk - this.def) < 1) {
            this.hp -= 1;
    } else if(monsterAtk == 0)    {
        return;
    } else {
        this.hp -= (monsterAtk - this.def);
    }
}

    public void showMonsterAlreadyDeadMessage(String monsterName) {
        System.out.println("이 " + monsterName + "은(는) 이미 죽어서 교전할 수 없습니다.");
    }

    public void showMonsterNowDeadMessage(String monsterName) {
        System.out.println("이 " + monsterName + "은(는) 죽었습니다.");
    }

    public void showMonsterCounterAttackMessage(String monsterName) {
        System.out.println(monsterName + "이(가) 반격했습니다.");
    }
}

