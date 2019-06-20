package model;

import java.util.HashMap;

public class Actor {

	//PROPERTIES------------------------------------------------------------------
	private String NAME;
	private String DESCRIPTION;
	private HashMap[] skills;

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

}
