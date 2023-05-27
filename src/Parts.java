
public class Parts {
	
	private String typeOfPart;
	private int price;
	
	
	public Parts(String typeOfPart, int price) {
		super();
		this.typeOfPart = typeOfPart;
		this.price = price;
	}
	
	public void printData() {
		System.out.println(typeOfPart + " " + price + "€");
	}

	public int getPrice() {
		return price;
	}
	
	
}
