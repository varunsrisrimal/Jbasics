package datastructures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Jhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map mapA = new HashMap();
		mapA.put("key1", "element 1");
		mapA.put("key2", "element 2");
		mapA.put("key3", "element 3");		
		
		// key iterator
		Iterator iterator1 = mapA.keySet().iterator();
		// value iterator
		Iterator iterator2 = mapA.values().iterator();
	}

}