package selenium_introduction;

import java.util.Scanner;

public class countWords {
	public static void main(String[] args) {
		System.out.print("Enter the string:");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String[] words = sentence.split("\\s");
		int count = words.length;
		System.out.print("Total number of words in the sentence:"+ count);
	}

}
