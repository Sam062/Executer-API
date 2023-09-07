package base;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EmployeeService {
	public static void main(String[] args) {
		List<Employee> empList = new LinkedList<>();

		for (int i = 0; i < 100; i++) {
			empList.add(new Employee(i));
		}

		// ********
		ExecutorService pool = Executors.newFixedThreadPool(10);

		for (Employee employee : empList) {
			EmailSender pe = new EmailSender(employee);

			// ********
			pool.submit(pe);
		}
	}

}
