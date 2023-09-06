package com.encrypted.Program;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		String stringInput = "tenha um bom dia";
		String treatedString = stringInput.replace(" ", "");
		
		int sqrtLength = (int) Math.ceil(Math.sqrt(treatedString.length()));
		List<String> stringsSeparatedList = new ArrayList<>();
		String[][] organizatedString = new String[sqrtLength][sqrtLength];
		List<String> encryptedList = new ArrayList<>();
		
		// passing the treatedString chars into a string list
		for(int i = 0; i < treatedString.length(); i++) {
			stringsSeparatedList.add(Character.toString(treatedString.charAt(i)));
		}
		
		// passing the string list for a 2d array
	        int indexK=0;
	        for(int i=0;i<organizatedString.length; i++) {
	            for(int j=0;j<organizatedString[i].length; j++) {
	            	if(indexK < treatedString.length()) {
	            		organizatedString[i][j] = stringsSeparatedList.get(indexK);
	            		indexK++;
	            	}
	            }
	        } 
        
	        // encrypting the string using list and 2d array, getting the 2d array columns
	        for(int i=0; i<organizatedString.length; i++) {
	            for(int j=0; j<organizatedString[i].length; j++) {
	            	if(organizatedString[j][i] != null) {
	            		encryptedList.add(organizatedString[j][i]); 
	            	}   
	            }
	            encryptedList.add(" ");
	        } 
        
	        // printing the encrypted string
	        for(String encryptedResult : encryptedList) {
	        	System.out.print(encryptedResult);
	        }
        
	}
}
