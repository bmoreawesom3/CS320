


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class contacttest {

	@Test
	void testcontactclass() {
		contact contact = new contact("1234567890", "Natalie", "Kaline", "7571234567", "999 Awesome Street Virginia Beach Va 234356");
		assertTrue(contact.getID().equals("1234567890"));
		assertTrue(contact.getfirstName().equals("Natalie"));
		assertTrue(contact.getlastName().equals("Kaline"));
		assertTrue(contact.getphone().equals("7571234567"));
		assertTrue(contact.getaddress().equals("999 Awesome Street, Virginia Beach, Va 234356"));
	}
	@Test
	void testcontactnamelength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new contact("1234567890", "Natalie", "Kaline", "75712345678", "999 Awesome Street Virginia Beach Va 234356");
		});	}
	}
