package org.tnsif.singleinheritance;
// base class
public class Citizen {
	
	private String city , area;
	private int pincode;
	private long adharNo;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", area=" + area + ", pincode=" + pincode + ", adharNo=" + adharNo + "]";
	}
	public Citizen () {
		System.out.println("Citizen-Parent Class");
		
	}
	public Citizen(String city, String area, int pincode, long adharNo) {
		super();
		this.city = city;
		this.area = area;
		this.pincode = pincode;
		this.adharNo = adharNo;
	}
	
	
	
	

}
