package datastructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Jqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// The order in which the elements added to the Queue are stored
		// internally, depends on the implementation.
		// The same is true for the order in which elements are retrieved from
		// the queue.

		// To add elements to a Queue you call its add() method.
		Queue queueA = new LinkedList();
		queueA.add("element 1");
		queueA.add("element 2");
		queueA.add("element 3");

		// You can peek at the element at the head of the queue without taking
		// the element out of the queue. This is done
		// via the element() method.
		Object firstElement = queueA.element();

		// You can also iterate all elements of a queue
		Iterator iterator = queueA.iterator();
		while (iterator.hasNext()) {
			String element = (String) iterator.next();
		}

		// To take the first element out of the queue, you use the remove()
		// method.
		Object firstElement1 = queueA.remove();

	}

}
