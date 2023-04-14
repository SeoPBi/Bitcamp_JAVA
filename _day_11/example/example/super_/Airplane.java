package example.super_;

public class Airplane {

    public String planeCode;
    public int speed;
    public int gas;

    // 속도 0, 연료 100으로 고정, 편명만 입력받는 생성자 정의
    public Airplane(String planeCode) {
       this.planeCode = planeCode;
       this.speed = 0;
       this.gas = 100;
    }

    // 최대 속도를 900으로 설정해주세요. 호출 시 연료는 3차감, 속도 100씩 증가
    public void fly() {
        if(speed < 900 && speed > 0) {
            this.gas -= 3;
            this.speed += 100;
        } else if(speed < 0) {
            System.out.println("!! 연료 부족 !!");
        }
    }

    public void showStatus() {
        System.out.println("편명 : " + this.planeCode);
        System.out.println("속력 : " + this.speed);
        System.out.println("연료 : " + this.gas);
    }
}
