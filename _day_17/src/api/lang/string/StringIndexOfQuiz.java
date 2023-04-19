package api.lang.string;

import java.util.Scanner;

public class StringIndexOfQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine(); // 입력받은 문장
        String word = sc.nextLine(); // 조회할 단어

        int count = 0;
        int index = sentence.indexOf(word); // 단어가 처음 등장한 인덱스
        while (index != -1) { // 단어가 더 이상 없을 때까지 반복
            System.out.printf("인덱스: %d\n", index);
            count++;
            index = sentence.indexOf(word, index + 1); // 다음 인덱스부터 다시 찾기
        }
        System.out.printf("총 개수: %d\n", count);

    }
}
