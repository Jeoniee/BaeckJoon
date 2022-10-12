import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int [] num = new int[9];
		int [] index = new int[9];
		
		
		for(int i =0;i<9;i++) {
			num[i] = in.nextInt();
			index[i] = num[i];
		}
		in.close();
		Arrays.sort(num);
		
		for(int i =0;i<num.length;i++) {
			if(index[i] == num[num.length-1]) {
				System.out.println(index[i]);
				System.out.println(i+1);
			}
		}
	}
}