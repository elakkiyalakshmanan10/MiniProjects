package selenium_introduction;

import java.util.Scanner;

public class swapStrings {
	public static void main(String[] args) {
		System.out.print("Enter the strings:");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.print("Before Swap:"+str1+' '+str2);
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.print("After Swap:"+str1+' '+str2);
	}
}
