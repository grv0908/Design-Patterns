package behavioral.strategy;

public class Item {
	private String name;
	private String id;
	private int price;
	
	public Item(String name, String id, int price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
