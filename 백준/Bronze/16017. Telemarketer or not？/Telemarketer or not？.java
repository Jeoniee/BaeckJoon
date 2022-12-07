import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		
		if((A==8 || A==9) && C==B && (D==8 || D==9)) {
			System.out.println("ignore");
		}else {
			System.out.println("answer");
		}
		in.close();
	}

}