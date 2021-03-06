package com.vinz.monopoly;

import java.util.ArrayList;

public class Land {
	private String name;
	private int position;
	private int group;
	private int price;
	private int owner;
	private int rent;

	public Land(int position, int group, int owner, int price, int rent, String name) {
		super();
		this.name = name;
		this.group = group;
		this.price = price;
		this.position = position;
		this.owner = owner;
		this.rent = rent;
	}
	
	

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getOwner() {
		return owner;
	}

	public void setOwner(int owner) {
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	//Prix r�el du loyer
	public static int creditsToPay(Land land) {
		return land.getRent();
	}

	public static Land findFromBoardPosition(ArrayList<Land> board, int position) {
		return board.stream().filter(land -> land.getPosition() == position).findFirst().orElse(null);
	}
}
