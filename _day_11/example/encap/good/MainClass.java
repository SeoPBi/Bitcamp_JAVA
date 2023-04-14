package encap.good;

public class MainClass {
    public static void main(String[] args) {
        MyBirthday mb = new MyBirthday(2025,16,99);

//        접근제한자 private 이므로 직접 수정 불가
//        mb.day = 1026;
//        mb.month = 96;
//        mb.year = 9999;

        mb.showDateInfo();
    }
}
