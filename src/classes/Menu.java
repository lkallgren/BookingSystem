package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Menu {
	
	private List<Meal> meals ;
	
	public List<Meal> filterFirstMenu(){
		return meals.stream().filter(meal -> meal.getMenuType().equals("FIRST")).collect(Collectors.toList());
		}
	
	
			
	public List<Meal> findMeals(Predicate<Meal> searchCriteria) {
		List<Meal> results = new ArrayList<Meal>();

		for (Meal nextMeal : meals) {
			if (searchCriteria.test(nextMeal)) {
				results.add(nextMeal);
			}
		}
		
		return results;
	}
	
	 
	public Menu() {
		 meals = new ArrayList<Meal>();
		 meals.add(new Meal(1, 450, "Entrecote with pommes frites",SectionType.FIRST));
		 meals.add(new Meal(2, 259, "Scured cod with pilaffrice and asparagus",SectionType.FIRST));
		 meals.add(new Meal(3, 199, "Chickencurry with rice",SectionType.ECONOMY));
		 meals.add(new Meal(4, 99, "Swedish meatballs, lingonberryjam and potatoes",SectionType.ECONOMY));
		 
		 }
}
