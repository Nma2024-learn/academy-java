package com.bptn.course._13_Iterator;
import java.util.iterator;
public class IteratorDemo {
	

	ArrayList<String> myBooks = new ArrayList<>();


	  // Add 3 favorite books to this list
	  myBooks.add("Dark Matter".toLowerCase());
	  myBooks.add("Charlie and the Chocolate Factory".toLowerCase());
	  myBooks.add("Harry Potter".toLowerCase());


	  // Display all books
	  Iterator<String> iterator = myBooks.iterator();


	  while (iterator.hasNext()) {
	   String bookName = iterator.next();
	   System.out.println(bookName);
	  }
}
