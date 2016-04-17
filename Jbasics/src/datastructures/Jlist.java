package datastructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Jlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List lista = new ArrayList();
		
		lista.add("element 1");
		lista.add("element 2");
		lista.add("element 3");
		
		lista.add(0,"batman");
		
		for(Object o:lista)
		{
			System.out.println(o);
		}
		
		Iterator iter = lista.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		
		System.out.println("copy elements from one list to another");
		List listb = new ArrayList();
		listb.addAll(lista);
		
		listb.remove(0);
		System.out.println("remove one element from listb");
		for(int i=0;i<listb.size();i++ )
		{
			System.out.println(listb.get(i));
		}		
		
		
		System.out.println("cleared the list");
		lista.clear();
		
		for(int i=0;i<lista.size();i++ )
		{
			System.out.println(lista.get(i));
		}
		
		
		System.out.println("intiate a string type list");
		List<String> listc = new ArrayList();
		listc.addAll(listb);
		
		for(String temp : listc)
		System.out.println(temp);
		
		System.out.println("\n searching for an item in the list");
		if(listc.contains("element 1"))
			System.out.println("true");
		else
			System.out.println("false");
		
		System.out.println("implementation of 2d list");
		
		ArrayList<ArrayList<String>> ll = new ArrayList();
		
		ll.add((ArrayList<String>) listc);
		
		System.out.println("printing elements in 2d arraylist");
		for(int i=0 ; i<ll.size();i++)
			for(int j=0; j<ll.get(i).size();j++)
				System.out.println(ll.get(i).get(j));
		
	
		
	}

}
