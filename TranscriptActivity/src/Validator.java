import java.util.Scanner;

public class Validator {

	public static String validateCourseCode(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.nextLine(); // read user entry
		return s;
	}

	public static String validateGrade(Scanner sc, String prompt) {
		String s = "";
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			s = sc.next(); // read user entry
			sc.nextLine(); // discard any other data entered on the line
			if (s.equalsIgnoreCase("A") || s.equalsIgnoreCase("B")
					|| s.equalsIgnoreCase("C") || s.equalsIgnoreCase("D"))
				isValid = true;
			else {
				System.out.println("Error! Invalid Grade.");
				isValid = false;
			}
		}
		return s;
	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}

	public static int validateCredits(Scanner sc, String prompt, int min,
			int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i > max)
				System.out.println("Error! Input must be less than " + max
						+ ".");
			else if (i < min) {
				System.out.println("Error! Input must be more than " + min
						+ ".");
			} else
				isValid = true;
		}
		return i;
	}
}