package assignment3;

public class methodArray {

	
public static int arrayAdd(int array[]) {
	
	int count = 0;
	int size = array.length;
	
	for(int index = 0; index < size; ++index) {
		count = count + array[index];
	}
	
	return count;
}

public static int arrayMulti(int array[]) {
	int count = 1;
	for(int i = 0; i < array.length; i++) {
		count = count * array[i];
	}
	return count;
}

public static int [] reverse(int array[]) {
	//int [] arrays = new int [array.length];
	
	 for(int i=0; i<array.length/2; i++){
         int temp = array[i];
         array[i] = array[array.length -i -1];
         array[array.length -i -1] = temp;
     }
	return array;
}
}
