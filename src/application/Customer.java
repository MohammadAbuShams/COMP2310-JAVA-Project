package application;

import java.util.ArrayList;

public class Customer {
	// properties.
	private String name;
	private String address;
	private String plan;
	private ArrayList<String> receiving = new ArrayList<>();
	private ArrayList<String> rented = new ArrayList<>();
	protected static int limitedPlanLimit=2;
	private String id;
	private String mobile_number;

	// Generate non argument constructor.
	public Customer() {
		super();
	}

	// Generate an argument constructor.
	public Customer(String name, String address, String plan, String id, String mobile_number) {
		super();
		this.name = name;
		this.address = address;
		this.id = id;
		this.mobile_number = mobile_number;
		if (plan.toUpperCase().equals("LIMITED") || plan.toUpperCase().equals("UNLIMITED"))// Condition for plan.
			this.plan = plan;
		else
			throw new IllegalArgumentException();// Exception.

	}

	// Generate setters and getters.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public ArrayList<String> getReceiving() {
		return receiving;
	}

	public void setReceiving(ArrayList<String> receiving) {
		this.receiving = receiving;
	}

	public ArrayList<String> getRented() {
		return rented;
	}

	public void setRented(ArrayList<String> rented) {
		this.rented = rented;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

// Override toString.
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", plan=" + plan + ", receiving="
				+ receiving + ", rented=" + rented + ", mobile_number=" + mobile_number + "]";
	}

}