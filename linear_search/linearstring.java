package linear;

public class linearstring {

	public static void main(String[] args) {

		String[] array = { "sabin", "rahl", "ram", "hari" };

		String term = "t";
		int temp = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == term) {
				System.out.println("the term are in " + i + "positon");
				temp = temp + 1;

			}

		}

		if (temp == 0) {
			System.out.println("the term are in not positon");

		}

	}

}
