package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FlipWord {

    public String[] solution(String[] words) {

        return Arrays.stream(words).map(word -> {
            StringBuffer sb = new StringBuffer(word);
            return sb.reverse().toString();
        }).toArray(String[]::new);
    }

    public static void main(String[] args) throws IOException {

        FlipWord T = new FlipWord();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        String[] words = new String[cnt];

        for (int i = 0; i < cnt; i++) {
            words[i] = br.readLine();
        }

        String[] answers = T.solution(words);

        for (String answer : answers) {
            System.out.println(answer);
        }
    }
}
