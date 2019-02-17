package secondproject;

public interface SchoolInterface {
	public String nameOfSchool(String schoolName);
}

interface student extends SchoolInterface {
	public String studentName(String name);

	public String studentEmail(String email);

	public String studentAddress(String address);

	public int studentPhone(int phone);

}

interface subject extends SchoolInterface {
	public String subject1(String subject1);

	public String subject2(String subject2);

	public String subject3(String subject3);

	public String subject4(String subject4);
}

interface payroll extends SchoolInterface {
	public int employeeNo(int employeeNo);

	public String employeeName(String employeeName);

	public int employeeHours(int employeeHours);

	public int employeePerHourRate(int employeePerHourRate);

}

