package selenium_introduction;

public class stringReverse {
	/*public static void main(String[] args) {
		String str = "Reverse";
		String revS = "";
		for(int i=str.length()-1;i>=0;i--) {
			revS = revS+str.charAt(i);
		}
		System.out.print(revS);
	}*/
	
	/*public static void main(String[] args) {
		String str = "Code to reverse a sentence";
		String revS = "";
		String[] stsplit = str.split(" ");
		for (String word : stsplit) {
			revS = word +" "+ revS;
		}
		System.out.print(revS);
	}*/
	
	public static void main(String[] args) {
		int value = 12451;
		int n = 0, num = 0;
		//String[] stsplit = str.split(" ");
		while(value!=0) {
			n=value%10;
			num=num*10+n;
			value/=10;
		}
		System.out.print(num);
	}

}

