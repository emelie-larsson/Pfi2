
public abstract class Mammal extends Animal{    // subklass
	
	private int gestationTime;
	
	public Mammal(String LatinName, int gestationTime) { 		// konstruktor 	
		super(LatinName);
		this.gestationTime=gestationTime;
		
	}
	public int getGestationTime(){		//metod
		return this.gestationTime;
		
	}

}
