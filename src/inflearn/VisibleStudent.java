package inflearn;

import java.util.Scanner;


public class VisibleStudent {

    public int solution(int[] studentHeights) {
        int answer = 0;
        int pivot = 0;

        for (int height : studentHeights) {
            if (pivot < height) {
                answer++;
                pivot = height;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        VisibleStudent T = new VisibleStudent();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] studentHeights = new int[n];
        for (int i = 0; i < n; i++) {
            studentHeights[i] = sc.nextInt();
        }

        System.out.println(T.solution(studentHeights));
    }
}
