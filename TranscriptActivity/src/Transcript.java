import java.text.DecimalFormat;
import java.util.ArrayList;

public class Transcript {

	private ArrayList<CourseEnrollment> studentTranscript = new ArrayList<CourseEnrollment>();
	private String userChoice;
	private double overallGPA;
	private double totalPoints;
	private int count;
	DecimalFormat df = new DecimalFormat("#.###");


	public Transcript(){
		this.count =0;
		this.userChoice="y";
		this.overallGPA=0.0;
		this.totalPoints=0.0;
	}

	public String getUserChoice() {
		return userChoice;
	}

	public void setUserChoice(String userChoice) {
		this.userChoice = userChoice;
	}
	
	public void addCourse(CourseEnrollment course) {
		
		course.setPoints(this.getPoints(course.getGrade()));	
		this.count++;
		this.totalPoints+=course.getPoints();
		this.overallGPA = getOverallGPA();
		this.studentTranscript.add(course);
	}
	
	public ArrayList<CourseEnrollment> getCourse(){
		return this.studentTranscript;
	}
	
	
	public double getPoints(String grade){
	if (grade.equalsIgnoreCase("A"))
			return 4.0;
	else if (grade.equalsIgnoreCase("B"))
			return 3.0;
	else if (grade.equalsIgnoreCase("C"))
			return 2.0;
	else if (grade.equalsIgnoreCase("D"))
		  	return 1.0;
	else
		return 0.0;
	}
	
	public double getOverallGPA(){
		return this.totalPoints/this.count;

	}
	
	public String getFormattedGPA(){
		return df.format(this.overallGPA);
	}
	
	
	@Override
	public String toString() {
		String output = "";
		for (CourseEnrollment course : studentTranscript) {
			output += course;
		}
		return output + "\n\n\t\t\t\tGPA = " + this.getFormattedGPA();
	}
}
