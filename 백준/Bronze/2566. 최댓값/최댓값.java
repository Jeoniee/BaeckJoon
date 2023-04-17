
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] pan = new int[10][10];
        int max = 0;
        int x =0, y=0;

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                pan[i][j] = in.nextInt();
                if(max<pan[i][j]){
                    max = pan[i][j];
                    x = i; y=j;
                }
            }

        }
        System.out.println(max);
        System.out.println((x+1)+ " "+(y+1));

    }
}
