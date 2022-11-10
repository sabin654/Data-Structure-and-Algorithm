import java.util.Stack;

public class stack {

	public static void main(String[] args) {

		// stack = LIFO data Structure which mean list in first 0ut
		// store object in vertical tower
		// push() to add in top
		// pop() to remove from top

		Stack<String> stack = new Stack<String>();
		// System.out.println(s.empty());

		stack.push("num1");
		stack.push("num2");
		stack.push("num3");
		stack.push("num4");

		stack.pop(); // remome from top which mean it remove num 4
		System.out.println(stack.search("num2"));// search the object kata xa num 2 bahnera
		System.out.println(stack.peek()); // sab bhanda top ma k xa bahnera thahunxa
		System.out.println(stack);

	}

}
