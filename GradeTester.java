import java.util.Scanner;
public class GradeTester{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 4.0 point scale grade: ");

		double average = in.nextDouble();
		Grades gpa = new Grades(average);
		System.out.print("Letter Grade: ");
		System.out.print(gpa.getGpa(average));
		in.close();
	}
}