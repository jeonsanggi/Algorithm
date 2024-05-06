package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlipSpecificCharacters {

    private String solution(String word) {
        int lt = 0;
        int rt = word.length() - 1;

        char[] charArray = word.toCharArray();
        char temp;
        while (lt < rt) {
            if (!Character.isAlphabetic(charArray[lt])) {
                lt++;
                continue;
            }

            if (!Character.isAlphabetic(charArray[rt])) {
                rt--;
                continue;
            }

            temp = charArray[lt];
            charArray[lt] = charArray[rt];
            charArray[rt] = temp;
            lt++;
            rt--;
        }

        return String.valueOf(charArray);
    }


    public static void main(String[] args) throws IOException {

        FlipSpecificCharacters T = new FlipSpecificCharacters();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        System.out.println(T.solution(word));
    }
}
