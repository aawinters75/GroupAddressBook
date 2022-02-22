/**
 * @author Spencer Cress - scress
 * CIS175 - Spring 2022
 * Feb 22, 2022
 */
package main.java.model;

public class Address {
	private int id;
	private String name;
	private String address;
	// space for other fields
	
	
	public Address(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public Address() {
		super();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
