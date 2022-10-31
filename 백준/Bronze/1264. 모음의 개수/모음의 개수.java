import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(;;) {
			String str = in.nextLine();
			int count = 0;
			if(str.equals("#")) {
				break;
			}
			
			str = str.toLowerCase();
			
			for(int i=0;i<str.length();i++) {
				switch(str.charAt(i)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count++;
				default:
					break;
				}
			}
			System.out.println(count);
		}

	}

}
