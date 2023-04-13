import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            int[] alphabet = new int[26];
            for (int j = 0; j < 26; j++) {
                alphabet[j] = -1;
            }


            boolean isGroupWord = true;

            for (int j = 0; j < word.length(); j++) {
                int idx = word.charAt(j) - 'a';

                if (alphabet[idx] != -1) {
                    if (j - alphabet[idx] > 1) {
                        isGroupWord = false;
                        break;
                    }
                }
                alphabet[idx] = j;
            }
            if (isGroupWord) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

}
