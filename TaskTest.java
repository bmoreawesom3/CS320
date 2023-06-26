package TaskService;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Tasktest {

	@Test
	void testTaskclass() {
		Task Task = new Task("1234567890", "Natalie Kaline", "This task is setup to be easy.");
		assertTrue(Task.getID().equals("1234567890"));
		assertTrue(Task.getname().equals("Natalie Kaline"));
		assertTrue(Task.getdescription().equals("This task is setup to be easy."));
	}
	@Test
	void testtasklength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1234567890", "Natalie Kaline", "This task is setup to be easy.");
		});	}
	}