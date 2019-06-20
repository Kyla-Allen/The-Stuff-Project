package control;
import misc.OverallUse;
import model.Actor;

public class BattleSequence {

	static OverallUse use = new OverallUse();
	static Actor frog = new Actor("Frog", "Cute amphibian", 200, 5, 5, 30);

	//MAIN--------------------------------------------------------
	public static void main(String[] args) {

		use.print(frog.getName() + " appeared!");

	}//END OF MAIN

}
