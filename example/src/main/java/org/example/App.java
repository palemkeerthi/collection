package org.example;
import java.util.ArrayList;
import java.util.Collection;


public class Test {
	

	
	public static void main(String[] args) {
		
		
        
		Collection<Integer> list = new ArrayList<>(10);
		addNumber(list, 10);
		addNumber(list, 2);
		addNumber(list, 7);
		addNumber(list, 4);
		addNumber(list, 6);
		addNumber(list, 8);
	    removeNumber(list, 6);
	    printList(list);
		fetchNumber1((ArrayList<Integer>) list, 5);
	}
	private static void fetchNumber1(ArrayList<Integer> list, int i) {
		// TODO Auto-generated method stub
		
	}
	private static boolean addNumber(Collection<Integer> list1,int n) {
		list1.add(n);
		System.out.println(n +"is has been added to the list.");
		return true;
	}
	private static boolean removeNumber(Collection<Integer> list1,int n) {
		if(list1.contains(n)) {
			list1.remove(n);
		   System.out.println(n +"is has been removed from the list.");
		   return true;
	
	}else {
		System.out.println(n+"is not available in the list.");
		return false;
	}
	}
	private static void printList(Collection<Integer> list1) {
		for (int i: list1) {
			System.out.println("the elements are : "+i);
		}
	}
	
	@SuppressWarnings("unused")
	private static int fetchNumber(ArrayList<Integer> list1, int i) {
		if(list1.get(i) >  list1.size()) {
			throw new IndexOutOfBoundsException();
			
		}
		else {
			System.out.println("the item is " +list1.get(i));
			return list1.get(i);
		}
	}
}


