package sesmundo;

public class WorkOrder {
	private String workOrderNum; 	// Work order number
	private int workOrderQty; 		// Work order quantity
	private String workOrderDD; 	// Delivery date

	/**
	 * This constructor initializes the work order's number, quantity or delivery date.
	 * 
	 * @param workONum  The work order's number.
	 * @param workOQty  The work order's quantity.
	 * @param deliveryDate The delivery date.
	 */

	public WorkOrder(String workONum, int workOQty, String deliveryDate) {
		workOrderNum = workONum;
		workOrderQty = workOQty;
		workOrderDD = deliveryDate;
	}

	/**
	 * The copy constructor initializes the object as a copy of another WorkOrder
	 * object.
	 * 
	 * @param object2 The object to copy.
	 */

	public WorkOrder(WorkOrder object2) {
		workOrderNum = object2.workOrderNum;
		workOrderQty = object2.workOrderQty;
		workOrderDD = object2.workOrderDD;
	}

	/**
	 * The set method sets a value for each field.
	 * 
	 * @param workONum  The work order's number.
	 * @param workOQty  The work order's quantity.
	 * @param deliveryDate The delivery date.
	 */

	public void set(String workONum, int workOQty, String deliveryDate) {
		workOrderNum = workONum;
		workOrderQty = workOQty;
		workOrderDD = deliveryDate;
	}

	/**
	 * toString method
	 * 
	 * @return A string containing the work order's information.
	 */

	public String toString() {
		// Create a string representing the object.
		String str = "\tWork Order: " + workOrderNum + 
					"\n\tQuantity: " + workOrderQty + 
					"\n\tDelivery Date: " + workOrderDD;

		// Return the string.
		return str;
	}
}