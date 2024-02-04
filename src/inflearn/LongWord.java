package inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class LongWord {
    
    public String Solution(String str) {
        String answer = "";
        String[] arr = str.split(" ");
        for (String s : arr) {
            if (answer.length() < s.length()) {
                answer = s;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        LongWord T = new LongWord();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(T.Solution(str));
    }
}
