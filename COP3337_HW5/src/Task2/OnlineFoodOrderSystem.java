package Task2;
public class OnlineFoodOrderSystem {

	public static void main(String[] args) {
		FoodItem pizza = new Pizza();
		FoodItem burger = new Burger();
		FoodItem salad = new Salad();
		Order order = new FoodOrder();
		order.addItem(pizza);
		order.addItem(burger);
		order.addItem(salad);
		order.displayOrderDetais();






	}

}

