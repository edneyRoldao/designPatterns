package cases.sportsBroadcast;

/**
 * 
 * @author eroldao
 *
 */
public interface Subject {
	
	void registerObserver(Observer observer);
	void unregisterObserver(Observer observer);
	void notifyObservers();
	String subjectDetail();

}
