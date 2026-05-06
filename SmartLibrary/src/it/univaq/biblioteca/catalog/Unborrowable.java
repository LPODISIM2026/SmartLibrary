package it.univaq.biblioteca.catalog;

public class Unborrowable extends Exception {

	public Unborrowable() {
		super("Non posso prestare il libro");
		// TODO Auto-generated constructor stub
	}

	public Unborrowable(String message) {
		super(message);		
		// TODO Auto-generated constructor stub
	}

	public Unborrowable(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public Unborrowable(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public Unborrowable(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
