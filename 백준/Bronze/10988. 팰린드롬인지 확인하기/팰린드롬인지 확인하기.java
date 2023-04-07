import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String pal = br.readLine();

        sb.append(pal);
        System.out.println(sb.reverse().toString().equals(pal) ? 1 : 0);

    }
}
