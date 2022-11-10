

import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {

		// Queue= FIFO data structure which means first in first out
		// add = enqueue, offer()
		// remove= dequeue , poll()

		Queue<String> q = new LinkedList<String>();

		// adding
		q.offer("sabin");
		q.offer("sam");
		q.offer("rahul");

		System.out.println(q.peek()); // it shows who is in the first line

		System.out.println(q.isEmpty()); // check whether the line is empty or not
		System.out.println(q.size()); // show the size which means it shoe 3 in here
		System.out.println(q.contains("rahul")); // it means that the is rahul is there in the line.

		// removing

		q.poll(); // it means that sabin will remove and sam will come in first
		q.poll();// it means sam will remove and the rahul will come

		System.out.println("the atm machine have line for " + q);

	}

}
