import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

         double kg= in.nextDouble();
		 double cm= in.nextDouble();
     
         //BMI = 체중 / (키× 키).
         double bmi= kg/(cm*cm);
		

 		
		if(bmi>25) {
	         System.out.println("Overweight");
	      }else if(bmi>=18 && bmi <= 25) {
	         System.out.println("Normal weight");
	      }else{
	         System.out.println("Underweight");
	      }
		
	}

}
