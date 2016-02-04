package com.mastering.rmi;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.io.FileInputStream;
import java.io.NotSerializableException;

import org.junit.Test;

import com.mastering.rmi.model.Book;
import com.mastering.rmi.model.Person;
import com.mastering.rmi.model.StockItem;
import com.mastering.rmi.serialization.FileWriter;

public class FileWriterTest {

	@Test
	public void shouldWriteAFileWithStockItemObject() throws Exception {
		StockItem item = new StockItem(1L, new Book(1L, "12345", "RMI Book"), 5);
		
		FileWriter writer = new FileWriter();
		writer.write(item);
		
		FileInputStream stream = new FileInputStream("stockItem.txt");
		
		assertThat(stream.read(), is(equalTo(172)));
		
		stream.close();
	}
	
	@Test(expected = NotSerializableException.class)
	public void shouldFailWhileTryingToSerializeANonSerializableClass() throws Exception {
		Person person = new Person(1L, "Alexandre Gama");
		
		FileWriter writer = new FileWriter();
		writer.write(person);
	}
	
}
