import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();	//입력
		in.close();
		
		int copy = N;		//변수 복사
		int cnt = 0;
		 
		while(true){
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
		 
			if(copy == N){
				break;
			}
		}
		System.out.println(cnt);
	}

}