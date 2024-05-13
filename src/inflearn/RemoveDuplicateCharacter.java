package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacter {

    private String solution(String input) {

        Map<Integer, Boolean> hashMap = new HashMap<>();
        return input.chars()
            .filter(value -> {
                boolean result = hashMap.getOrDefault(value, true);
                hashMap.put(value, false);
                return result;
            })
            .mapToObj(ch -> String.valueOf((char) ch))
            .collect(Collectors.joining());

    }

    public static void main(String[] args) throws IOException {

        RemoveDuplicateCharacter T = new RemoveDuplicateCharacter();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        System.out.println(T.solution(input));

    }
}
