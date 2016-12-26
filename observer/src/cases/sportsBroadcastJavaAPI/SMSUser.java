package cases.sportsBroadcastJavaAPI;

import java.util.Observable;
import java.util.Observer;

public class SMSUser implements Observer {

	private String commentary;
	private final String userInfo;
	private final Observable observable;
	
	public SMSUser(Observable observable, String userInfo) {
		this.observable = observable;
		this.userInfo = userInfo;
	}
	
	@Override
	public void update(Observable observable, Object arg) {
		commentary = (String) arg;
		display();
	}
	
	public void subscribe() {
		System.out.println("Subscribing " + userInfo + " to " + ((Broadcast) observable).subjectDetail() + " ...");
		observable.addObserver(this);
		System.out.println("Subscribed successfully.");
	}
	
	public void unsubscribe() {
		System.out.println("Unsubscribing " + userInfo + " to " + ((Broadcast) observable).subjectDetail() + " ...");
		observable.deleteObserver(this);
		System.out.println("Unsubscribed successfully.");
	}


	private void display() {
		System.out.println("[" + userInfo + "]: " + commentary);
	}
	
}
