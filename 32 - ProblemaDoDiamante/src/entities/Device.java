package entities;

public abstract class Device {
	private String serialNumber;
	
	public Device() {
		
	}
	public Device(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public void processDoc(String doc) {
		System.out.println("Device: " + doc);
	}
}
