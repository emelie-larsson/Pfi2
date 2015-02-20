

public class Dog extends Mammal{
 boolean Stupid;		//instansvariabel
	
	
	public Dog(String LatinName, int gestationTime, boolean Stupid){
		super(LatinName, gestationTime);
		this.Stupid = Stupid;
		
		
		
	}
	public Dog(String LatinName, int gestationTime, boolean Stupid, String FriendlyName){ //konstruktor
		super(LatinName, gestationTime);
		this.Stupid=Stupid;
		super.setFriendlyName(FriendlyName);
		
		
		
	}
	public boolean isStupid(){ // metod
		return Stupid;
		
	}
	
	public String getInfo() { // metod
		String notStupid = " is not stupid";
		String isStupid = " is stupid";
		String info = " The dog (" + this.getLatinName() + ") " + getFriendlyName() + " has the gestation time " + this.getGestationTime() + " months, \n and "; 
		if (isStupid()==true){
			
			return info + isStupid;
		}else{
		
		return info + notStupid;
		
	}
	
}}