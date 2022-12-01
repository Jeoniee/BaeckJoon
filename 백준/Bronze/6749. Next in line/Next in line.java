import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int y,m,o;   //막내 
		y = in.nextInt(); 
		m = in.nextInt();
		o = 2*m-y;
		
		
		
		in.close();
		System.out.println(o);
		

	}

}