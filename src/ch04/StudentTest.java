package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Sexy student1 = new Sexy();
		
		student1.studentID = 2022;
		student1.studentName = " �����";
		student1.address = "���� ������";
		
		student1.showStudentInfo();
		
		Sexy student2 = new Sexy();
		student2.studentID = 2015;
		student2.studentName = " ��¾�";
		student2.address = "���� ������";
		
		student2.showStudentInfo();
		
	 }

}
