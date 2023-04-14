public class BasketballPlayerMain {
    public static void main(String[] args) {
        // 농구선수를 둘 만들어 주세요.
        // 하나는 덩크슛에 성공하게, 하나는 실패하게

        BasketballPlayer b1 = new BasketballPlayer("신현섭1", 170, 345, 300000);
//        b1.name = "신현섭1";
//        b1.height = 170;
//        b1.age = 345;
//        b1.salary = 30000000;
        b1.showInfo();
        b1.dunkShoot();

        System.out.println("----------------");

        BasketballPlayer b2 = new BasketballPlayer("신현섭2", 199, 452,400000);
//        b2.name = "신현섭2";
//        b2.height = 199;
//        b2.age = 452;
//        b2.salary = 40000000;
        b2.showInfo();
        b2.dunkShoot();


    }
}
