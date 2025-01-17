package composition.challenge;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String [] args) {
		
		
		// Product
		int productId = 1;
		String productName = "Notebook";
		double productPrice = 6300.0;
		Product product1 = new Product(productId, productName, productPrice);
		
		System.out.println("Product: " + product1);
		
		// Product quantity
		int itemId = 1;
		int itemQuantity = 2;
		Item item1 = new Item(itemId, itemQuantity, product1);
		
		List<Item> itemList1 = new ArrayList<Item>();
		itemList1.add(item1);
		
		System.out.println("Item: " + itemList1);
		
		// Purchase
		int purchaseId = 1;
		Purchase purchase1 = new Purchase(purchaseId, itemList1);
		
		System.out.println("Purchase: " + purchase1);
		
		// Client
		int clientId = 1;
		String clientName = "Igor Borba";
		String clientCpf = "01234567890";		
		Client client1 = new Client(clientId, clientName, clientCpf);
		
		System.out.println("Client: " + client1);
		
		
		Purchase purchase2 = new Purchase();
		purchase2.setItems(productId, clientName, productPrice, itemId, itemQuantity);
		System.out.println("Item + Product: " + purchase2);
		
		
		client1.setPurchase(purchase2);
		System.out.println("Client + Purchase: " + client1);
		
		System.out.println("Total price: " + client1.getTotalPrice());
		
	}
}
