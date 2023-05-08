package com;

public class Product {

	private String name;
	private int Quantity;
	private double cost;


	public Product(String name,int Quantity,double cost) {


		this.name=name;
		this.Quantity=Quantity;
		this.cost=cost;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int Quantity) {
		this.Quantity=Quantity;
	}
	public double getcost()
	{
		return cost;
	}
	public void setcost(double cost)
	{
		this.cost=cost;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", Quantity=" + Quantity + ", cost=" + cost + "]";
	}
}
