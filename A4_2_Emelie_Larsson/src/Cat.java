
public class Cat extends Mammal{
	
	private int NumberOfLives;
	
	public Cat(String LatinName, int GestationTime, int NumberOfLives) {
		super(LatinName, GestationTime);
		this.NumberOfLives = NumberOfLives;
	
	
	}
	public int getNumberOfLives(){
		return this.NumberOfLives;
		
	
	}
	public int setNumberOfLives(int i){
		return i;

	
	}
	public String getInfo() {
		String info = " The cat (" + this.getLatinName() + ") " + getFriendlyName() +  " has the gestation time " + this.getGestationTime() + " months, \n and has " + NumberOfLives + " lives"; 
		return info;
		
	}
	
}
