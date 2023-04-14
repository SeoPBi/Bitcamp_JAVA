public class CatMain {

    // 고양이를 조회하는 용도로 사용할 전용 메서드를 작성해보겠습니다
    public static void showCatInfo(Cat cat) {
        System.out.println("고양이 성함 : " + cat.name);
        System.out.println("고양이 연세 : " + cat.age);
        System.out.println("고양이 종류 : " + cat.kind);
        System.out.println("고양이 색 : " + cat.color);

    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "냥냥이";
        cat1.age = 15;
        cat1.kind = "닝겐";
        cat1.color = "분홍색";
        showCatInfo(cat1);
        System.out.println("-----------------");

        Cat cat2 = new Cat();
        cat2.name = "뇽뇽이";
        cat2.age = 14;
        cat2.kind = "뉭겐";
        cat2.color = "초록색";
        showCatInfo(cat2);
        System.out.println("-----------------");

        Cat cat3 = new Cat();
        cat3.name = "낭낭이";
        cat3.age = 13;
        cat3.kind = "농겐";
        cat3.color = "푸른색";
        showCatInfo(cat3);
    }
}
