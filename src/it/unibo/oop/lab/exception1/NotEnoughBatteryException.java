package it.unibo.oop.lab.exception1;

public class NotEnoughBatteryException extends IllegalStateException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final double battery;
	private final double batteryRequired;
	
	

	public NotEnoughBatteryException(double battery, double batteryRequired) {
		super();
		this.battery = battery;
		this.batteryRequired = batteryRequired;
	}

	
	
	@Override
	public String toString() {
		return "NotEnoughBatteryException [battery=" + battery + ", batteryRequired=" + batteryRequired + "]";
	}



	public String getMessage() {
		return this.toString();
	}
}
