package it.unibo.oop.lab.exception2;

public class NotEnoughFoundsException extends IllegalStateException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1159808475879283028L;
	private final double amount;
	
	public NotEnoughFoundsException(double amount) {
		super();
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "NotEnoughFoundsException [amount=" + amount + "]";
	}
	
}
