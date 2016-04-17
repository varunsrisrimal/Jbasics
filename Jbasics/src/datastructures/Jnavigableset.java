package datastructures;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Jnavigableset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NavigableSet original = new TreeSet();
		original.add("1");
		original.add("2");
		original.add("3");

		// The headSet() method returns a view of the original NavigableSet
		// which only contains elements
		// that are "less than" the given element.
		// The tailSet() method works the same way, except it returns all
		// elements
		// that are higher than the given parameter element.

		// this headset will contain "1" and "2"
		SortedSet headset1 = original.headSet("3");

		// this headset will contain "1", "2", and "3" because "inclusive"=true
		NavigableSet headset2 = original.headSet("3", true);

		// The ceiling() method returns the least (smallest) element in this set
		// that is
		// greater than or equal to the element passed as parameter to the
		// ceiling() method.
		// The floor() method does the opposite of ceiling()

		// ceiling will be "2".
		Object ceiling = original.ceiling("2");

		// floor will be "2".
		Object floor = original.floor("2");

		// The higher() method returns the least (smallest) element in this set
		// that is greater than
		// (not equal too) the element passed as parameter to the higher()
		// method.
		// The lower() method does the opposite of the higher() method.

		// higher will be "3".
		Object higher = original.higher("2");

		// lower will be "1"
		Object lower = original.lower("2");

		// The pollFirst() method returns and removes the "first" element in the
		// NavigableSet or null if the
		// set is empty. The pollLast() returns and removes the "last" element
		// in the set or null if the set is
		// empty. "First" means smallest element according to the sort order of
		// the set. "Last" means largest according
		// to the element sorting order of the set.

		// first is "1"
		Object first = original.pollFirst();

		// last is "3"
		Object last = original.pollLast();

	}

}
