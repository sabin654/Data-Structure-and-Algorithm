package linear;

public class linear {

	public static void main(String[] args) {

		// linear search = iterate one elemnet at a time
		// runtime complexity : O(n)

		// disadvantage = slow for large data set
		// advantages= fast for small data set
		// does not need to be sorted
		// useful for data structure that do not have random acess
		
		

		int[]array = {1,2,5,4,22,40}; // list of number 
		
		int index = linearSearch(array,1); // seaching number 4 from array in index
		
		
		
		if(index!=0) {
			System.out.println("elemnet found  "+ index);
		}
		else {
			System.out.println("elemnet not found  ");
		}

	}

	private static int linearSearch(int[] array, int value) {
		
		for(int i =0;i<array.length;i++) {
			if (array[i]==value) {
				
				return i;
			}
			
			
		}
		
		
		return -1;
	}

}
