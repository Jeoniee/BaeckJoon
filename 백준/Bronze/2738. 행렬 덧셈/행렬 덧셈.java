
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        //첫번째 행렬
        int[][] ar = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                ar[i][j]=in.nextInt();
            }
        }

        //두번째 행력
        int[][] br = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
               br[i][j] = in.nextInt();
                System.out.print(ar[i][j] + br[i][j]+" ");
            }
            System.out.println();
        }
    }
}
