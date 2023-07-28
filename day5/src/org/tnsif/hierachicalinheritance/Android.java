package org.tnsif.hierachicalinheritance;

public class Android {
	private String Brand;
	private String slotType;
	
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getSlotType() {
		return slotType;
	}
	public void setSlotType(String slotType) {
		this.slotType = slotType;
	}
	@Override
	public String toString() {
		return "Android [Brand=" + Brand + ", slotType=" + slotType + ", toString()=" + super.toString() + "]";
	}
	public Android(String brand, String slotType) {
		this.Brand = brand;
		this.slotType = slotType;
	}
	
	
	

}
