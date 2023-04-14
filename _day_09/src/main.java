import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cat", "dog", "elephant"};
        for (String word : words) {
            if(word.length() >= 4) {
                System.out.println(word);
            }
        }
    }
}
