import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int A = Integer.parseInt(in.nextLine());
			
		for(int i =0; i<A;i++) {
			System.out.println((i+1)+". "+in.nextLine());
			
		}

		in.close();
	}

}