package model;

public class Skill extends Actor{


	public Skill(String name, String desc, int hp, int atk, int def, int will, Align side) {
		super(name, desc, hp, atk, def, will, side);
	}

	//VARIABLES----------------------------------------------
	private String name;
	private int WPcost;

	//METHODS-------------------------------------------------

	//Normal Attack
	public void hit(Actor hurtee, Actor attacker){
		hurtee.getHurt(hurtee.getCurrentHp(), hurtee.getDef(), attacker.getAtk());
	}

	//Strong Attack
	public void strongHit(Actor hurtee, Actor attacker){
		int attackPwr = attacker.getAtk() * 2;
		hurtee.getHurt(hurtee.getCurrentHp(), hurtee.getDef(), attackPwr);
	}


}
