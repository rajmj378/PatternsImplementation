package com.templatePattern;

public class Vendor extends Company
{
	private String taxId;
	private String specialties;

	public Vendor(String name, String address, String phone, String fax,
			String taxId, String specialties)
	{
		super(name, address, phone, fax);
		this.taxId = taxId;
		this.specialties = specialties;
	}

	public void setTaxId(String taxId) { this.taxId = taxId; }
	public String getTaxId() { return taxId; }
	
	public void setSpecialties(String specialties) 
	{ 
		this.specialties = specialties;
	}
	public String getSpecialties() { return specialties; }

	// Replacement Method
	@Override
	public String getType() { return "Vendor"; }

	// Replacement Method
	@Override
	public String getSpecifics()
	{
		StringBuilder str = new StringBuilder();
		
		str.append("       Tax Id: " + taxId + "\n");
		str.append("  Specialties: " + specialties + "\n");
		
		return str.toString();
	}
}