package cases.sportsBroadcast;

/**
 * 
 * @author eroldao
 *
 */
public class SMSUser implements Observer {

	private String commentary;
	private final Subject subject;
	private final String userInfo;

	public SMSUser(Subject subject, String userInfo) {
		if(subject == null) 
			throw new IllegalArgumentException("No publisher found !");
		
		this.subject = subject;
		this.userInfo = userInfo;
	}
	
	@Override
	public void update(String commentary) {
		this.commentary = commentary;
		display();
	}
	
	@Override
	public void subscribe() {
		System.out.println("Subscribing " + userInfo + " to " + subject.subjectDetail() + " ...");
		subject.registerObserver(this);
		System.out.println("Subscribed successfully.");
	}
	
	@Override
	public void unsubscribe() {
		System.out.println("Unsubscribing " + userInfo + " to " + subject.subjectDetail() + " ...");
		subject.unregisterObserver(this);
		System.out.println("Unsubscribed successfully.");
	}
	
	private void display() {
		System.out.println("[" + userInfo + "]: " + commentary);
	}

}
