package sesmundo;

public class Main {

	public static void main(String[] args) {
		// Create an Work Order object.
	      WorkOrder myWorkOrder =
	          new WorkOrder("J009E928", 20, "June 19, 2022");
	      
	      // Create a Part Number object.
	      PartNumber myPartNumber =
	          new PartNumber("032E2C8",
	                       "Aluminum 6061-T6", "SES CNC Inc");
	                       
	      // Create a Customer object.
	      Customer myCustomer = 
	         new Customer("Xometry", myWorkOrder,
	                    myPartNumber);
	      
	      // Display the customer information.
	      System.out.println(myCustomer + "\n\n\t by Isaac Sesmundo");

	}
}
