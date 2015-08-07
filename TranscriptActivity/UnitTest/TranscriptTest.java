import static org.junit.Assert.*;

import org.junit.Test;

public class TranscriptTest {

	@Test
	public void testCouseCode() {
		System.out.println("Test if get and set works for user choice");
		Transcript T = new Transcript();
		T.setUserChoice("Y");
		assertTrue(T.getUserChoice().equalsIgnoreCase("Y"));
	}

	@Test
	public void testGradePoints() {
		System.out.println("Test if grades are getting converted to correct value");
		Transcript T = new Transcript();
		assertTrue(T.getPoints("B") == 3.0);

	}

	@Test
	public void testArrayCourseCode() {
		System.out.println("Test if course code value are added to array correctly");
		Transcript T = new Transcript();
		CourseEnrollment C = new CourseEnrollment();
		C.setCourseCode("java");
		T.addCourse(C);
		assertTrue(T.getCourse().get(0).getCourseCode()
				.equalsIgnoreCase("java"));
	}

	@Test
	public void testArrayGrade() {
		System.out.println("Test if grade value are added to array correctly");
		Transcript T = new Transcript();
		CourseEnrollment C = new CourseEnrollment();
		C.setGrade("A");
		T.addCourse(C);
		assertTrue(T.getCourse().get(0).getGrade().equalsIgnoreCase("A"));
	}

	@Test
	public void testArrayCredits() {
		System.out
				.println("Test if credits value are added to array correctly");
		Transcript T = new Transcript();
		CourseEnrollment C = new CourseEnrollment();
		C.setCredits(3);
		T.addCourse(C);
		assertTrue(T.getCourse().get(0).getCredits() == 3);
	}

	@Test
	public void testArrayPoints() {
		System.out.println("Test if points are added to array correctly");
		Transcript T = new Transcript();
		CourseEnrollment C = new CourseEnrollment();
		C.setGrade("A");
		T.addCourse(C);
		assertTrue(T.getCourse().get(0).getPoints() == 4.0);
	}

	@Test
	public void testOverallGPA() {
		System.out.println("Test if overall GPA is correct");
		Transcript T = new Transcript();
		CourseEnrollment C1 = new CourseEnrollment();
		C1.setGrade("A");
		T.addCourse(C1);
		CourseEnrollment C2 = new CourseEnrollment();
		C2.setGrade("B");
		T.addCourse(C2);
		assertTrue(T.getOverallGPA() == 3.5);
	}

	@Test
	public void testFormattedGPA() {
		System.out.println("Test if formatted GPA is correct");
		Transcript T = new Transcript();
		CourseEnrollment C1 = new CourseEnrollment();
		C1.setGrade("A");
		T.addCourse(C1);
		CourseEnrollment C2 = new CourseEnrollment();
		C2.setGrade("B");
		T.addCourse(C2);
		assertTrue(T.getFormattedGPA().equals("3.5"));
	}
}
