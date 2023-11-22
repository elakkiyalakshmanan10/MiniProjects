package selenium_introduction;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class findDuplicateCharacter {
	/*public static void main(String[] args) {
		System.out.print("Enter a word:");
		Scanner sc = new Scanner(System.in);
		String wordInput = sc.next();
		int count = 0;
		for(int i=0;i<wordInput.length();i++) {
			for(int j=i+1;j<wordInput.length();j++) {
				if(wordInput.charAt(i)==wordInput.charAt(j))
					count++;
			}
			if(count>0)
				System.out.print("Duplicate Character:"+wordInput.charAt(i)+" Frequency:"+count);
		}
		if(count==0)
			System.out.print("No Duplicate characters in string");
		char[] arrayInput = wordInput.toCharArray();
		for(int i=0;i<arrayInput.length-1;i++) {
			for(int j=i+1;i<arrayInput.length-1;i++) {
				if(arrayInput[i]==arrayInput[j])
					count+=1;
			}
			if(count>0)
				System.out.print("\nDuplicate Character:"+wordInput.charAt(i)+"\nFrequency:"+ (count+1));
		}
	}*/
	
   
    public static void main(String a[]) {  
    	findDuplicateCharacter dcf = new findDuplicateCharacter(); 
    	System.out.print("Enter a word:");
		Scanner sc = new Scanner(System.in);
		String wordInput = sc.nextLine();
		//System.out.print(wordInput);
    	//String wordInput = "India is my country";
		String word = wordInput.replaceAll("\\s","").toLowerCase();
        dcf.findIt(word);  
    }  
    
    public void findIt(String str) {  
        Map<Character, Integer> baseMap = new HashMap<Character, Integer>();  
        char[] charArray = str.toCharArray();  
        for (Character ch : charArray) {  
            if (baseMap.containsKey(ch)) {  
                baseMap.put(ch, baseMap.get(ch) + 1);  
            } else {  
                baseMap.put(ch, 1);  
            }  
        }  
        Set<Character> keys = baseMap.keySet();  
        for (Character ch : keys) {  
            if (baseMap.get(ch) > 1) {  
                System.out.println(ch + "  is " + baseMap.get(ch) + " times");  
            }  
        }  
    }  

}
