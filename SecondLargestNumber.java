package GithubClassRoomList_HomeAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SecondLargestNumber {

	

	public static void main(String[] args) {
		
		//for declare the Array
		Integer[] number =  {3, 2, 11, 4, 6, 7};
		
		//convert the array to an arrayList
		List<Integer> numlist = new ArrayList<>(Arrays.asList(number));
		numlist.sort(null);
		System.out.println("Ascending order"+numlist);
		//convert the array to an ascending order.
		
		int SecondLargesNumbert = numlist.get(numlist.size()-2);
		System.out.println("The second Largest Number is"+SecondLargesNumbert);
		
		
		//Find Last Element
				int secondLastElement = number[number.length-2];
				System.out.println("The Last second Element is:"+" "+secondLastElement);
				
				//find second largest Number
				
		
	}

}
