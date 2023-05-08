package com;
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {

		System.out.println("Welcome to xyz Depatmental Store");

		System.out.println("========================================");

		Scanner scan=new Scanner(System.in);

		//upcasting to achieve Abstraction
		DepartmentalStore store=new DepartmentalStoreImpl();

		store.addProduct();

		int choice=1;
		while(choice==1) {
			store.displayProduct();
			store.buyProduct();
			System.out.println("Press 1 to continue or other num to check");
			choice=scan.nextInt();
		}

		store.checkout();  //check only once



	}

}
