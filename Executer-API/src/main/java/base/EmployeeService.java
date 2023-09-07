package base;

import java.util.LinkedList;
import java.util.List;

public class EmployeeService {
	public static void main(String[] args) {
		List<Employee> empList = new LinkedList<>();

		for (int i = 0; i < 1000; i++) {
			empList.add(new Employee(i));
		}

		EmailSender pe = new EmailSender();
		pe.sendBulkEmail(empList, "SUBJECT: EMAIL TESTING");
	}

}
