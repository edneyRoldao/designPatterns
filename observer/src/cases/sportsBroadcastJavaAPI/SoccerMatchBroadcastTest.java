package cases.sportsBroadcastJavaAPI;

public class SoccerMatchBroadcastTest {

	public static void main(String[] args) {
		
		Broadcast ESPNBroadcast = new Broadcast("Barcelona VS Real Madrid [10252016]");
		SMSUser user01 = new SMSUser(ESPNBroadcast, "Edney [Brazil]");
		SMSUser user02 = new SMSUser(ESPNBroadcast, "Lani [Phillipines]");
		
		user01.subscribe();
		user02.subscribe();
		System.out.println();
		
		ESPNBroadcast.setCommentary("Welcome to live soccer match between the two most popular soccer team in the world !");
		System.out.println();
		
		user02.unsubscribe();
		System.out.println();
		
		ESPNBroadcast.setCommentary("we haven't nothing important at this moment on the match");
		
	}
	
}
