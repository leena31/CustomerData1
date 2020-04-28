package customerbase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Tester {

	
	private static boolean add;

	public static void main(String[] args) {
		
		
		List<Customer> customer = new ArrayList<Customer>();
		List<LocalDate> dates = new ArrayList<LocalDate>();
		TreeSet<Customer> customer1 = new TreeSet<Customer>();
		TreeSet<String> byEmail = new TreeSet<String>();
		TreeSet<String> byName = new TreeSet<String>();
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
		System.out.println("ENTER YOUR CHOICE : ");
		System.out.println("1. ADD NEW CUSTOMER ");
		System.out.println("2. VIEW ALL CUSTOMERS");
		System.out.println("3. SORT CUTOMERS USING ID");
		System.out.println("4. SORT CUTOMERS USING EMAIL");
		System.out.println("5: SORT CUTOMERS USING DOB");
		System.out.println("6: SORT CUTOMERS USING NAME");
		
		System.out.println("0. EXIT");
		System.out.println("===================================");
		int choice = scan.nextInt();
		
		switch(choice)
		{
		case 1:
			  Scanner input1 = new Scanner(System.in);
			  
			  System.out.println("Enter Id: ");
			  int str1 = input1.nextInt();
			  System.out.println("Enter a customer name: ");
	 	      String str2 = input1.next();
		      System.out.println("Enter an email: ");
		      String str3 = input1.next();
		      System.out.println("Enter a dob: ");
		      LocalDate str4 = LocalDate.parse(input1.next());

		      
		      Customer newCus = new Customer(str1, str2,str3 , str4);
		      
		     // System.out.println("Your ID : " + newCus.getId());
		      customer.add(newCus);
		      customer1.add(newCus);
		      byEmail.add(str3);
		      byName.add(str2);
		      dates.add(str4);
		      
		      System.out.println("New Customer: " + customer1);
		      
		      System.out.println("======================================");
			break;
		
		case 2:
				if(customer.isEmpty())
				{
					System.out.println("No Data");
				}
				else
				{
					for(Customer custom: customer)
					{
						System.out.println("Viewing all Customers: " + custom);
					}
				}
				System.out.println("======================================");
			break;
			
		case 3: 
			
				Iterator iterator;
				iterator = customer1.iterator();
	  

				if (customer1.isEmpty())
				{
				System.out.print("Tree Set is empty.");
				}
				else
				{
					while (iterator.hasNext())
					{
	            	System.out.print("Sorted by ID: " + iterator.next() +  "\n");
					}
				}
				System.out.println("======================================");
			break;
		
		case 4: 
			
				Iterator iterator1;
				iterator1 = byEmail.iterator();
	  

				if (customer1.isEmpty())
				{
					System.out.print("Tree Set is empty." + "\n");
				}
				else
				{
					while (iterator1.hasNext())
					{
						System.out.print("Sorted by Email: " + iterator1.next() + "\n");
					}
				}
				System.out.println("======================================");
			break;
		case 5:
				Iterator iterator2;
				iterator2 = dates.iterator();
	  

				if (customer1.isEmpty())
				{
					System.out.print("Tree Set is empty." + "\n");
				}
				else
				{
					while (iterator2.hasNext())
					{
	            	System.out.print("Sorted by Dates: " + iterator2.next() + "\n");
					}
				}
				System.out.println("======================================");			 
			break;
		case 6: 
				Iterator iterator3;
				iterator3 = byName.iterator();
	  

				if (customer1.isEmpty())
				{
					System.out.print("Tree Set is empty." + "\n");
				}
				else
				{
					while (iterator3.hasNext())
					{
						System.out.print("Sorted by Name: " + iterator3.next() + "\n");
					}
				}
				System.out.println("======================================");
			break;
			
		default: 
			System.exit(0);
			break;
		
		}
	
	}
}
	
	
}


