package CD;

import java.util.Comparator;

public class CD implements Comparator<CD>{

	String title;
	String singer;

	public CD(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public int compare(CD o1, CD o2) {
		// TODO Auto-generated method stub
		
		return o1.getSinger().compareTo(o2.getSinger());
	}

}
