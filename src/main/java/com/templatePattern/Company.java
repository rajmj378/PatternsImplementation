package com.templatePattern;

/**
 * Superclass for all types of companies.
 */
public abstract class Company
{
	private String name;
	private String address;
	private String phone;
	private String fax;

	public Company(String name, String address, String phone, String fax)		
	{
		this.name = name; 
		this.address = address; 
		this.phone = phone; 
		this.fax = fax;
	}

	public void setName(String name) { this.name = name; }
	public String getName() { return name; }

	public void setAddress(String address) { this.address = address; }
	public String getAddress() { return address; }

	public void setPhone(String phone) { this.phone = phone; }
	public String getPhone() { return phone; }
	
	public void setFax(String fax) { this.fax = fax; }
	public String getFax() { return fax; }
	
	// Steps deferred to subclasses:
	public abstract String getType();
	public abstract String getSpecifics();

	// Template Method
	public void show()
	{
		// Common steps:
		StringBuilder str = new StringBuilder();
		str.append(" Company Name: " + name + "\n");
		
		// Step deferred to subclass:
		str.append("         Type: " + getType() + "\n");
		
		// Common steps:
		str.append("      Address: " + address + "\n");
		str.append("        Phone: " + phone + "\n");
		str.append("          Fax: " + fax + "\n");
		
		// Step deferred to subclass:
		str.append(getSpecifics());
		
		// Common step:
		System.out.println(str);
	}
}
