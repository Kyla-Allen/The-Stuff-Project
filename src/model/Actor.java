package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Actor{

	//PROPERTIES------------------------------------------------------------------
	private String NAME;
	private String DESCRIPTION;
	ArrayList<Skill> skills = new ArrayList<Skill>();

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


	//BATTLE METHODS------------------------------------------------------------------------------

	/*Method: getHurt
	 * The point of this method is to apply damage done to the enemy.
	 *
	 * Parameters:
	 * curHealth = the initial health of the actor
	 * enemyDef = the defense of the actor
	 * attackerStrength = the attack power of the attacker
	 *
	 *Local Variables:
	 *newHealth = the updated health of the actor being attacked
	 *damage = the damage done
	 *
	 */
	public void getHurt(int curHealth, int enemyDef, int attackerStrength){
		int newHealth;
		int damage = enemyDef - attackerStrength;
		newHealth = curHealth - damage;
		this.setCurrentHp(newHealth);
	}

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

	//This won't be used this stage.
	public void die (boolean active){
		this.setActive(false);
	}

}
