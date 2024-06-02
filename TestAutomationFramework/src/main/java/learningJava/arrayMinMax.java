package learningJava;

import java.util.Arrays;

public class arrayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arg1 = {4,1,5,3,2};
		int len = arg1.length;
		Arrays.sort(arg1);
		System.out.println("Print sorted array: "+arg1);
		System.out.println("Max number in the array is: "+arg1[len-1]);
		System.out.println("Min number in the array is: "+arg1[0]);
	}

}
