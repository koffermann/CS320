package model;

// Class: CS320 - Software Test Automation
// Name: Kerrian Offermann
// Assignment: Module Six - Project One


public class Contact {
	public String contactID;
	public String contactFirstName;
	public String contactLastName;
	public String contactPhone;
	public String contactAddress;
	

// Contact constructor
	
	public Contact(String contactID, String contactFirstName, String contactLastName, String contactPhone, String contactAddress) {
		
		// Contact ID - no more than 10 characters that is not null and not updateable.
		if(contactID.length() > 10 || contactID == null) {
			throw new IllegalArgumentException("Please enter ten characters or less.");
		}
		
		// Contact First Name - no more than 10 characters that is not null
		if(contactFirstName.length() > 10 || contactFirstName == null) {		
			throw new IllegalArgumentException("Please enter ten characters or less.");
		}	
		
		// Contact Last Name - no more than 10 characters that is not null
		if(contactLastName.length() > 10 || contactLastName == null) {			
			throw new IllegalArgumentException("Please enter ten characters or less.");
		}
		
		// Contact Phone - no more than 10 characters that is not null
		if(contactPhone.length() > 10 || contactPhone.length() < 10 || contactPhone == null) {
			throw new IllegalArgumentException("Please enter ten characters or less.");
		}
		
		// Contact Address- no more than 30 characters that is not null
		if(contactAddress.length() > 30 || contactAddress == null) {
			throw new IllegalArgumentException("Please enter 30 characters or less.");
		}	
		
		this.contactID = (contactID);
		this.setContactFirstName(contactFirstName);
		this.setContactLastName(contactLastName);
		this.setContactPhone(contactPhone);
		this.setContactAddress(contactAddress);
		
	}
	

	public void setContactID(String contactID) {
		this.contactID = contactID;
	}
	
	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}
	
		
	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}
	
	
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	
	
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	
	
	
	// Getters
	
	public String getContactID() {
		return contactID;
	}
	
	public String getContactFirstName() {
		return contactFirstName;
	}
	
	public String getContactLastName() {
		return contactLastName;
	}
	
	public String getContactPhone() {
		return contactPhone;
	}

	public String getContactAddress() {
		return contactAddress;
	}
	

}
