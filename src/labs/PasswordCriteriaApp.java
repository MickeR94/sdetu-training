package labs;

import java.io.BufferedReader;  
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class PasswordCriteriaApp {

	public static void main(String[] args) {
		String filename = "C:\\Users\\mikae\\Documents\\Udemy Java\\Files\\PasswordCriteria.txt";
		File file = new File(filename);
		String password = null;
		
		try{
			BufferedReader br = new BufferedReader(new FileReader(file));
			password = br.readLine();
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read the file"); //needed?
		}
		
		//Valid password has:
		//1. A number 2. A letter 3. Special character (! @ #)
		
		try {
			
			boolean containsLetter = false;
			boolean containsDigit = false;
			boolean containsSpecialCharacter = false;
			
			for(int i = 0; i < password.length(); i++) {
				char currentChar = password.charAt(i);
				
				if (Character.isLetter(currentChar)) {
					containsLetter = true;
				}
				if (Character.isDigit(currentChar)) {
					containsDigit = true;
				}
				if(isSpecialCharacter(currentChar)) {
					containsSpecialCharacter = true;
				}
				
			}
			
			if(!containsLetter) {
				throw new NoLetterException(password);
			}
			
			if(!containsDigit) {
				throw new NoDigitException(password);
			}
			
			if(!containsSpecialCharacter) {
				throw new NoSpecialCharacterException(password);
			}
			
		System.out.println("Your password was approved: " + password);
			
			
		} catch (NoLetterException e) {
			System.out.println("ERROR: The password does not contain a letter: " + e.toString());
		} catch (NoDigitException e) {
			System.out.println("ERROR: The password does not contain a digit: " + e.toString());
		} catch (NoSpecialCharacterException e) {
			System.out.println("ERROR: The password does not contain a special character: " + e.toString());
		}

	}
	
	public static boolean isSpecialCharacter(char c) {
		String specialCharacters = "*+?\\=})]([/{&%€¤$#£!>|<´^~'\"";
		
		return specialCharacters.contains(String.valueOf(c));
	}
	
	

}

class NoLetterException extends Exception {
	String password;
	NoLetterException(String password){
		this.password = password;
	}
}

class NoDigitException extends Exception {
	String password;
	NoDigitException(String password){
		this.password = password;
	}
}

class NoSpecialCharacterException extends Exception {
	String password;
	NoSpecialCharacterException(String password){
		this.password = password;
	}
}
