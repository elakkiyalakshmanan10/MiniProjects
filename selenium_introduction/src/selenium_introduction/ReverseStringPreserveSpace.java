package selenium_introduction;

import java.util.Scanner;

public class ReverseStringPreserveSpace {
	public static void reverseString(String string) {
		char[] inputString = string.toCharArray();
		char[] resultString = new char[inputString.length];
		
		for(int i =0;i<inputString.length;i++) {
			if(inputString[i]==' ') 
				resultString[i]=' ';
		}
		
		int j = resultString.length-1;
		
		for(int i=0;i<inputString.length;i++) {
			if(inputString[i]!=' ') {
				if(resultString[j]==' ')
					j--;
				resultString[j]=inputString[i];
				j--;
			}
		}
		for(int i=0; i<resultString.length; i++) {
			System.out.print(resultString[i]);
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Enter the string:");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		reverseString(sentence);
	}

}
