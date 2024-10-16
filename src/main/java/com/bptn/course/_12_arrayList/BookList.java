package com.bptn.course._12_arrayList;

import java.util.ArrayList;

importjava.util.ArrayList;
public class BookList {

	public static void main(String[] args) {
		//Create a new ArrayList called "myBooks"
		ArrayList<String>myBooks=new ArrayList<>();
		
		//Add 3 favorite books to list
		myBooks.add("DarkMatter".toLowerCase());
		myBooks.add"Chalie and Chocolate Factory".toLowerCase());
		myBooks.add("Harry Porter".toLowerCase());//when you want in lower case
		
		//Display Books
		System.out.println("Myfavorite books are' +myBooks);"
				 for(String book.myBooks{
					 System.out.println("Books" + counter + " " +book);
					 
				 }
				  //Display the first book from list
				 System.out.println(myBooks.getFirst());
				 System.out.println(myBooks.get(0));
				 //System.out.println(myBooks[];
				 
				 
				// Delete the second book
				 
				myBooks.remove(1);
			System.out.println("My favorite books are " + my books);
				
			System.out.println("The size of the list is " +myBooks.size());
			System.out.println("The last item of the list is " + myBooks.get(myBooks.size() -1));
}

}



