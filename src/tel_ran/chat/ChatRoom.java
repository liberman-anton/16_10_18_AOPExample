package tel_ran.chat;

public class ChatRoom {
	private static String[] expressions;
	
	public static String[] getExpressions() {
		return expressions;
	}
	public ChatRoom(String[] expressions) {
		super();
		this.expressions = expressions;
	}
	public void saySomething(String message){
		System.out.println(message + " has been said");
	}
	public void replySomething(String message){
		System.out.println(message + " has been said replied");
	}
}
