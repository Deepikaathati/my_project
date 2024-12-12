package exception;

public class InsufficientBalanceException extends RuntimeException {
 
	private static final long serialversionUID=1L;
	
	public InsufficientBalanceException() {
		super();
	}
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
	
}
