package GithubClassRoomList_HomeAssignment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		
		//declare the array 
		Integer[] Arraynum1 = {3, 2, 11, 4, 6, 7};
		Integer[] Arraynum2 ={1, 2, 8, 4, 9, 7};
		
		//List the Array
		List<Integer>List1 = Arrays.asList(Arraynum1);
		List<Integer>List2 = Arrays.asList(Arraynum2);
		
		//find the comparions for using key word as intersection
		List<Integer>intersection = new ArrayList<Integer>(List1);
		intersection.retainAll(List2);
		System.out.println("The comman number are"+intersection);
	}

}
