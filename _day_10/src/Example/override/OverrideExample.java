package Example.override;

import java.util.Scanner;

public class OverrideExample {
    public static void main(String[] args) {
            // 학생 클래스의 인스턴스를 생성해주세요
            Student student = new Student();
            student.name = "신씨";
            student.age = 320;
            student.major = "전기공학";
            student.자기소개하기();
            student.코딩하기();

            System.out.println("----------------");

            Programmer programmer = new Programmer();
            programmer.name = "박씨"; // 상속
            programmer.age = 354; // 상속
            // major 변수는 Human에 없고, Student에 있어서 상속 안됨
            programmer.hsLang = "hs언어 ";
            programmer.자기소개하기(); // 상속
            programmer.코딩하기();
    }
}
