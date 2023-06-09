public class BasketballPlayer {
    public String name; // 농구선의 이름
    public int height; // 키

    public int age; // 나이

    public int salary; // 연봉

    // showInfo를 만들어주세요
    // 호출 시 위 4가지 요소를 콘솔에 찍어줍니다.

    public void showInfo() {
        System.out.println(name);
        System.out.println(height);
        System.out.println(age);
        System.out.println(salary);
    }

    BasketballPlayer(String nM, int he, int ag, int sal) {
        name = nM;
        height = he;
        age = ag;
        salary = sal;
    }

    public void dunkShoot() { // 덩크슛하기 기능
        if(height > 190) {
            System.out.println("덩크슛 성공!");
        } else {
            System.out.println("골대에 않닿음.");
        }
    }
}
