package com.bridgelabz;

import java.io.*;

public class ReadingMain {

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\NEW\\Day27_Assignment\\Day27_Assignment\\src\\com\\bridgelabz\\ExamplePath.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;

		while ((st = br.readLine()) != null)

			System.out.println(st);
		    br.close();
	}
}