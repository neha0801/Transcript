import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class ValidatorTest {

	@Test
	public void testCouseCode() {
		System.out.println("Test if correct code is enetered");
		Scanner sc = new Scanner(System.in);
		assertTrue(Validator.validateCourseCode(sc, "Enter course:")
				.equalsIgnoreCase("java"));
	}

	@Test
	public void testGradeInput() {
		System.out.println("Test if correct grade is entered");
		Scanner sc = new Scanner(System.in);
		assertTrue(Validator.validateGrade(sc, "Enter grade:")
				.equalsIgnoreCase("A"));
	}

	@Test
	public void testCreditInput() {
		System.out.println("Test range for credits");
		Scanner sc = new Scanner(System.in);
		assertTrue(Validator.validateCredits(sc, "Enter credits:", 0, 4) == 4);
	}

	@Test
	public void testCreditType() {
		System.out.println("Test type for credits");
		Scanner sc = new Scanner(System.in);
		assertTrue(Validator.getInt(sc, "Enter credits:") == 3);
	}

}
