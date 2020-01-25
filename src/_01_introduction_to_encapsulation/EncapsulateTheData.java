package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */

public class EncapsulateTheData {
	// 1. Encapsulate the member variables.
	// Add restrictions to the setters according to the comment.

	// 2. Create a new JUnit Test case and write tests to verify that
	// the member variables' getters and setters are working

	private int itemsReceived; // must not be negative. All negative arguments get set to 0.
	private float degreesTurned; // must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; // must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj; // must not be a String. If it is a String, set it equal to a new Object();

	@Test
	
	public void test() {
		EncapsulateTheData e = new EncapsulateTheData();

		// items received
		e.setItemsReceived(5);
		assertEquals(5, e.getItemsReceived());
		e.setItemsReceived(-3);
		assertEquals(0, e.getItemsReceived());

		// degrees turned
		e.setDegreesTurned(35);
		assertEquals(35.0, e.getDegreesTurned());
		e.setDegreesTurned(700);
		assertEquals(360.0, e.getDegreesTurned());

		// nomenclature
		e.setNomenclature("word");
		assertEquals("word", e.getNomenclature());
		e.setNomenclature("");
		assertEquals(" ", e.getNomenclature());

		// memberObj
		e.setMemberObj(new Integer(23));
		// assertEquals(expected, actual);
	}

	public int getItemsReceived() {
		return itemsReceived;
	}

	public void setItemsReceived(int itemsReceived) {
		if (itemsReceived < 0.0) {
			itemsReceived = 0;
		}

		this.itemsReceived = itemsReceived;

	}

	public float getDegreesTurned() {
		return degreesTurned;
	}

	public void setDegreesTurned(float degreesTurned) {
		if (degreesTurned < 0.0) {
			degreesTurned = 0;
		}
		else if (degreesTurned > 360.0) {
			degreesTurned = 360;
		}
		this.degreesTurned = degreesTurned;
	}

	public String getNomenclature() {
		return nomenclature;
	}

	public void setNomenclature(String nomenclature) {
		if (nomenclature.length() == 0) {
			nomenclature = " ";
		}
		this.nomenclature = nomenclature;

	}

	public Object getMemberObj() {
		return memberObj;
	}

	public void setMemberObj(Object memberObj) {
		if (memberObj instanceof String) {
			memberObj = new Object();
		}
		this.memberObj = memberObj;

	}
}
