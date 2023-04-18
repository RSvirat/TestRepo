package SU20366901.foundation.bank.exception;

public class InsuffientBalanceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public InsuffientBalanceException(String message) {
		super(message);
	}
	
	public InsuffientBalanceException() {
		super();
	}

}
