package org.tnsif.hierachicalinheritance;

public class Tiramisu extends Android {
	public Tiramisu(String brand, String slotType, int version) {
		super(brand, slotType);
		this.version=version;
	}

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
	
	
	
	
}
