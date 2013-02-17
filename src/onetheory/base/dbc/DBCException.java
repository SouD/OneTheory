package onetheory.base.dbc;

public class DBCException extends Exception {
	
	protected String message;
	
	public DBCException() {
		this.message = "No message.";
	}
	
	public DBCException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
}
