package GithubClassRoomList_HomeAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMissingElement {

	private static final List<Integer> MissingNumber = null;

	public static void main(String[] args) {
		
		
		//To declare Array
	Integer[] Sets =  {1, 2, 3, 4, 10, 6, 8};
	
	//Array ascending Order
	
	List<Integer>NumberList = new ArrayList<>(Arrays.asList(Sets));
	NumberList.sort(null);
	System.out.println("The Ascending Order:"+NumberList);
	
	
	//Missing Numbers
	
	List<Integer>MissingNumbers = new ArrayList();
	
	for (int i = 0; i < NumberList.size()-1; i++) {
		
		if (NumberList.get(i) + 1 != NumberList.get(i + 1)) {
		
			//There is the gap, add the missing number in NumberList
			
		for (int j = NumberList.get(i)+1; j<NumberList.get(i+1);j++) {
			MissingNumbers.add(j);
			
		} 
		}
	}
		System.out.println("The Gaps of numbers are"+MissingNumbers);
	}
	
	}
	