import java.util.regex.Pattern;
import java.util.Scanner;

public class GrandCircusLab7 {

	public static void main(final String[] args) {
		
		final Scanner s = new Scanner(System.in);
		boolean cont = true;
		
		while (cont) {
			System.out.println("Please enter a valid name (eg John):");
			if (checkName(s.nextLine())) {
				cont = false;
			} else {
				System.out.println("Invalid name.");
			}
		}
		
		cont = true;
		while (cont) {
			System.out.println("Please enter a valid email address (xxxxx@xxxxx.xx(x)):");
			if (checkEmail(s.nextLine())) {
				cont = false;
			} else {
				System.out.println("Invalid email address.");
			}
		}
		
		cont = true;
		while (cont) {
			System.out.println("Please enter a valid phone number: (xxx-xxx-xxxx)");
			if (checkPhone(s.nextLine())) {
				cont = false;
			} else {
				System.out.println("Invalid phone number.");
			}
		}
		
		cont = true;
		while (cont) {
			System.out.println("Please enter a valid date: (dd/mm/yyyy)");
			if (checkDate(s.nextLine())) {
				cont = false;
			} else {
				System.out.println("Invalid date.");
			}
		}
		
		s.close();
	}
	
	private static boolean checkName(final String name) {
		return Pattern.matches("[A-Z][a-z]{0,29}", name);
	}
	
	private static boolean checkEmail(final String addr) {
		return Pattern.matches("[A-Za-z0-9]{5,30}@[A-Za-z0-9]{5,10}[.][a-z0-9]{2,3}", addr);
	}
	
	private static boolean checkPhone(final String num) {
		return Pattern.matches("\\d{3}-\\d{3}-\\d{4}", num);
	}
	
	private static boolean checkDate(final String date) {
		return Pattern.matches("\\d{1,2}/\\d{1,2}/\\d{4}", date);
	}

}
