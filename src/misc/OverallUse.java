package misc;

public class OverallUse {

	/*A method that exists with the sole purpose of
	me not having to write System.out.blah blah all the time*/
	public void print(String message){
		System.out.println(message);
	}

	//Simple random number generator
	public int rng(){
		return (int) (Math.random() * 5) + 1;
	}
}
