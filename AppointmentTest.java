package Appointment;

import java.util.Date;
import java.util.Calendar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppointmentTest {
	
	@Test
	void testappointmentclass() {
		Appointment Appointment = new Appointment("1234567890", new Date"2023-05-04", "This is only a test of the character length");
		assertTrue(Appointment.getID().equals("1234567890"));
		assertTrue(Appointment.getDate().equals(new Date"2023-05-04"));
		assertTrue(Appointment.getdescription().equals("This is only a test of the character length"));
	}
	@Test
	void testAppointmentnamelength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1234567890", new Date"2023-05-04", "This is only a test of the character length");
		});	}
}
