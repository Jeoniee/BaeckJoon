import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		Calendar car = Calendar.getInstance();
		System.out.println(car.get(car.YEAR));
		System.out.println(car.get(car.MONTH)+1);
		System.out.println(car.get(car.DATE));
		

	}

}