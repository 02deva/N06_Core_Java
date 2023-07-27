package org.tnsif.hierachicalinheritance;

public class SnowCore extends Android {
	private int version;
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public SnowCore(String brand, String slotType,int version) {
		super(brand, slotType);
		this.version=version;
	}

	@Override
	public String toString() {
		return "SnowCore [version=" + version + ", toString()=" + super.toString() + "]";
	}

}
