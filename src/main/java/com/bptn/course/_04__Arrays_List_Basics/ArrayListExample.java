package com.bptn.course._04__Arrays_List_Basics;

public class ArrayListExample {
	   public static void main(String[] args) {
	        // Create an ArrayList of integers to store numbers
	        ArrayList<Integer> arrayList = new ArrayList<>();

	        // Add elements to the ArrayList
	        arrayList.add(10);
	        arrayList.add(20);
	        arrayList.add(30);
	        arrayList.add(40);

	        // Access and print elements in the ArrayList using a for-each loop
	        System.out.println("ArrayList Elements:");
	        for (int element : arrayList) {
	            System.out.println(element);
	        }

	        // Update an element at index 2 (third element) to 35
	        arrayList.set(2, 35);

	        // Remove an element at index 1 (second element, which is 20)
	        arrayList.remove(1);

	        // Print the size of the ArrayList
	        System.out.println("Size of ArrayList: " + arrayList.size());

	        // Print the updated ArrayList elements after modification
	        System.out.println("Updated ArrayList Elements:");
	        for (int element : arrayList) {
	            System.out.println(element);
	        }
	    }
	}

