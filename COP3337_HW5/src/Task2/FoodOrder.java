package Task2;

import java.util.ArrayList;
import java.util.List;

public class FoodOrder implements Order{
	public List<FoodItem> items = new ArrayList<>();
	
	public FoodOrder() {
		
	}
	
	public void addItem(FoodItem item) {
		items.add(item);
		
	}
	
	public double calculateTotal() {
		double total = 0.0;
		for(FoodItem item : items) {
			total += item.getPrice();
		}
		return total;
	}

	
	public void displayOrderDetais() {
		System.out.println("Order Details: ");
		for(FoodItem item : items) {
		System.out.println(item.getName() + "(" + item.getDescription() + "): $" + item.getPrice());
		}
		System.out.println("Total: $" + calculateTotal());
		
		
	}


	

}
