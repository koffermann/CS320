package services;


// Class: CS320 - Software Test Automation
// Name: Kerrian Offermann
// Assignment: Module Six - Project One



import java.util.ArrayList;

import model.Contact;

public class ContactService {
	ArrayList<Contact> contacts;

	public ContactService() {
		contacts = new ArrayList<>();
	}

	
	// Adding Contact with unique ID
	
	public boolean addContact(Contact contactID) {
		boolean contains = false;
		for (Contact contact: contacts) {
			if (contact.getContactID().equals(contactID)) {
				contains = true;
			}
		}

		if (!contains) {
			contacts.add(contactID);
			return true;
		} 
		else {
			return false;
		}
	}

	// Deleting Contacts
	
	public boolean deleteContact(String contactID) {
		for (Contact contact: contacts) {
			if (contact.getContactID().equals(contactID)) {
				contacts.remove(contact);
				return true;
			}
		}
		return false;
	}
	
	// Updating Contacts

	   public boolean updateContact(String contactID, String contactFirstName, String contactLastName, String contactPhone, String contactAddress) {
	       for (Contact contact : contacts) {
	           if (contact.getContactID().equals(contactID)) {
	        	   
	               if (!contactFirstName.equals("")) {
	            	   contact.setContactFirstName(contactFirstName);
	               }
	               
	               if (!contactLastName.equals("")) {
	            	   contact.setContactLastName(contactLastName);
	               }
	               
	               if (!contactPhone.equals("")) {
	            	   contact.setContactPhone(contactPhone);
	               }
	            			
	               
	               if (!contactAddress.equals("")) {
	            	   contact.setContactAddress(contactAddress);
	               }
	               
	             return true;
	           }
	           
	       }

	       return false;
	   }
	


}
