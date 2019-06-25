package model;

public class Skill{

	//VARIABLES----------------------------------------------
	private String name;
	private int WPcost;

	//CONSTRUCTOR---------------------------------------------
	public Skill (String name, int WPcost){
		this.setName(name);
		this.setWPcost(WPcost);
	}

	public Skill (){}

	//GETTER AND SETTERS--------------------------------------

	//NAME
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	//WP COSTs
	public int getWPcost() {
		return WPcost;
	}
	public void setWPcost(int wPcost) {
		WPcost = wPcost;
	}

	//EXAMPLE SKILLS--------------------------------------------

	//Normal Attack
	public void hit(Actor hurtee, Actor attacker){
		int newHealth;
		int damage = attacker.getAtk() - hurtee.getDef();
		newHealth = hurtee.getCurrentHp() - damage;
		hurtee.setCurrentHp(newHealth);
	}

	//Heal Method
	public void healSkill(Actor character){
		int healAmount = character.getHP() / 4;
		character.heal(character.getCurrentHp(), healAmount, character.getHP());
	}


}
