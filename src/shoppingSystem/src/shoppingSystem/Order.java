package shoppingSystem;

import java.util.ArrayList;
import java.util.List;

public class Order {

		private int customerId;
		private Invoice invoice;
		
		List<Product> orderProductsList = new ArrayList<>();

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}


		public Order(int customerId, Invoice invoice, List<Product> orderProductsList) {
			super();
			this.customerId = customerId;
			this.invoice = invoice;
			this.orderProductsList = orderProductsList;
		}

		public Order() {
			super();
		}

		public Invoice getInvoice() {
			return invoice;
		}

		public void setInvoice(Invoice invoice) {
			this.invoice = invoice;
		}

		public List<Product> getOrderProductsList() {
			return orderProductsList;
		}

		public void setOrderProductsList(List<Product> orderProductsList) {
			this.orderProductsList = orderProductsList;
		}
	
	}