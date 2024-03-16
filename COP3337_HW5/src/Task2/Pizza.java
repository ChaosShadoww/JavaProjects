package Task2;

public class Pizza implements FoodItem{
	String name;
	double price;
	String description;
	public Pizza() {
		
	}
	public Pizza(String name, double price, String description) {
	
		
	}
	public String getName() {
		return "Pizza";
	}
	
	public double getPrice() {
		return 15.99;
	}
	
	public String getDescription() {
		return "Oven Baked";
	}
	
	

}
