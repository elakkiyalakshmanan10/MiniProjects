package selenium_introduction;

import java.util.Arrays;
import java.util.Scanner;

public class stringAnagram {
	public static void main(String[] args) {
		System.out.print("Enter 2 strings:");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");  
		if(str1.length()!=str2.length())
			System.out.print(str1+" and "+str2+" are not anagram since the size of the strings are not equal");
		else {
			char[] temp1 = str1.toLowerCase().toCharArray();
			char[] temp2 = str2.toLowerCase().toCharArray();
			Arrays.sort(temp1);
			Arrays.sort(temp2);
			if(Arrays.equals(temp1,temp2))
				System.out.print(str1+" and "+str2+" are anagram");
			else
				System.out.print(str1+" and "+str2+" are not anagram");
		}
	}

}
