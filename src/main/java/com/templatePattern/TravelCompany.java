package com.templatePattern;

public class TravelCompany extends Company
{
	public TravelCompany(String name, String address, String phone, String fax)
	{
		super(name, address, phone, fax);
	}

	// Replacement Method
	@Override
	public String getType() { return "Travel"; }

	// Replacement Method
	@Override
	public String getSpecifics()
	{
		return "";
	}
}
