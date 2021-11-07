package it.unibo.oop.lab.exception2;

public class WrongAccountHolderException extends IllegalArgumentException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7190620326792084901L;
	private final int usrID;
	
	public WrongAccountHolderException(int usrID) {
		super();
		this.usrID = usrID;
	}

	@Override
	public String toString() {
		return "WrongAccountHolderException [usrAccount=" + usrID + "]";
	}
	
	public String getMessage() {
		return this.toString();
	}
}
