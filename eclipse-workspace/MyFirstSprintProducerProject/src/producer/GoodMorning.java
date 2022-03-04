package producer;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public @Data @NoArgsConstructor @AllArgsConstructor class GoodMorning implements Greet {

	private String name;

	/*public GoodMorning() {
		
	}
	public GoodMorning(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}*/

	@Override
	public void wish() {
		System.out.println("Good Morning "+name+" wish you an amazing day ahead!");

	}

}
