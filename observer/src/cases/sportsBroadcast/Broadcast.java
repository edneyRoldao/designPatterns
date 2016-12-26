package cases.sportsBroadcast;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author eroldao
 *
 */
public class Broadcast implements Subject {
	
	private String commentary;
	private final String broadcastDetails;
	private final List<Observer> observers;
	
	public Broadcast(String broadcastDetails) {
		observers = new ArrayList<>();
		this.broadcastDetails = broadcastDetails;
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unregisterObserver(Observer observer) {
		int index = observers.indexOf(observer);
		observers.remove(index);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(commentary);
		}
			
	}
	
	@Override
	public String subjectDetail() {
		return broadcastDetails;
	}

	public void setCommentary(String commentary) {
		this.commentary = commentary;
		notifyObservers();
	}

}
