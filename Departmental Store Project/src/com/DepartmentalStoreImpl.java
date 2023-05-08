package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DepartmentalStoreImpl implements DepartmentalStore{
	//key -> product Id -> Integer & value -> Product Instance -> Product
	Map<Integer,Product> db=new LinkedHashMap<Integer,Product>();
	Scanner scan=new Scanner(System.in);
	int totalBill=0;
	@Override
	public void addProduct()
	{
		db.put(1, new Product("Chocolates",10000,5));
		db.put(2, new Product("Biscits",200000,10));
		db.put(3, new Product("Icecream",302561,20));
	}
	@Override
	public void displayProduct()
	{
		Set<Integer> keys=db.keySet();
		for(int key:keys) {
			Product p=db.get(key);
			System.out.println("Enter "+ key +" to order"+p.getName());
			System.out.println("Avaliable Quantity: "+p.getQuantity());
			System.out.println("Cost: Rs."+p.getcost());
			System.out.println("------------------------------------------");
		}
	}
	@Override 
	public void buyProduct()
	{
		System.out.println("Enter Choice");  // choice -> key
		int choice =scan.nextInt();


		//get() return null,when the key(choice) is not present
		Product p=db.get(choice);
		if(p!=null) {
             
			System.out.println("Buying "+p.getName());
			
			System.out.println("Enter the Quantity:");
			int quantity =scan.nextInt();
			if(quantity<=p.getQuantity()) {
				
				//Calculating the current product cost
				int productCost=(int) (quantity * p.getcost());
				
				
				
				//Adding the current product cost to total bill
				totalBill =totalBill + productCost;
				
				
				//updating the new Quantity
				
				p.setQuantity(p.getQuantity()-quantity);
				
				System.out.println("Ordered "+quantity+" "+p.getName());
				System.out.println("Current product Cost is Rs."+productCost);
				System.out.println("Total Bil as of now: Rs. "+totalBill);
				
				
			}
			else {
				try {
					String message="Invalid Quantity "+p.getName()+" not available";
					throw new InvalidQuantityException(message);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
			
		}
		else {
			try {
				String message="Invalid choice ,kindly Enter valid Choice;";
				throw new InvalidChoiceException(message);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}

	}
	@Override
	public void checkout()
	{
		System.out.println("Total Bill: Rs."+totalBill);
		System.out.println("Thank you for Shopping!!");
	}


}
