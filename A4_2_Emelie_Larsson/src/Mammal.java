
public abstract class Mammal extends Animal{
	
	private int gestationTime;
	
	public Mammal(String LatinName, int gestationTime) {
		super(LatinName);
		this.gestationTime=gestationTime;
		
	}
	public int getGestationTime(){
		return this.gestationTime;
		
	}

}
