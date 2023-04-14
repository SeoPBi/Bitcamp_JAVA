public class CarMain {
    public static void main(String[] args) {
        // 자동차를 한 대 생성해주시고
        // 값은 연료 100, 속도 0, 나머지 요소는 자율적으로 초기화
        // 엑셀 3번 밟고, 계기판 조회, 브레이크 2번 밟고 계기판 조회
        // 아래에 작성해주세요.

        Car c1 = new Car("부릉부릉",2,0,"현섭",100);

        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.showStatus();
        System.out.println("-----------");
        c1.break_();
        c1.break_();
        c1.showStatus();

    }
}
