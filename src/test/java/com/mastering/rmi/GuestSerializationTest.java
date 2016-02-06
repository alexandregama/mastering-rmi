package com.mastering.rmi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.mastering.rmi.model.Guest;
import com.mastering.rmi.serialization.GuestSerialization;

public class GuestSerializationTest {

	@Test
	public void shouldSerializaGuestObject() throws Exception {
		Guest guest = new Guest();
		guest.setId(10L);
		guest.setName("Alexandre Gama");
		guest.setHasKids(true);
		guest.setAddress("Rua Antonio Jose");
		
		GuestSerialization serializer = new GuestSerialization();
		serializer.serialize(guest);
	}

	@Test
	public void shouldDeserializeGuestObject() throws Exception {
		Guest guest = new Guest();
		guest.setId(10L);
		guest.setName("Alexandre Gama");
		guest.setHasKids(true);
		guest.setAddress("Rua Antonio Jose");
		
		GuestSerialization serializer = new GuestSerialization();
		serializer.serialize(guest);
		
		Guest guestSerialized = serializer.deserialize("guest.txt");
		
		assertNull(guestSerialized.getId());
		assertNull(guestSerialized.getName());
		assertEquals("Rua Antonio Jose", guestSerialized.getAddress());
		assertTrue(guestSerialized.getHasKids());
	}
}
