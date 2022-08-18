package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Class: CS320 - Software Test Automation
// Name: Kerrian Offermann
//Assignment: Module Six - Project One


public class ContactTest {
	
	@Test public void createCorrectContact() {
	      new Contact("000", "FirstName", "LastName", "0000000000", "Sample Address");
	   }
	
	
	// Test if Contact ID is too long	
	
	@Test
	public void testContactIDTooLong() {	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("000000000000000000000001", "Bruce", "Wayne", "1110001111", "11 Batman Dr");
			});	
	}
	
	// Test if Contact First Name is too long
	
	@Test
	public void testContactFirstNameTooLong() {	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("001", "BruceWayneIsBatmansRealName", "Wayne", "1110001111", "11 Batman Dr");
		});	
	}
	
	
	// Test if Contact Last Name is too long
	
	@Test
	public void testContactLastNameTooLong() {	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("001", "Bruce", "BruceWayneIsBatmansRealName", "1110001111", "11 Batman Dr");
		});	
	}
	
	// Test if Contact Phone is too long
	
	@Test
	public void testContactPhoneTooLong() {	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("001", "Bruce", "Wayne", "11111000000000000000000000000000000000000000011111111", "11 Batman Dr");
		});	
	}
	
	// Test if Contact Address is too long
	
	@Test
	public void testContactAddressTooLong() {	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("001", "Bruce", "Wayne", "1110001111", "00000000000000000000000000000000000011 Batman Dr");
		});	
	}
	


	
	
	// Test if Contact ID is null
	
	@Test
	public void testContactIDNull() {	
		Assertions.assertThrows(NullPointerException.class, () -> {
			new Contact(null, "Bruce", "Wayne", "1110001111", "11 Batman Dr");
		});	
	}
	
	
	// Test if Contact First Name is null
	
	@Test
	public void testContactFirstNameNull() {	
		Assertions.assertThrows(NullPointerException.class, () -> {
			new Contact("001", null, "Wayne", "1110001111", "11 Batman Dr");
		});	
	}
	
	// Test if Contact Last Name is null
	
	@Test
	public void testContactLastNameNull() {	
		Assertions.assertThrows(NullPointerException.class, () -> {
			new Contact("001", "Bruce", null, "1110001111", "11 Batman Dr");
		});	
	}
	
	// Test if Contact Phone is null
	
	@Test
	public void testContactPhoneNull() {	
		Assertions.assertThrows(NullPointerException.class, () -> {
			new Contact("001", "Bruce", "Wayne", null, "11 Batman Dr");
		});	
	}
	
	// Test if Contact Address is null
	
	@Test
	public void testContactAddressNull() {	
		Assertions.assertThrows(NullPointerException.class, () -> {
			new Contact("001", "Bruce", "Wayne", "1110001111", null);
		});	
	}
	


}