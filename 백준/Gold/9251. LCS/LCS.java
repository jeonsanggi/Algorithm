import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));

        String word = reader.readLine();
        String otherWord = reader.readLine();

        int result = solution(word, otherWord);
        System.out.println(result);
    }

    private static int solution(String word, String otherWord) {
        //dp 초기화
        int[][] dp = new int[word.length() + 1][otherWord.length() + 1];
        char[] wordCharArray = word.toCharArray();
        char[] otherWordCharArray = otherWord.toCharArray();

        for (int i = 1; i <= wordCharArray.length; i++) {
            for (int j = 1; j <= otherWordCharArray.length; j++) {
                // 문자열이 같은지 아닌지
                if (wordCharArray[i - 1] == otherWordCharArray[j -1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[wordCharArray.length][otherWordCharArray.length];
    }
}
