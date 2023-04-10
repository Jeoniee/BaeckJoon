import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i =1;i<=N ;i++ ) {

            for (int k=i;k<N ;k++ ) {
                System.out.print(" ");
            }

            for (int j=0;j<i*2-1 ;j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int star =2;star<=N ;star++ ) {

            for (int d=1;d<star ;d++ ) {
                System.out.print(" ");
            }

            for (int f=(N*2)-(star*2-1);f>0;f-- ) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
