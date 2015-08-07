import static org.junit.Assert.*;

import org.junit.Test;

public class CourseTest {

	@Test
	public void testCouseCode() {
		System.out.println("Test if get and set works for course code");
		CourseEnrollment C = new CourseEnrollment();
		C.setCourseCode("java");
		assertTrue(C.getCourseCode().equalsIgnoreCase("java"));
	}

	@Test
	public void testCredits() {
		System.out.println("Test if get and set works for credits");
		CourseEnrollment C = new CourseEnrollment();
		C.setCredits(2);
		assertTrue(C.getCredits() == 2);
	}

	@Test
	public void testGrade() {
		System.out.println("Test if get and set works for grade");
		CourseEnrollment C = new CourseEnrollment();
		C.setGrade("A");
		assertTrue(C.getGrade().equalsIgnoreCase("A"));
	}

	@Test
	public void testPoints() {
		System.out.println("Test if get and set works for points");
		CourseEnrollment C = new CourseEnrollment();
		C.setPoints(4.0);
		assertTrue(C.getPoints() == 4.0);
	}

}
