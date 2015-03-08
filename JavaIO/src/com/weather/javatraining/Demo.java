package com.weather.javatraining;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
	public static void main(String[] args){
		File file = new File ("src/resources/test.txt");
		
		try{
			
			FileWriter writer = new FileWriter(file, true);
			BufferedWriter buffWriter = new BufferedWriter(writer);
			
			buffWriter.newLine();
			buffWriter.append("Hello Ronnie");
			buffWriter.flush();
			buffWriter.close();
			
		}catch(Exception e){
			
		}
		
		try {
			FileReader reader = new FileReader(file);
			BufferedReader buffReader = new BufferedReader(reader);
			
			String line = "";
			while((line = buffReader.readLine()) != null){
				System.out.println(line);
			}
			
			buffReader.close();
			
		} catch (IOException e) {
			System.out.println("File was not found " + e.getMessage());
			e.printStackTrace();
		}
		
		
	}
}
