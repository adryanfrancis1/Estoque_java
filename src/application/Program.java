package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		int decision = 0;

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Product product = new Product();

		int n = 0;

		System.out.println("ENTER PRODUCT DATA: ");
		System.out.println("NAME: ");
		product.name = sc.nextLine();
		System.out.println("PRICE: ");
		product.price = sc.nextDouble();
		System.out.println("QUANTITY: ");

		product.quantity = sc.nextInt();

		System.out.println("Product data " + product);
		System.out.println();
		
		System.out.println("enter 1 for the added product and 2 to remove");
		n = sc.nextInt();

		do {
			if (n == 1) {

				System.out.println("Enter the number of products to be added in stock: ");
				product.addProducts(sc.nextInt());
				System.out.println();
				System.out.println("Update data " + product);

				options();

				n = sc.nextInt();

			} else if (n == 2) {

				System.out.println();
				System.out.println("Enter the number of products to be removed from stock: ");
				product.removeProducts(sc.nextInt());
				System.out.println("Update data " + product);

				options();

				n = sc.nextInt();

			}

		} while (n != 3);
		
		product.Haveniceday();
		System.out.println("");
		System.out.println("Thank you, have a nice day ");
		
		sc.close();

	}

	public static void options() {

		System.out.println(
				"*********************" + "\n1 - added product" + "\n2 - remove product" + "\n3 - end of operation");

	}

}
