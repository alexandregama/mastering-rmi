package com.mastering.rmi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.mastering.rmi.model.Company;
import com.mastering.rmi.serialization.FileReader;
import com.mastering.rmi.serialization.FileWriter;

public class FileReaderTest {

	@Test
	public void shouldNotSerializaATransientProperty() throws Exception {
		Company company = new Company(1L, "Caelum", "Rua Vergueiro");
		
		FileWriter writer = new FileWriter();
		writer.write(company);
		
		FileReader reader = new FileReader();
		Company companyRead = reader.read("company.txt");
		
		assertEquals(1L, companyRead.getId(), 0);
		assertEquals("Caelum", companyRead.getName());
		assertNull(companyRead.getAddress()); //Address is a transient property and will be returned null for it
	}

	@SuppressWarnings("static-access")
	@Test
	public void shouldNotSerializeAStaticProperty() throws Exception {
		Company company = new Company(1L, "Caelum", "Rua Vergueiro");
		
		FileWriter writer = new FileWriter();
		writer.write(company);
		
		FileReader reader = new FileReader();
		Company companyRead = reader.read("company.txt");
		
		assertEquals(1L, companyRead.getId(), 0);
		assertEquals("Caelum", companyRead.getName());
		assertNull(companyRead.getEmployeesQuantity()); //EmployeesQuantity is a static property and will be returned null for it
	}
	
}
