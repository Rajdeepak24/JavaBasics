package BasicOfJava;
import java.util.ArrayList;
public class ArrayListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList  arr =  new ArrayList();
	      arr.add("2");
	      arr.add("3");
	      arr.add("4");
	      arr.add("5");
	      arr.add("6");
	      arr.add("7");
	      arr.add("888");
	      arr.add("9");
	      arr.add(51);
	      System.out.println("before"+arr);
	      arr.remove(5);
	      System.out.println("after"+arr);
	      
	      ArrayList  arr2 =  new ArrayList();
	      arr2.add(42);
	      arr2.add(56);
	      arr2.add("adc");
	      arr2.add("dc");
	      arr2.add(990);
	      System.out.println("arry 2"+arr2);
	      
	      // if we want to add two array
	      arr.addAll(arr2);
	      System.out.println("merged"+arr);
	      
//	  	for (int i = 0 ; i<arr.size(); i++) {
//			System.out.println(arr.get(i));
//			
//		}
	      
	     //if we want print all common element on noth array
	      arr.retainAll(arr2);
	      System.out.println("coomon are"+ arr);

	}

}
