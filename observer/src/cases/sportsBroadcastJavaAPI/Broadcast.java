package cases.sportsBroadcastJavaAPI;

import java.util.Observable;

@SuppressWarnings("unused")
public class Broadcast extends Observable {
	
	private String commentary;
	private final String broadcastDetails;

	public Broadcast(String broadcastDetails) {
		this.broadcastDetails = broadcastDetails;
	}
	
	public void setCommentary(String commentary) {
		this.commentary = commentary;
		setChanged();
		notifyObservers(commentary);
	}
	
	public String subjectDetail() {
		return broadcastDetails;
	}


}
