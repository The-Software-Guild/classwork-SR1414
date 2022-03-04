package producer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public @Data @NoArgsConstructor @AllArgsConstructor class GoodEvening implements Greet {

	private String name;

	/*public GoodEvening() {
		
	}
	public GoodEvening(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}*/

	@Override
	public void wish() {
		System.out.println("Good Evening "+name+" hope you had an awesome day!");

	}

}
