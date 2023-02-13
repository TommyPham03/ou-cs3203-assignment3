package assignment3;

public class methodArray {

	
public int arrayAdd(int array[]) {
	
	int count = 0;
	int size = array.length;
	
	for(int index = 0; index < size; ++index) {
		count = count + array[index];
	}
	
	return count;
}

public int arrayMulti(int array[]) {
	int count = 1;
	for(int i = 0; i < array.length; i++) {
		count = count * array[i];
	}
	return count;
}
}
