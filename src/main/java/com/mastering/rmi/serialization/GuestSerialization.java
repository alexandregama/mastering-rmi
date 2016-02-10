package com.mastering.rmi.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.mastering.rmi.model.Guest;

public class GuestSerialization {

	public void serialize(Guest guest) throws FileNotFoundException, IOException {
		try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("guest.txt"))) {
			writer.writeObject(guest);
		}
	}

	public Guest deserialize(String filename) throws FileNotFoundException, IOException, ClassNotFoundException {
		try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream(filename))) {
			Guest guest = (Guest) reader.readObject();
			return guest;
		}
	}

}
