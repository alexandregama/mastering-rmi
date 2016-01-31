package com.mastering.rmi;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.io.FileInputStream;

import org.junit.Test;

import com.mastering.rmi.model.Book;
import com.mastering.rmi.model.StockItem;
import com.mastering.rmi.serialization.FileWriter;

public class FileWriterTest {

	@Test
	public void shouldWriteAFileWithStockItemObject() throws Exception {
		FileWriter writer = new FileWriter();
		
		StockItem item = new StockItem(1L, new Book(1L, "12345", "RMI Book"), 5);
		
		writer.write(item);
		
		FileInputStream stream = new FileInputStream("stockItem.txt");
		
		assertThat(stream.read(), is(equalTo(172)));
		
		stream.close();
	}
}
