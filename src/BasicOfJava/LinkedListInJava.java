package BasicOfJava;

import java.util.LinkedList;

public class LinkedListInJava {
	
	public static void main(String[] args) {
		
		LinkedList<String> arr = new LinkedList();
		arr.add("hey");
		arr.add("you");
		arr.add("there");
		arr.add("who");
		arr.add("am");
		arr.add("asdfg");
		arr.add("okokokok");
		arr.add("ytutut");
		System.out.println(arr);
		System.out.println("*****************");
		arr.addFirst("hummnmnmnm");
		System.out.println("aftr adding hummn"+arr);
		System.out.println("*****************");
		arr.addLast("plpllplplplp");
		System.out.println(arr);
		System.out.println("*****************");
		arr.removeFirst();
		System.out.println(arr);
//		
//		asasa
//		System.out.println("*******\"using for loop \"**********");
//		for (int i = 0; i<arr.size();i++) {
//			System.out.println(arr.get(i));
//		}
//		
//		System.out.println("*******\"using for advance loop \"**********");
//		for(String s: arr) {
//			System.out.println(s);
//			
//		}
//		
//		
//		System.out.println("*******\"using for Iterator loop \"**********");
//		
//		
	}
	

}
