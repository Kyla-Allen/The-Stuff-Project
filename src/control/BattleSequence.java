package control;
import java.util.ArrayList;

import misc.OverallUse;
import model.Action;
import model.Actor;
import model.Actor.Align;
import model.Item;
import model.Item.*;

public class BattleSequence {

	//OBJECTS AND SUCH--------------------------------------------
	static OverallUse use = new OverallUse();
	static Actor player = new Actor("Player", "You!", 200, 10, 10, 50, Align.PROTAG);
	static Actor frog = new Actor("Frog", "Cute amphibian", 200, 5, 5, 30, Align.ANTAG );
	static Action action = new Action();

	static Item herb = new Item("Herb", itemType.HEAL);
	static Item soda = new Item("Soda", itemType.HEAL);
	static Item knife = new Item("Knife", itemType.HURT);

	//DUMB METHOD FOR ITEM LIST------------------------------------
	//PLAN IS TO MAKE THIS METHOD UNECESSARY-----------------------
	private static ArrayList<Item> makeList(Item item1, Item item2, Item item3){
		ArrayList<Item> playerItems = new ArrayList<Item>();
		playerItems.add(item1);
		playerItems.add(item2);
		playerItems.add(item3);
		return playerItems;
	}


	//Like....Sub Objects or something
	//ACTUAL SEQUENCE---------------------------------------------
	public static void flow (){

	}


	//MAIN--------------------------------------------------------
	public static void main(String[] args) {

		//INSERT BATTLE STAGE TO RUN HERE
	}//END OF MAIN

}
