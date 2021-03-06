package com.mastering.rmi.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.mastering.rmi.model.Company;
import com.mastering.rmi.model.Person;
import com.mastering.rmi.model.StockItem;

public class FileWriter {

	public void write(StockItem item) throws FileNotFoundException, IOException {
		try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("stockItem.txt"))) {
			writer.writeObject(item);
		}
	}

	public void write(Person person) throws FileNotFoundException, IOException {
		try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
			writer.writeObject(person);
		}
	}

	public void write(Company company) throws FileNotFoundException, IOException {
		try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("company.txt"))) {
			writer.writeObject(company);
		}
	}

}
