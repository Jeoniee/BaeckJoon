import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
        int C = Integer.parseInt(br.readLine());


        for (int j=0;j<C ;j++ ) {
            //둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고,
            // 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

           
            String[] line = br.readLine().split(" ");
            int N = Integer.parseInt(line[0]);

            int scores[] = new int[N];
            double sum = 0;

            for (int i=0;i<N ;i++ ) {
                scores[i] = Integer.parseInt(line[i + 1]);
                sum += scores[i];
            }

            double avg = sum / N;
            int count = 0;
            for (int i=0;i<N ;i++ ) {
                if (scores[i] > avg) {
                    count++;
                }
            }
            //각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
            double per = (double) count / N * 100;
            System.out.printf("%.3f%%\n", per);
        }


    }
}
