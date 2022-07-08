package sesmundo;

public class PartNumber {
	   private String partID;     		// partID of the material
	   private String partType;    		// partType's of specification
	   private String partManufactor; 	// Name of partManufactor

	   /**
	      This constructor initializes the partID,
	      partType, and partManufactor fields
	      @param textpartID The part's partID.
	      @param pType The partType's specification.
	      @param manu The name of the partManufactor.
	   */

	   public PartNumber(String textPartID, String pType,
	                   String manu)
	   {
	      partID = textPartID;
	      partType = pType;
	      partManufactor = manu;
	   }

	   /**
	      The copy constructor initializes the object
	      as a copy of another PartNumber object.
	      @param object2 The object to copy.
	   */

	   public PartNumber(PartNumber object2)
	   {
	      partID = object2.partID;
	      partType = object2.partType;
	      partManufactor = object2.partManufactor;
	   }

	   /**
	      This constructor initializes the partID,
	      partType, and partManufactor fields
	      @param textpartID The part's partID.
	      @param pType The partType's specification.
	      @param manu The name of the partManufactor.
	   */

	   public void set(String textpartID, String pType,
	                   String manu)
	   {
	      partID = textpartID;
	      partType = pType;
	      partManufactor = manu;
	   }

	   /**
	      toString method
	      @return A string containing the part number
	              information.
	   */

	   public String toString()
	   {
	      // Create a string representing the object.
	      String str = "\tPart ID Number: " + partID +
	                   "\n\tPart Type: " + partType +
	                   "\n\tPart Manufactor: " + partManufactor;

	      // Return the string.
	      return str;
	   }
	}