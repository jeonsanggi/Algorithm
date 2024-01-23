package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BuyCardOne {

    public static void main(String[] args) throws IOException {
        int P[] = new int[1001];
        int D[] = new int[1001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i<= n; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        };

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                D[i] = Math.max(D[i], D[i-j] + P[j]);
            }
        }

        System.out.println(D[n]);

    }
}
