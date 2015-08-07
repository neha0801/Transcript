/**
 * @author Neha
 *
 */
import java.util.Scanner;

public class TranscriptApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CourseEnrollment myCourse;
		Transcript myTranscript = new Transcript();

		// temp variables
		String code, grade;
		int credits;

		System.out.println("Welcome to the transcript application.\n");

		while (myTranscript.getUserChoice().equalsIgnoreCase("y"))
		{
			Scanner sc = new Scanner(System.in);
			myCourse = new CourseEnrollment();
			code = Validator.validateCourseCode(sc, "Enter course:\t");
			myCourse.setCourseCode(code);

			credits = Validator.validateCredits(sc, "Enter credits:\t", 0, 4);
			myCourse.setCredits(credits);

			grade = Validator.validateGrade(sc, "Enter grade:\t");
			myCourse.setGrade(grade);

			myTranscript.addCourse(myCourse);
			myTranscript.getOverallGPA();
			System.out.print("\nAnother line item? (y/n):   ");
			myTranscript.setUserChoice(sc.next());
		}
		System.out.println("\nCourse\t    Credits\t  Grade\t  Quality Points");
		System.out.println("\n------------------------------------------------------");
		System.out.println(myTranscript);
	}
}
