package model;

import java.util.ArrayList;

public class Actor{

	//PROPERTIES------------------------------------------------------------------
	private String NAME;
	private String DESCRIPTION;
	private ArrayList<Skill> skills = new ArrayList<Skill>();
	private ArrayList<Item> items = new ArrayList<Item>();

	//CHOOSE YOUR SIDE DUH DUH DUUUUHHHH
	public enum Align{PROTAG, ANTAG}
	private Align side;

	//Stats------------------------------
	private int HP;
	private int currentHP;
	private int ATK;
	private int DEF;
	private int will;
	private int currentWill;
	private boolean active;

	//CONSTRUCTOR-----------------------------------------------------------------
	//TODO: Make a skills list a parameter
	public Actor(String name, String desc,int hp, int atk, int def, int will, Align side){
		this.NAME = name;
		this.DESCRIPTION = desc;
		this.HP = hp;
		this.currentHP = hp;
		this.ATK = atk;
		this.DEF = def;
		this.will = will;
		this.currentWill = will;
		active = true;
		this.setSide(side);
	}

	//METHODS---------------------------------------------------------------------

	//Getters & Setters------------------

	//Name---
	public String getName(){
		return this.NAME;
	}
	public void setName(String name){
		this.NAME = name;
	}

	//Desc---
	public String getDesc(){
		return this.DESCRIPTION;
	}
	public void setDesc(String desc){
		this.DESCRIPTION = desc;
	}

	//HP-----
	public int getHP() {
		return this.HP;
	}
	public void setHP(int hp) {
		this.HP = hp;
	}

	//currentHp-
	public int getCurrentHp(){
		return this.currentHP;
	}
	public void setCurrentHp(int newHp){
		this.currentHP = newHp;
	}

	//Atk-------
	public int getAtk(){
		return this.ATK;
	}
	public void setAtk(int atk){
		this.ATK = atk;
	}

	//Def------
	public int getDef(){
		return this.DEF;
	}
	public void setDef(int def){
		this.DEF = def;
	}

	//Will-----
	public int getWill(){
		return this.will;
	}
	public void setWill(int will){
		this.will = will;
	}

	//CurrentWill-
	public int getCurrentWill(){
		return this.currentWill;
	}
	public void setCurrentWill(int will){
		this.currentWill = will;
	}

	//Active------
	public boolean getActive() {
		return this.active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

	//Alignment
	public Align getSide() {
		return this.side;
	}
	public void setSide(Align side) {
		this.side = side;
	}

	//Skills
	public ArrayList<Skill> getSkills(){
		return this.skills;
	}
	public void setSkills(ArrayList<Skill> skills){
		this.skills = skills;
	}
	public void addSkill(Skill skill){
		this.skills.add(skill);
	}

	//Item
	public ArrayList<Item> getItems(){
		return this.items;
	}
	public void setItems(ArrayList<Item> items){
		this.items = items;
	}
	public void addItem(Item item){
		this.items.add(item);
	}

	//BATTLE METHODS------------------------------------------------------------------------------


	/*
	 * Method: heal
	 *
	 * This method applies healing effects to target
	 *
	 * Parameters:
	 * curHealth = the initial health of the actor
	 * healAmount = the amount of health to be healed
	 * maxHealth = the maxiumum HP of the actor being healed
	 *
	 * Local Variables:
	 * newHealth = the updated health of the actor being attacked
	 * fullHeal = the sum of the current health and the heal amount
	 */
	public void heal (int curHealth, int healAmount, int maxHealth){
		int newHealth;
		int fullHeal = curHealth + healAmount;
		if (fullHeal > maxHealth){
			newHealth = maxHealth;
		} else {
			newHealth = fullHeal;
		}
		this.setCurrentHp(newHealth);
	}

	//Checks an Actor's hp and sets its active state to FALSE if hp is less than or equal to zero,
	// and then returns the new active state
	public boolean isAlive(){
		if (this.currentHP <= 0){
			this.active = false;
			return false;
		} else {
			return true;
		}
	}
}
