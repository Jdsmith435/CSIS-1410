package docComments;
/**
 * 
 * @author ma0012
 *
 */
public class Phone {
	private String makeBy;
	private String opSystem;
	private double batteryLife;
	private String idNumber;
	private static int count = 0;
	/**
	 * @param makeBy
	 * @param opSystem
	 * @param batteryLife
	 */
	public Phone(String makeBy, String opSystem, double batteryLife) {
		super();
		this.makeBy = makeBy;
		this.opSystem = opSystem;
		this.batteryLife = batteryLife;
		count++;
		idNumber = "123456" + String.valueOf(count);
	}
	/**
	 * @return the makeBy
	 */
	public String getMakeBy() {
		return makeBy;
	}
	/**
	 * @return the opSystem
	 */
	public String getOpSystem() {
		return opSystem;
	}
	/**
	 * @return the batteryLife
	 */
	public double getBatteryLife() {
		return batteryLife;
	}
	/**
	 * @return the idNumber
	 */
	public String getIdNumber() {
		return idNumber;
	}
	
	/**
	 * @return the count
	 */
	public static int getCount() {
		return count;
	}
	@Override
	public String toString() {
		return makeBy + ", Operating System: " + opSystem + ", BatteryLife: " + batteryLife + ", idNumber= "
				+ idNumber + "]";
	}
	
	
	

}
