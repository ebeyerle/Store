package Store;

import java.util.Scanner;

public class mainFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		CalcPrice price = new CalcPrice();
		price.fillList();
		int x = 1;
		
		System.out.println("Welcome to Fresh Foods");
		System.out.println();
		System.out.println("Please select an from the list:");
		System.out.println("1-Apple");
		System.out.println("2-Bread");
		System.out.println("3-Chips");
		System.out.println("4-Soda");
		System.out.println();					
		System.out.println("Enter an item into shopping cart(Type 0 when finished)");
		
		do{
			int n = read.nextInt();
			
			if (n >= 1 && n <= 4){
				price.Checkout(n);
				System.out.println("Item scanned");
			}else if(n == 0){
				x = 2;
			}else{
				System.out.println("Invalid input");
				x = 1;
			}	
		}while(x == 1);
		
		double subtotal = price.reciept();
		double tax = price.calculateTax(subtotal);
		double rounded_tax = (double) Math.round(tax*100)/100;
		double total = subtotal + rounded_tax;
		
		System.out.println();
		System.out.println("Items purchased:");
		price.displayPurchase();
		System.out.println("_____________");
		System.out.println("Subtotal: $"+subtotal);
		System.out.println("Tax: $"+rounded_tax);
		System.out.println("Total: $"+(total));
	}

}
