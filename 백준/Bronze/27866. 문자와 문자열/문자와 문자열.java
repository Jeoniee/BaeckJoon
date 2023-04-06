import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String text = br.readLine();

        int index = Integer.parseInt(br.readLine());

        bw.write(text.substring(index - 1, index));
        bw.close();
    
    }
}
