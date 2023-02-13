package assignment3;

import java.util.Arrays;

public class main extends methodArray{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array [] = new int[5];
		array[0] = 1;
		array[1] = 1;
		array[2] = 1;
		array[3] = 1;
		array[4] = 3;
		
		System.out.println(arrayAdd(array));
		System.out.println(arrayMulti(array));
		
		System.out.println(Arrays.toString(reverse(array)));

	}

}
