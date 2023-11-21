package selenium_introduction;

import java.util.Scanner;

public class stringToggle {
	public static void main(String[] args) {
		System.out.print("Enter the string to toggle:");
		Scanner sc=new Scanner(System.in);  
		String str = sc.nextLine();
		System.out.print("Toggled string is "+(strToggleMethod(str)));		
	}
	
	public static String strToggleMethod(String str) {
		String temp = "";
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i)))
				 temp=temp+Character.toLowerCase(str.charAt(i));
			else 
				 temp=temp+Character.toUpperCase(str.charAt(i));
		}
		return temp;
	}

}
