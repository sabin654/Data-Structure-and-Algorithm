package linear;

public class linear1 {

	public static void main(String[] args) {
		int[] array = { 12, 333, 444, 44 };
		int item = 12;
		int temp = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] == item) {

				System.out.println("it is found in index " + i);
				temp = temp + 1;

			}
		}
		if (temp == 0) {
			System.out.println("it is found in index ");
		}

	}

}
