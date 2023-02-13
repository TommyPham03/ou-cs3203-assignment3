package assignment3;

public class methodArray {

	
public int add(int array[]) {
	
	int count = 0;
	int size = array.length;
	
	for(int index = 0; index < size; ++index) {
		count = count + array[index];
	}
	
	return count;
}
}
