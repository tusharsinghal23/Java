package com.Practice.stringexercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StringQuoteAddition {
	
	public static String stringProcess(String str){
		StringBuilder sb = new StringBuilder();
		sb.append("\"");
		sb.append(str);
		sb.append("\",");
		return sb.toString();
	}
	
	
	public static void main(String args[]){
		String fileName = "f:/List.txt";
		String writeFileName = "f:/NewList.txt";
		
		String line = null;
		
		try{
			
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			FileWriter fileWriter =  new FileWriter(writeFileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			while((line = bufferedReader.readLine()) != null){
				bufferedWriter.write(stringProcess(line));
				//bufferedWriter.newLine();
				System.out.println(line);
			}
			bufferedReader.close();
			bufferedWriter.close(); 
		}
		catch(FileNotFoundException ex){
			ex.printStackTrace();
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		finally{
			
		}
		
	}

}
