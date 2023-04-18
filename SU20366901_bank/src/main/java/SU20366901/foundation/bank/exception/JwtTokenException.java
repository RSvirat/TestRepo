package SU20366901.foundation.bank.exception;

public class JwtTokenException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public JwtTokenException(String message) {
		super(message);
	}

	public JwtTokenException() {
		super();
	}
	
}
