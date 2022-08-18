package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Sexy student1 = new Sexy();
		
		student1.studentID = 2022;
		student1.studentName = " 김명준";
		student1.address = "대전 유성구";
		
		student1.showStudentInfo();
		
		Sexy student2 = new Sexy();
		student2.studentID = 2015;
		student2.studentName = " 김승아";
		student2.address = "대전 유성구";
		
		student2.showStudentInfo();
		
	 }

}
