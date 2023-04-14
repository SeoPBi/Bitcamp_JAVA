import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        String[] foods = {"삼겹살","돈카츠","베이징덕","팟씨유","커리"};

        int idx = (int)(Math.random() * 5);
        System.out.println(foods[idx]);

        switch(foods[idx]) {

            case "삼겹살" :
                System.out.println("한식입니다.");
                break;

            case "돈카츠" :
                System.out.println("일식입니다.");
                break;

            case "베이징덕" :
                System.out.println("태국식입니다.");
                break;

            case "팟씨유" :
                System.out.println("태국식입니다.");
                break;

            case "커리" :
                System.out.println("일본식 입니다.");
                break;

            default :
                System.out.println("기타 요리 입니다.");
                break;
        }
    }
}
