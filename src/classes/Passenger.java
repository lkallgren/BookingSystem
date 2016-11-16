package classes;

public class Passenger {
	
	private String name;
	private int mealRef;
	
	
	public Passenger(String name){
		this.name = name;
			
	}
	
	public Passenger(String name, int mealId){
		this.name = name;
		this.mealRef = mealId;
			
	}

}
