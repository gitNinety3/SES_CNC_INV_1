package sesmundo;

public class Customer {
	private String customerName; 	// Name of the customer
	private WorkOrder workOrder; 	// The work order
	private PartNumber partNumber; 	// The part number

	/**
	 * This constructor initializes the customerName, workOrder, and partNum fields.
	 * 
	 * @param name       The name of the customer.
	 * @param workOrd 	 An WorkOrder object.
	 * @param partNum    A PartNumber object.
	 */

	public Customer(String name, WorkOrder workOrd, PartNumber partNum) {
		// Assign the courseName.
		customerName = name;

		// Create a new Work Order object, passing
		// workOrd as an argument to the copy constructor.
		workOrder = new WorkOrder(workOrd);

		// Create a new Part Number object, passing
		// partNum as an argument to the copy constructor.
		partNumber = new PartNumber(partNum);
	}

	/**
	 * getName method
	 * 
	 * @return The name of the customer.
	 */

	public String getName() {
		return customerName;
	}

	/**
	 * getWorkOrder method
	 * 
	 * @return A reference to a copy of this course's WorkOrder object.
	 */

	public WorkOrder getWorkOrder() {
		// Return a copy of the workOrder object.
		return new WorkOrder(workOrder);
	}

	/**
	 * getPartNumber method
	 * 
	 * @return A reference to a copy of this customer's PartNumber object.
	 */

	public PartNumber getPartNumber() {
		// Return a copy of the partNum object.
		return new PartNumber(partNumber);
	}

	/**
	 * toString method
	 * 
	 * @return A string containing the customer information.
	 */

	public String toString() {
		// Create a string representing the object.
		String str = "Customer name: \n\t" + customerName + 
				"\n\nWork Order Information:\n" + workOrder + 
				"\n\nPart Number Information:\n" + partNumber;

		// Return the string.
		return str;
	}
}