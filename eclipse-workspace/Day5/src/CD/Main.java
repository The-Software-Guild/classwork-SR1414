package CD;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<CD> cdList = new ArrayList<CD>();
		cdList.add(new CD("Steal this album!", "System of a Down"));
		cdList.add(new CD("Made in Heaven", "Queen"));
		cdList.add(new CD("Thriller", "Michael Jackson"));
		cdList.add(new CD("Dark Side of the Moon", "Pink Floyd"));
		cdList.add(new CD("Back in Black", "AC/DC"));
		
		System.out.println();
		
		System.out.println("Unsorted\n");
		for(int i = 0; i < cdList.size(); i++) {
			System.out.println(cdList.get(i).getTitle() + " - " + cdList.get(i).getSinger());
		}
		
		System.out.println("\nSorted");
		
		Collections.sort(cdList, new sortBySinger());
		for(int i = 0; i < cdList.size(); i++) {
			System.out.println(cdList.get(i).getTitle() + " - " + cdList.get(i).getSinger());
		}
		
		System.out.println(cdList);
		
		
		
	}
	

}
