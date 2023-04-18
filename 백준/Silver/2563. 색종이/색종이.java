
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //도화지 크기
        int[][] paper = new int[100][100];

        //색종이 수
        int origami = in.nextInt();

        //색종이 위치
        for (int i=0;i<origami;i++ ) {
            int x = in.nextInt();
            int y = in.nextInt();

            //색종이 크기 10*10
            for (int j = x; j < x + 10 && j < 100; j++) {
                for (int k = y; k < y + 10 && k < 100; k++) {
                    paper[j][k] = 1;
                }
            }
        }
        //도화지에서 차지하는 면적의 합
        int sum =0;
        for (int i=0;i<100 ;i++ ) {
            for (int j=0;j<100 ;j++ ) {
                if(paper[i][j]==1) sum++;
            }
        }
        System.out.println(sum);

    }
}
