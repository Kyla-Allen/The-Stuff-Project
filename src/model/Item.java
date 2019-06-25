package model;

public class Item {

	//PROPERTIES-----------------------------------------
	private String name;
	public enum itemType { HEAL, HURT}
	private itemType itemType;

	//CONSTRUCTOR----------------------------------------
	public Item(String name, itemType itemType) {
		this.name = name;
		this.setItemType(itemType);
	}

	//GETTER AND SETTERs---------------------------------

	//NAME
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	//ITEMTYPE
	public itemType getItemType() {
		return itemType;
	}
	public void setItemType(itemType itemType) {
		this.itemType = itemType;
	}


}
