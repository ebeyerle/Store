package Store;

import java.util.ArrayList;

public class CalcPrice {
	
	Item apple = new Item();
	Item bread = new Item();
	Item chips = new Item();
	Item soda = new Item();
	Item total = new Item();
	
	ArrayList<Item> itemList = new ArrayList<Item>();
	ArrayList<String> nameList = new ArrayList<String>();
	ArrayList<Double> priceList = new ArrayList<Double>();

	
	public void fillList(){
		
		apple.setName("Apple");
		apple.setPrice(.75);
		itemList.add(apple);
		
		bread.setName("Bread");
		bread.setPrice(2.25);
		itemList.add(bread);
		
		chips.setName("Chips");
		chips.setPrice(2);
		itemList.add(chips);
		
		soda.setName("Soda");
		soda.setPrice(1.50);
		itemList.add(soda);
	}
	
	public void Checkout(int num){
		
		num--;
		
		String selectedItem = itemList.get(num).getName();
		double itemPrice = itemList.get(num).getPrice();
		
		total.addTotal(itemPrice);
		
		nameList.add(selectedItem);
		priceList.add(itemPrice);
		
		System.out.println(selectedItem+" is "+itemPrice);
		
	}
	
	public double reciept(){
		return total.getTotal();
	}

	public void displayPurchase() {
		
		for(int i = 0; i < nameList.size(); i++){
			System.out.println(nameList.get(i)+": $"+ priceList.get(i));
		}
		
	}

	public double calculateTax(double subtotal) {
		double tax;
		tax = subtotal * (.07);
		return tax;
	}

}
