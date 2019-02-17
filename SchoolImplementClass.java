package secondproject;

import secondproject.SchoolInterface;
//package secondproject;

public class SchoolImplementClass implements SchoolInterface, student, subject, payroll 
{

	public String nameOfSchool (String schoolName) {
		// TODO Auto-generated constructor stub
		System.out.println("School Name ::  "+ schoolName);
		return null;
	}

	@Override
	public int employeeNo(int employeeNo) {
		// TODO Auto-generated method stub
		System.out.println("Emplyee No.  "+ employeeNo);
		return 0;
	}

	@Override
	public String employeeName(String employeeName) {
		// TODO Auto-generated method stub
		System.out.println("Name of Employee  "+ employeeName);
		return null;
	}

	@Override
	public int employeeHours(int employeeHours) {
		// TODO Auto-generated method stub
		System.out.println("Total Works in Hours " + employeeHours);
		return 0;
	}

	@Override
	public int employeePerHourRate(int employeePerHourRate) {
		// TODO Auto-generated method stub
		System.out.println("Rate Per Hour  "+ employeePerHourRate);
		int salary;
		salary=employeeHours(0)*employeePerHourRate;
		System.out.println(" Total Salary   " + salary);
		return 0;
	}

	@Override
	public String subject1(String subject1) {
		// TODO Auto-generated method stub
		System.out.println(" First Subject " + subject1);
		return null;
	}

	@Override
	public String subject2(String subject2) {
		// TODO Auto-generated method stub
		System.out.println(" 2nd Subject " + subject2);
		return null;
	}

	@Override
	public String subject3(String subject3) {
		// TODO Auto-generated method stub
		System.out.println(" 3rd Subject " + subject3);
		return null;
	}

	@Override
	public String subject4(String subject4) {
		// TODO Auto-generated method stub
		System.out.println(" 4th Subject " + subject4);
		return null;
	}

	@Override
	public String studentName(String name) {
		// TODO Auto-generated method stub
		System.out.println(" Student Name " + name);
		return null;
	}

	@Override
	public String studentEmail(String email) {
		// TODO Auto-generated method stub
		System.out.println(" Student email " + email);
		return null;
	}

	@Override
	public String studentAddress(String address) {
		// TODO Auto-generated method stub
		System.out.println(" Student Address " + address);
		return null;
	}

	@Override
	public int studentPhone(int phone) {
		// TODO Auto-generated method stub
		System.out.println(" Student Phone No. " + phone);
		return 0;
	}
}
	