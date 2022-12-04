package shoppingSystem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingMain {

	public static void main(String[] args) {
		
		List<Product> customer1ProductList = new ArrayList<>();
		
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setName("Cem");
		customer1.setSurname("Yılmaz");
		customer1.setAge(26);
		
		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setName("Ali");
		customer2.setSurname("Kaya");
		customer2.setAge(20);
		
		Customer customer3 = new Customer();
		customer3.setId(3);
		customer3.setName("Mehmet");
		customer3.setSurname("Yıldız");
		customer3.setAge(28);
		
		Customer customer4 = new Customer();
		customer4.setId(4);
		customer4.setName("Cem");
		customer4.setSurname("Taş");
		customer4.setAge(31);
		
		List<Customer> customerList = new ArrayList<>();
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
				
		
		Product product1 = new Product();
		product1.setName("Iphone");
		product1.setCategory("Telefon");
		product1.setPrice(1600);
		product1.setStockInformation(50);
		
		
		
		customer1ProductList.add(product1);

		
		int totalPrice = 0;
		
		for(Product product:customer1ProductList) {
			totalPrice += product.getPrice();
		}
		
		
		Invoice invoice1 = new Invoice();
		invoice1.setId(1);
		invoice1.setTotalPrice(totalPrice);

		
		Invoice invoice2 = new Invoice();

		
		

		Order order1 = new Order();
		order1.setCustomerId(1);
		order1.setInvoice(invoice1);
		order1.setOrderProductsList(customer1ProductList);
		
		Order order2 = new Order();
		order2.setCustomerId(2);
		order2.setInvoice(invoice2);

		
		
		List<Order> order1ProductList = new ArrayList<>();
		
		order1ProductList.add(order1);
		
		
		customer1.setOrderList(order1ProductList);
		
		
		long totalProduct = customerList
				.stream()
				.count();
		System.out.println("Total müşteri sayısı: "+totalProduct);

		int counter=0;
		int totalShopping=0;
		
		for(Customer customer:customerList) {
			if(customer.getName().equals("Cem")) {
				for(Order order:customer.getOrderList()) {
					counter+=order.getOrderProductsList().size();
				}
			}
		}
		System.out.println("Total product numbers: "+counter);
		
		for(Customer customer:customerList) {
			if(customer.getName().equals("Cem") && customer.getAge() < 30 && customer.getAge() > 25) {
				for(Order order:customer.getOrderList()) {
					totalShopping+=order.getInvoice().getTotalPrice();
				}
			}
		}
		System.out.println("Total Price: "+totalShopping);
		
		for(Customer customer:customerList) {
			for(Order order:customer.getOrderList()) {
				if(order.getInvoice().getTotalPrice() > 1500) {
					System.out.println(order.getInvoice());
				}
			}
		}
		
	}

}
