package cases.sportsBroadcast;

/**
 * 
 * @author eroldao
 *
 */
public class SoccerMatchBroadcastTest {
	
	public static void main(String[] args) {
		
		Broadcast foxBroadcast = new Broadcast("Conrinthians vs Chelsea [12152012]");
		Observer smsUser01 = new SMSUser(foxBroadcast, "Edney [Brazil]");
		Observer smsUser02 = new SMSUser(foxBroadcast, "Leandro [Japan]");
		System.out.println();
		
		smsUser01.subscribe();
		smsUser02.subscribe();
		System.out.println();
		
		foxBroadcast.setCommentary("The match has been started !!!");
		System.out.println();
		
		foxBroadcast.setCommentary("Current score (Cor) 0 - 0 (Che)");
		System.out.println();
		
		Observer smsUser03 = new SMSUser(foxBroadcast, "Michael [England]");
		smsUser03.subscribe();
		System.out.println();

		foxBroadcast.setCommentary("GOOOOAL !!!!! from Conrinthians");
		System.out.println();
		
		smsUser02.unsubscribe();
		System.out.println();
		
		foxBroadcast.setCommentary("Current score (Cor) 1 - 0 (Che)");
		System.out.println();
		
	}

}
