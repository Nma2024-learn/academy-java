package com.bptn.course._04__Arrays_List_Basics;

public class ArraysListBasics {

	public static void main(String[] args) {
		import java.util.ArrayList;

		public class ArrayListExample {
		    public static void main(String[] args) {
		        // Create an ArrayList of integers
		        ArrayList<Integer> arrayList = new ArrayList<>();

		        // Add elements to the ArrayList
		        arrayList.add(73);
		        arrayList.add(5);
		        arrayList.add(14);
		        arrayList.add(555);
		        arrayList.add(9);
		        arrayList.add(777);

		        // Print the original ArrayList
		        System.out.println("Original ArrayList: " + arrayList);

		        // Adding an element at the beginning
		        arrayList.add(0, 25);
		        System.out.println("After adding 25 at index 0: " + arrayList);

		        // Remove the element at index 1 (original element 73)
		        arrayList.remove(1);
		        System.out.println("After removing element at index 1: " + arrayList);

		        // Update the element at index 2 (now it’s 14) to 35
		        arrayList.set(2, 35);
		        System.out.println("After updating element at index 2 to 35: " + arrayList);

		        // Get the element at index 4
		        int element = arrayList.get(4);
		        System.out.println("Element at index 4: " + element);

		        // Print the size of the ArrayList
		        System.out.println("Size of the ArrayList: " + arrayList.size());
		    }
		}

		Original ArrayList: [73, 5, 14, 555, 9, 777]
				After adding 25 at index 0: [25, 73, 5, 14, 555, 9, 777]
				After removing element at index 1: [25, 5, 14, 555, 9, 777]
				After updating element at index 2 to 35: [25, 5, 35, 555, 9, 777]
				Element at index 4: 9
				Size of the ArrayList: 6

	}

}
