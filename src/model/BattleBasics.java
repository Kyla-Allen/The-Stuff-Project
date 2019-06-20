package model;

public class BattleBasics extends Actor{

	//CONSTRUCTOR
	public BattleBasics(String name, String desc, int hp, int atk, int def, int will) {
		super(name, desc, hp, atk, def, will);
	}

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
