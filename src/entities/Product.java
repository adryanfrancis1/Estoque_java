package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public double totalValueStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
				+ ", $"
				+ String.format("%.2f", price)
				+ " , "
				+ quantity 
				+ " units , "
				+ "Total $ "
				+ String.format("%.2f", totalValueStock());
	}
	
	public void Haveniceday() {

		System.out.println("");
		System.out.println("******************");
	    System.out.println("________________");
	    System.out.println("|   _     _    |");
	    System.out.println("|  |_|   |_|   |");
	    System.out.println("|      |       |");
		System.out.println("|      |__     |");
	    System.out.println("|   |	    |  |");
	    System.out.println("|   |_______|  |");
	    System.out.println("|______________|");
	}
}
