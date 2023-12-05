package collections;

import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> array_list = new ArrayList<>(10);
		System.out.println(array_list);
		
		for (int i=1;i<=10;i++)	array_list.add(i);					// add
		System.out.println(array_list);
		
		array_list.remove(7);										// remove
		
		for (int j=0;j<array_list.size();j++)	
			System.out.print(array_list.get(j) + " ");				// get
		
		System.out.println("\nAccessing elements using Enhanced for loop");		

		for(int num: array_list)
			System.out.print(num + " ");
		
	}

}
