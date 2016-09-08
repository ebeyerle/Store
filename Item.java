package Store;

public class Item {
	
	private double price;
	private String name;
	private double total;


	public void setName(String name){
		this.name = name;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
	
	public String getName(){
		return name;
	}
	
	public void addTotal(double x){
		this.total += x;
	}
	
	public double getTotal(){
		return total;
	}

}
