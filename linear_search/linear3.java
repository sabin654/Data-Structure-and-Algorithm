package linear;

public class linear3 {

	public static void main(String[] args) {
		
		int[]collect= {1,2,9,10,22,55,66,78};
		
	     int term =linearSearch(collect,1);
	     
	     if(term!=-1) {
	    	 System.out.println("we have founf"+term);
	    	 
	     }
	     else {
	    	 
	    	 System.out.println("we have not found");
	     }
		
	}

	private static int linearSearch(int[] collect, int value) {
		
		for (int i=0;i<collect.length;i++) {
			if (collect[i]==value) {
				return i;
			}
		}
		
		return -1;
	}

}
