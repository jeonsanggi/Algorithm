import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int v = sc.nextInt();

        for (int num : numbers) {
            if (num == v) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
