package com.velocity.hdfc.kolhapur;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Rajasthan {

	public static void main(String[] args) {
	LinkedHashMap lm =new LinkedHashMap<>();
	lm.put(1,"Pranita");
	lm.put(2, "Rahul");
	lm.put(3, "Enna");
	
	System.out.println(lm);
	
	TreeMap tm = new TreeMap();
	tm.put(10, "Rajesh");
	tm.put(11, "Mahesh");
	tm.put(12,"Piyush");
	
	System.out.println(tm);
	
	Hashtable ht = new Hashtable();
	ht.put(20, "Pravin");
	ht.put(21, "Sandesh");
	ht.put(22, "Pooja");
	ht.put(23, "Madhuri");
	
	System.out.println(ht);
	
	ArrayList list = new ArrayList();
	list.add("School");
	list.add("Empire");
	list.add("Pune");
	list.add(0, "House");
	list.add(1, "Elephant");
	list.add(2, "Laptop");
	
	System.out.println(list);

	}

}
