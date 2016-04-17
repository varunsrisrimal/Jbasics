package datastructures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Jset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set seta = new HashSet();
		seta.add("rock");
		System.out.println(seta.contains("rock"));

		Set setA = new HashSet();

		setA.add("element 0");
		setA.add("element 1");
		setA.add("element 2");

		// access via Iterator
		Iterator iterator = setA.iterator();
		while (iterator.hasNext()) {
			String element = (String) iterator.next();
			System.out.println(element);
		}

	}

}