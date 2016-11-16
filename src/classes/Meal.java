package classes;

public class Meal {
	
	private int mealId;
	private double mealPrice;
	private String mealDescription;
	private SectionType menuType;
	
	public Meal(int mealId, double mealPrice, String mealDescription, SectionType menuType){
		this.mealPrice= mealPrice;
		this.mealDescription = mealDescription;
		this.menuType = menuType;
		this.mealId = mealId;
	}
	
	public int getMealId() {
		return mealId;
	}

	public double getMealPrice() {
		return mealPrice;
	}

	public String getMealDescription() {
		return mealDescription;
	}

	public SectionType getMenuType() {
		return menuType;
	}
	
	@Override
	public String toString() {
		return "Meal: " +  mealId + " " + mealDescription + " price : " + mealPrice
				+ ", menuType=" + menuType;
	}

}
