package se.soud.onetheory.dbc;

public class DBCException extends Exception {

  private static final long serialVersionUID = 1L;
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
