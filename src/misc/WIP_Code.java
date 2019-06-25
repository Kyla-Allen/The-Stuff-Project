package misc;

import java.util.ArrayList;
import java.util.Scanner;

import model.Action;
import model.Actor;
import model.Item;
import model.Actor.Align;
import model.Item.itemType;
import model.Skill;

public class WIP_Code {

//	ALLOW AN ACTUAL BATTLE TO HAPPEN. ACTORS SHOULD BE ABLE TO BE HURT/DIE
//	-Just use a basic hit kinda thing
//		-First, make it so the enemy can die ====> VICTORY MESSAGE
//		-Then, player should die =============> GAME OVER MESSAGE

	//INSTANCES--------------------------------------------------------
	//OBJECTS AND SUCH--------------------------------------------
		static OverallUse use = new OverallUse();
		static Scanner sc = new Scanner(System.in);
		static Actor player = new Actor("Player", "You!", 200, 10, 10, 50, Align.PROTAG);
		static Actor frog = new Actor("Frog", "Cute amphibian", 200, 0, 5, 30, Align.ANTAG );
		static Action action = new Action();
		static Skill skill = new Skill();


	//METHODS----------------------------------------------------------
	public static void basicCombat(){
		use.print(frog.getName() + " has appeared!");
		do {
			use.print(frog.getName() + " has " + frog.getCurrentHp() + "/" + frog.getHP() + " Health");
			use.print("(Press Enter)");
			String whatever = sc.next();
			use.print("You attack!");
			skill.hit(frog, player);
			int damage = frog.getDef() - player.getAtk();
			use.print(frog.getName() + " loses " + damage + " hp!");
		} while (frog.isAlive());

		use.print(frog.getName() + " has died!");
	}

	public static void main (String[] args){

	}


}
