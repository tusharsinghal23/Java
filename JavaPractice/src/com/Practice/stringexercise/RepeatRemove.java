package com.Practice.stringexercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.Practice.util.StringUtil;

public class RepeatRemove {
	
	public static String removeWord(String word){
		return word.substring(0, word.length()/2);
	}
	
	public static boolean containWord(String args[],String word){
		System.out.println(word);
		for( int  i = 0 ; i < args.length ; i++)
			if(args[i].equals(word))
				return true;
				
		return false;
	}
	
	public static String replaceWord(String word){
		//System.out.println(word);
		//System.out.println((word.indexOf('>')+1)+" "+(word.indexOf('/')-2)); 
		
		String temp = word.substring(word.indexOf('>')+1,word.indexOf('/')-1); 
		String[] apac = {"American Samoa","AsiaPac Region","Australia","Bangladesh","Bhutan","British Indian Ocean Territory","Brunei Darussalam","Burma/Myanmar","Cambodia","China","Christmas Island","Cocos (Keeling) Islands","Cook Islands","Fiji","French Polynesia","French Southern Territories","Guam","Heard Island And Mcdonald Is","Hong Kong","Indonesia","Japan","Kiribati","Laos","Macao","Malaysia","Maldives","Marshall Islands","Micronesia, Federated States","Mongolia","Nauru","Nepal","New Caledonia","New Zealand","Niue","Norfolk Island","Northern Mariana Islands","Palau","Papua New Guinea","Philippines","Pitcairn","Samoa","Singapore","Solomon Islands","South Korea","Taiwan","Thailand","Tianjin","Timor-Leste","Tokelau","Tonga","Tuvalu","Viet Nam","Wallis & Futuna"};
		String[] can = {"Canada","Saint Pierre And Miquelon"};
		String[] eurcas = {"Austria","Belgium","Czech Republic","Estonia","France","Germany","Hungary","Latvia","Lithuania","Luxembourg","Moldova","Poland","Portugal","Slovakia","Spain","Switzerland","Bulgaria","Romania","Serbia","Ukraine","Azerbaijan","Georgia","Gibraltar","Guernsey","Iceland","Ireland","Kazakhstan","Kyrgyzstan","Andorra","Armenia","Faroe Islands","Greenland","Holy See (Vatican City State)","Isle Of Man","Jersey","Liechtenstein","Macedonia","Monaco","San Marino","Svalbard And Jan Mayen","Albania","Bosnia and Herzegovina","Croatia","Cyprus","Greece","Israel","Italy","Malta","Slovenia","Turkey","Finland","Norway","Sweden","Denmark","EuropeCas Region","Netherlands","United Kingdom"};
		String[] lam = {"Anguilla","Antartica","Antigua and Barbuda","Aruba","Bahamas","Bermuda","Bonaire, Sint Eustatius & Saba","Bouvet Island","Curaçao","Dominica","Falkland Islands (Malvinas)","Grenada","Guadeloupe","Haiti","Martinique","Montserrat","Saint Barthélemy","Saint Kitts and Nevis","Saint Lucia","Saint Martin (French Part)","Saint Vincent & The Grenadines","Sint Maarten (Dutch Part)","South Georgia & South Sandwich","Argentina","Barbados","Belize","Bolivia","Brazil","BritishVirginIs","Cayman Islands","Chile","Colombia","Costa Rica","Dominican Republic","Ecuador","El Salvador","French Guiana","Guatemala","Guyana","Honduras","Jamaica","LAM Region","Mexico","Netherland Antilles","Nicaragua","Panama","Paraguay","Peru","Puerto Rico","Suriname","Trinidad and Tobago","Turks Caicos","Uruguay","Venezuela"};
		String[] mena = {"Palestine, State Of","Tajikistan","Western Sahara","Egypt","Jordan","Kuwait","Lebanon","Libya","MENA Region","United Arab Emirates","Afghanistan","India","Pakistan","Sri Lanka","Turkmenistan","Uzbekistan ME","Bahrain","Saudi Arabia","Algeria","Djibouti","Ethiopia","Mali","Mauritania","Morocco","Tunisia","Iran Islamic Republic Of","Sudan","Syrian Arab Republic","Iraq","Oman","Qatar","Yemen"};
		String[] rus = {"Russian Federation"};
		String[] ssa = {"Chad","Kenya WA","Madagascar WA","Mozambique WA","Somalia WA","Tanzania","Uganda","Burkina Faso","Burundi","Cape Verde","Comoros","Congo Democratic Republic","Eritrea","Gambia","Lesotho","Malawi","Mauritius","Mayotte","Réunion","Rwanda","Saint Helena, Ascension & Tris","Sao Tome And Principe","Seychelles","Swaziland","Zambia","Zimbabwe","Benin","Ghana","Guinea","Guinea-Bissau","Ivory Coast","Liberia","Senegal","Sierra Leone","Togo","Angola","Botswana","Cameroon","Central African Rep","Congo","Equatorial Guinea","Gabon","Namibia","Niger","Nigeria","South Africa","SSA Region"};
		String[] us = {"United States"};
		
		if(containWord(apac, temp) || containWord(can, temp) || containWord(eurcas, temp) || containWord(lam, temp) ||containWord(mena, temp) || containWord(rus, temp)|| containWord(ssa, temp)|| containWord(us, temp)){
			return word;
		}
			return null;
	}
	
	public static void main(String args[]){
		String fileName = "f:/Text.txt";
		String writeFileName = "f:/NewText.txt";
		String line = null;
		
		try{
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			FileWriter fileWriter = new FileWriter(writeFileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			while((line = bufferedReader.readLine()) != null){
				String temp = replaceWord(line);
				if( temp != null){
				bufferedWriter.write(temp);
				bufferedWriter.newLine();
				}
				System.out.println(temp);
			}
			bufferedReader.close();
			bufferedWriter.close(); 
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	/*
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
				bufferedWriter.write(removeWord(line));
				bufferedWriter.newLine();
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
*/
}
