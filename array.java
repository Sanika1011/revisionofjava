package sanikaworksspace;
import java.util.*;

public class array {
public static void main(String[] args) {
	int [] arr= {1,2,3};
	for(int num : arr) {
		System.out.print(num+" ");
	}
	System.out.println();
	List<Integer> sanika = new ArrayList<Integer>();
	sanika.add(10);
	sanika.add(20);
	sanika.add(10);
	
	System.out.println(sanika);
	System.out.println(sanika.size());
	//sanika.clear();
	System.out.println(sanika.isEmpty());
	System.out.println(sanika.indexOf(10));
	System.out.println(sanika.lastIndexOf(10));
	sanika.remove(2);
	System.out.println(sanika);
}
}
