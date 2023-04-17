package field;

public class MainClass {
    public static void main(String[] args) {
        Person kim = new Person("김자바");
        // kim.nationality = "일본"; // final
        // kim.name = "채자바"; // final
        kim.age = 25;
        System.out.println("국적 : " + kim.nationality); // public이므로 조회가능
        System.out.println("국적 : " + kim.name); // public이므로 조회가능
        System.out.println("국적 : " + kim.age); // public이므로 조회 가능

    }
}
