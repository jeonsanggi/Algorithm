package inflearn;

import java.util.Scanner;

public class LargeNumber {

    public void solution(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if (i == 0 || numbers[i - 1] < numbers[i]) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        LargeNumber T = new LargeNumber();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        T.solution(numbers);

    }
}
