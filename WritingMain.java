package com.bridgelabz;

import java.io.*;
import java.util.*;

public class WritingMain {

	final static String outputFilePath = "C:\\NEW\\Day27_Assignment\\Day27_Assignment\\src\\com\\bridgelabz\\ExamplePath.txt";

	public static void main(String[] args) {

		Map<String, AddressBook> map = new HashMap();

		AddressBook addressBook1 = new AddressBook();

		String addressBook1Name = "AddressBook1";
		Contact contact1 = new Contact("Nikhil", "Pawar", "Dhule");
		Contact contact2 = new Contact("Aryan", "Patil", "Amalner");
		Contact contact3 = new Contact("Avi", "Patil", "Shirpur");

		addressBook1.list.add(contact1);
		addressBook1.list.add(contact2);
		addressBook1.list.add(contact3);

		map.put(addressBook1Name, addressBook1);

		AddressBook addressBook2 = new AddressBook();
		
		String addressBook2Name = "AddressBook2";
		Contact contact4 = new Contact("Ravi", "Chaudhari", "Parola");
		Contact contact5 = new Contact("Amol", "Bagul", "Dhule");
		Contact contact6 = new Contact("Abhishekh", "Patil", "Parola");
		
		addressBook2.list.add(contact4);
		addressBook2.list.add(contact5);
		addressBook2.list.add(contact6);
		
		map.put(addressBook2Name, addressBook2);

		File file = new File(outputFilePath);
		BufferedWriter bf = null;

		try {
			bf = new BufferedWriter(new FileWriter(file));

			for (Map.Entry<String, AddressBook> entry : map.entrySet()) {

				bf.write(entry.getKey() + ":" + entry.getValue());
				bf.newLine();
			}

			bf.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				bf.close();
				System.out.println("Done");
			} catch (Exception e) {
			}
		}
	}
}
