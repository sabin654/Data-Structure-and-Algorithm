package binary_search;

//code by sabin

public class binarysearch {

	public static void main(String[] args) {

		// Binaray search = always in sorted form

		int item[] = { 1, 3, 5, 8, 9, 10, 13, 15, 19, 20, 22, 23, 29, 30 };
		int search = 19;
		int lowerindex = 0;
		int higherindex = item.length - 1;
		int middleindex = (lowerindex + higherindex) / 2;

		while (lowerindex <= higherindex) {

			if (item[middleindex] == search) {

				System.out.println("the index are in " + middleindex + " positon");
				break;

			}

			else if (item[middleindex] < search) {
				lowerindex = middleindex + 1;
			}

			else {

				higherindex = middleindex - 1;
			}

			middleindex = (lowerindex + higherindex) / 2;

		}

		if (lowerindex > higherindex) {
			System.out.println("the index are not listed");

		}
	}
}
