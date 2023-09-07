package base;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EmailSender {

	public void sendBulkEmail(List<Employee> empsList, String subject) {
		final ExecutorService executorService = Executors.newFixedThreadPool(10);

		for (Employee employee : empsList) {
			// Format the email body here
			String body = "EMAIL BODY-TESTING BODY";

			executorService.submit(() -> sendEmail(String.valueOf(employee.getName()), subject, body));
		}
	}

	public void sendEmail(String to, String subject, String body) {
		System.out.println("Email sent to " + to + ", SUBJECT " + subject + ", Body " + body);
	}

}
