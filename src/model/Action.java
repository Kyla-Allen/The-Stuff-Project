package model;

import java.util.Scanner;

import misc.OverallUse;

public class Action {

	//OBJECTS-------------------------------------------------------------
	OverallUse use = new OverallUse();
	Scanner sc = new Scanner(System.in);

	//METHODS-------------------------------------------------------------

	//Show Potential Choices
	public void showChoices (){
		String blorg = "Choices:\n";
		blorg += "1: Check\n";
		blorg += "2: Fight\n";
		blorg += "3: Item";
		use.print(blorg);
	}

	//Check's the player's choice and call the method needed.
	public void choice (Actor player, Actor enemy){
		//Get User's choice
		showChoices();
		int choice = sc.nextInt();

		//Process choice
		if (choice == 1){
			check(enemy);
		} else if (choice == 2){
			fight(player);
		} else if (choice == 3){
			item(player);
		} else{
			use.print("YOUR CHOICE SUCKS TRY AGAIN!");
			choice(player, enemy);
		}
	} //End of Choice

	//Shows the enemy's description
	private void check(Actor enemy){
		use.print(enemy.getDesc());
	} //End of Check

	//Pulls up the available skills
	private void fight(Actor player){
		int skillNum = 1;
		for (Skill skill : player.getSkills()){
			use.print(skillNum + ": " + skill.getName());
			skillNum ++;
		}
	}

	//Pulls up available items
	private void item(Actor player){
		int itemNum = 1;
		for (Item item: player.getItems()){
			use.print(itemNum + ": " + item.getName());
			itemNum ++;
		}
	}
}
