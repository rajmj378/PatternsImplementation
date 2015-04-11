package com.templatePattern;

public class Customer extends Company 
{
	private int size;

	public Customer(String name, String address, String phone, String fax,
			int size)		
	{
		super(name, address, phone, fax);
		this.size = size;
	}

	public void setSize(int size) { this.size = size; }
	public int getSize() { return size; }
	
	// Replacement Method
	@Override
	public String getType() { return "Customer"; }

	// Replacement Method
	@Override
	public String getSpecifics()
	{
		return "         Size: " + size + "\n";
	}
}
