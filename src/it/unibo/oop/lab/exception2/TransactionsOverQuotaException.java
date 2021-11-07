package it.unibo.oop.lab.exception2;

public class TransactionsOverQuotaException extends IllegalStateException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5186015990336694793L;
	private final int maxTransactions;
	
	public TransactionsOverQuotaException(int maxTransactions) {
		super();
		this.maxTransactions = maxTransactions;
	}

	@Override
	public String toString() {
		return "TransactionsOverQuotaException [maxTransactions=" + maxTransactions + "]";
	}
	
}
