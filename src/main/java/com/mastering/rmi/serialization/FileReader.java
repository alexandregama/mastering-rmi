package com.mastering.rmi.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.mastering.rmi.model.Company;

public class FileReader {

	public Company read(String filename) throws FileNotFoundException, IOException, ClassNotFoundException {
		try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream(filename))) {
			Company company = (Company) reader.readObject();
			return company;
		}
	}

}
