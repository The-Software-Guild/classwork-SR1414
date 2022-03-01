package CD;

import java.util.Comparator;

public class sortBySinger implements Comparator<CD>{

	@Override
	public int compare(CD o1, CD o2) {
		// TODO Auto-generated method stub
		
		return o1.getSinger().compareTo(o2.getSinger());
	}
	

}
