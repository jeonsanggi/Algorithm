package inflearn;

import java.util.Scanner;
import java.util.stream.Collectors;

public class CaseConversion {
    public String solution(String str) {
       return str.chars().mapToObj(c -> {
            if (Character.isLowerCase(c)){
                return Character.toString((char)Character.toUpperCase(c));
            } else {
                return Character.toString((char)Character.toLowerCase(c));
            }
        }).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        CaseConversion T = new CaseConversion();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.print(T.solution(str));

    }
}
