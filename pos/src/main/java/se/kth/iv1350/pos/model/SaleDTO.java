package se.kth.iv1350.pos.model;

import java.util.*;

public class SaleDTO {
	private java.time.LocalTime time;
	private String nameOfStore;
	private double totalDiscount;
	private double totalVAT;
	private double totalPrice;
	private List<Item> items;

	public SaleDTO(java.time.LocalTime time, String nameOfStore, double totalDiscount, double totalVAT,
			double totalPrice, List<Item> items) {
		this.time = time;
		this.nameOfStore = nameOfStore;
		this.totalDiscount = totalDiscount;
		this.totalVAT = totalVAT;
		this.totalPrice = totalPrice;
		this.items = new ArrayList<>();
	}

	public java.time.LocalTime getTime() {
		return this.time;
	}

	public String getNameOfStore() {
		return this.nameOfStore;
	}

	public double getTotalDiscount() {
		return this.totalDiscount;
	}

	public double getTotalVAT() {
		return this.totalVAT;
	}

	public double getTotalPrice() {
		return this.totalPrice;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void updateTotalPrice(double amount, int quantity, double totalVAT) {
		this.totalPrice += (amount * quantity) + (totalVAT * (double)quantity) ;
	}

	public void updateTotalVAT(double vat, int quantity) {
		this.totalVAT += (vat* quantity);
	}

	public void updateItems(Item item) {
		items.add(item);
	}
}
