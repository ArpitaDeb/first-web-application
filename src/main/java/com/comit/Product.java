package com.comit;

import java.io.Serializable;
import java.text.DecimalFormat;

public class Product implements Serializable {
	private int id;
	private String name;
	private double price;
	private String description;
	
	public Product()
	{
		
	}
	
	public Product (String name, double price, String description)
	{
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	public Product (int id, String name, double price, String description)
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String getPriceAsCurrency()
	{
		DecimalFormat df = new DecimalFormat("#.00"); 
		return "$" + df.format(price);
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
}
