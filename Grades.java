public class Grades{
	public Grades() {
		gpa = 0;
	}
	public Grades(double grade) {
		grade = gpa;
	}
	public String getGpa(double gpa) { 
		//@param gpa: the total grade point average (precondition: gpa > 0)

		String letterGrade;
		
		if ( gpa == 0) {
			letterGrade = "F";
		}
		else if (gpa < 0.95 && gpa > 0) {
			letterGrade = "F";
		}
		else if(gpa <= 0.95 && gpa > 0) {
			letterGrade = "D";
		}
		else if(gpa <= 1.25 && gpa > 0) {
			letterGrade = "D+";
		}
		else if (gpa <= 1.65 && gpa > 0) {
			letterGrade = "C-";
		}
		else if (gpa <= 1.95 && gpa > 0) {
			letterGrade = "C";
		}
		else if (gpa <= 2.25 && gpa > 0) {
			letterGrade = "C+";
		}
		else if (gpa <= 2.65 && gpa > 0) {
			letterGrade = "B-";
		}
		else if (gpa <= 2.95 && gpa > 0) {
			letterGrade = "B-";
		}
		else if (gpa <= 3.23 && gpa > 0) {
			letterGrade = "B";
		}
		else if (gpa <= 3.65 && gpa > 0) {
			letterGrade = "B+";
		}
		else if (gpa <= 3.95 && gpa > 0) {
			letterGrade = "A";
		}
		else if (gpa <= 4.0 && gpa > 0) {
			letterGrade = "A+";
		}
		else{
			letterGrade = "Error: Grade out of bounds. @param gpa: the total grade point average (precondition: gpa > 0)";
		}
		return letterGrade;

	}
	private double gpa;
}