package entities;

public class ComboDevice extends Device implements Scanner, Printer {
	
	public ComboDevice() {
		super();
	}
	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc){
		System.out.println();
	}
	@Override
	public String scan() {
		return "ComboDevice Scan";
	}
	@Override
	public void print(String doc) {
		System.out.println("Print ComboDevice " + doc);
	}
	
	
}
