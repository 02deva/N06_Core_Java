package org.tnsif.hierachicalinheritance;
public class Tiramisu extends Android {
	private int version;


	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}
	// parameterized constructor 
	public Tiramisu(String brand, String slotType, int version) {
		super(brand, slotType);
		this.version=version;
	}

	
	
	
	
}
