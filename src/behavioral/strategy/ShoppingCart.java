package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<Item> items;
	int sum = 0;
	
	public ShoppingCart() {
		this.items = new ArrayList<>();
	}
	
	public void addItem(Item item) {
		this.items.add(item);
		sum += item.getPrice();
	}
	
	public void removeItem(Item item) {
		this.items.remove(item);
		sum -= item.getPrice();
	}
	
	public int calculateTotalPrice() {
		return sum;
	}
	
	public void pay(PaymentStrategy paymentMethod) {
		paymentMethod.pay(sum);
	}
}
