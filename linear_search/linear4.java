package linear;

public class linear4 {

	public static void main(String[] args) {
		
		int []array = {2,4,6,9,1,5,7};
		int item =linearSearch (array,2);
		

	if (item!=-1) {
		System.out.println("iu have found "+item );
		
	}

	else {
		System.out.println("u have not");
		
		
	}
	
	
	
	}
	private static int linearSearch(int[] array, int value) {
	for(int i=0;i<=array.length;i++) {
		if (array[i]==value) {
			return i;
	}
		
	}
	return -1;
	
}

}

	