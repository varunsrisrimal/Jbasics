package datastructures;

import java.util.Stack;

public class Jstack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();

		stack.push("1");
		stack.push("2");
		stack.push("3");

		// look at top object ("3"), without taking it off the stack.
		Object objTop = stack.peek();

		// search for an object
		int index = stack.search("3");

		Object obj3 = stack.pop(); // the string "3" is at the top of the stack.
		Object obj2 = stack.pop(); // the string "2" is at the top of the stack.
		Object obj1 = stack.pop(); // the string "1" is at the top of the stack.

	}

}