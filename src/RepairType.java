
public class RepairType {
	
	private String description;
	private int price;
	
	
	public RepairType(String description, int price) {
		super();
		this.description = description;
		this.price = price;
	}
	
	public void printData() {
		System.out.println(description + " " + price + "€");
	}

	public int getPrice() {
		return price;
	}
	
	

}
