/**
 * @author Neha
 *
 */
public class CourseEnrollment {
	private String courseCode;
	private int credits;
	private String grade;
	private double points;

	public CourseEnrollment() {
		this.courseCode = "";
		this.credits = 0;
		this.grade = "";
		this.points = 0.0;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "\n" + String.format("%-15s", this.courseCode)
				+ String.format("%-12s", this.credits)
				+ String.format("%-10s", this.grade)
				+ String.format("%-5s", this.points);
	}

}
