package model;

import misc.OverallUse;

public class Action {

	//OBJECTS-------------------------------------------------------------
	OverallUse use = new OverallUse();

	//METHODS-------------------------------------------------------------

	//Check's the player's choice and call the method needed.
	public void choice (int choice, Actor actor){
		if (choice == 1){
			check(actor);
		} else if (choice == 2){
			fight(actor);
		} else if (choice == 3){
			item();
		} else if(choice == 4){
			back();
		}
	} //End of Choice

	//Shows the enemy's description
	public void check(Actor actor){
		use.print(actor.getDesc());
	} //End of Check

	//Pulls up the available skills
	public void fight(Actor actor){
		for (Skill skill: actor.getSkills()){

		}
	}
}
