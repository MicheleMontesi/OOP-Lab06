package it.unibo.oop.lab.exception1;

public class NotEnoughBatteryException extends IllegalStateException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final double battery;
	
	public NotEnoughBatteryException(double battery) {
		super();
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "NotEnoughBatteryException [battery=" + battery + "]";
	}
	
	public String getMessage() {
		return this.toString();
	}
}
