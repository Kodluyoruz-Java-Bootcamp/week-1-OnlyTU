package shoppingSystem;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private int id;
	private String name;
	private String surname;
	private int age;
	
	List<Order> orderList = new ArrayList<>();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public Customer() {
		super();
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public Customer(int id, String name, String surname, int age, List<Order> orderList) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.orderList = orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}	

}
