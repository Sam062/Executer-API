package base;

public class EmailSender implements Runnable {

	Employee e;

	public EmailSender(Employee emp) {
		e = emp;
	}

	@Override
	public void run() {
//		System.out.println("Calling send email() = " + e.getName());
		sendEmail(String.valueOf(e.getName()), e.getName() + "SUBJECT", e.toString());
	}

	public void sendEmail(String to, String subject, String body) {
		System.out.println("Email sent to " + to + ", SUBJECT " + subject + ", Body " + body);
	}

}
