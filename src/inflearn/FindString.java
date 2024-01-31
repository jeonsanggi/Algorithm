package inflearn;

import java.util.Scanner;

public class FindString {
    public int solution(String str, char t) {
        str = str.toLowerCase();
        char t1 = Character.toLowerCase(t);
        return (int) str.chars().filter(c -> c == t1).count();
    }

    public static void main(String[] args) {
        FindString T = new FindString();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.print(T.solution(str, c));
    }
}
