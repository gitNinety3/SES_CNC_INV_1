package sesmundo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String userWorkOrderNum, dueDate, userPartNum, userPartSpec, userManu, userCustomer;

		int userWorkOrderQty;
		// Scanner object to get user input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the Work Order: ");
		userWorkOrderNum = keyboard.nextLine();

		System.out.print("Enter the Quantity: ");
		userWorkOrderQty = keyboard.nextInt();
		/*	Due date is not operational	*/
		System.out.print("Enter the due date (mm/dd/yy): ");
		dueDate = keyboard.next();
		// Create an Work Order object.
		WorkOrder myWorkOrder = new WorkOrder(userWorkOrderNum, userWorkOrderQty, dueDate);

		System.out.print("\n\nEnter the Part Number: ");
		userPartNum = keyboard.next();
		
		System.out.print("Enter the Part Specification: ");
		userPartSpec = keyboard.next();
		
		System.out.print("Enter the Part Manufactor: ");
		userManu = keyboard.next();
		// Create a Part Number object.
		PartNumber myPartNumber = new PartNumber(userPartNum, userPartSpec, userManu);

		System.out.print("\n\nEnter the Customer: ");
		userCustomer = keyboard.next();
		System.out.println("\n");
		// Create a Customer object.
		Customer myCustomer = new Customer(userCustomer, myWorkOrder, myPartNumber);

		// Display the customer information.
		System.out.println(myCustomer + "\n\n\t by Isaac Sesmundo");

	}
}
