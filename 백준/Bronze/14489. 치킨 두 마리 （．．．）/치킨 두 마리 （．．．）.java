import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int sum = A+B;
		if(sum>=(C*2)) {
			System.out.println(sum-(C*2));
			
		}else {
			System.out.println(sum);
		}

	}

}