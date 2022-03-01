package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> dayNames = new ArrayList<String>();
		
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		dayNames.add("Sunday");
		
		
		System.out.println(dayNames.toString());
		System.out.println(dayNames.size());
		
		String[] array1 = new String[dayNames.size()];
		dayNames.toArray(array1);
		
		for(int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
			
		}
		
		
		
	}

}
