package com.mastering.rmi.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.mastering.rmi.model.StockItem;

public class FileWriter {

	public void write(StockItem item) throws FileNotFoundException, IOException {
		try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("stockItem.txt"))) {
			writer.writeObject(item);
		}
	}

}
