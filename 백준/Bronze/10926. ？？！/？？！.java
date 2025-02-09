
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final String SURPRISE_EXPRESSION = "??!";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String id = reader.readLine();
        String result = id.concat(SURPRISE_EXPRESSION);
        System.out.println(result);
    }
}
