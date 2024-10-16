package com.bptn.course.TeachBackWk3;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class CodeDemo {

	public static void main(String[] args) {
		
		         //HashMap
		HashMap<Integer,String> hashMap=new HashMap<>();
		hashMap.put(1,"one");
		hashMap.put(2,"two");
		hashMap.put(10,"ten");
		hashMap.put(6, "Six");
		hashMap.put(null,null);
		System.out.println("HashMap: " + hashMap);
			
	
		     //LinkedHashMap
		LinkedHashMap<Integer,String> linkedHashMap=new  LinkedHashMap<>();
		linkedHashMap.put(1,"one");
		linkedHashMap.put(2,"two");
		linkedHashMap.put(10,"ten");
		linkedHashMap.put(6, "Six");
		linkedHashMap.put(null,null);
		System.out.println("linkedHashMap: "+linkedHashMap);

	      //TreeMap
		TreeMap<Integer,String> treeMap=new TreeMap<>();
		treeMap.put(1,"one");
		treeMap.put(2,"two"); 
		treeMap.put(10,"ten");
		treeMap.put(6, "Six");
		treeMap.put(9, null);  //Nullpointerexception
		System.out.println("TreeMap:" +treeMap);
		
	}

}
