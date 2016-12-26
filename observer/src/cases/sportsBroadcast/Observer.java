package cases.sportsBroadcast;

/**
 * 
 * @author eroldao
 *
 */
public interface Observer {

	void update(String commentary);
	void subscribe();
	void unsubscribe();
	
}
