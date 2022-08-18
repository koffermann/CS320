package services;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import model.Contact;

//Class: CS320 - Software Test Automation
//Name: Kerrian Offermann
//Assignment: Module Six - Project One


public class ContactServiceTest {
	

	// Test if we are able to add contacts
	@Test
	public void testAdd(){
		
		ContactService ContactService = new ContactService();	
		Contact test1 = new Contact("002", "T'Challa", "Wakanda", "2220002222", "22 Panther Dr");
		Contact test2 = new Contact("003", "Diane", "Prince", "3330003333", "33 Wonder Dr");
		assertEquals(true, ContactService.addContact(test1));
		assertEquals(true, ContactService.addContact(test2));
		assertEquals(true, ContactService.addContact(test1));
	}
	
	// Test if we are able to delete contacts
	@Test
	public void testDelete() {

		ContactService ContactService = new ContactService();
		Contact test3 = new Contact("004", "Tony", "Stark", "4440004444", "44 Iron Dr");
		Contact test4 = new Contact("005", "Natasha", "Romanoff", "5550005555", "55 Black Widow Dr");
		ContactService.addContact(test3);
		ContactService.addContact(test4);
		assertEquals(true, ContactService.deleteContact("004"));
		assertEquals(false, ContactService.deleteContact("006"));
	}
	
	// Test if we are able to update contacts
	@Test
	public void testUpdate() {
		ContactService contact = new ContactService();
		assertEquals(false, contact.updateContact("", "", "", "", ""));
		assertEquals(false, contact.updateContact("003", "Diana", "Prince", "3330003333", "33 Wonder Woman Dr"));
	}

}