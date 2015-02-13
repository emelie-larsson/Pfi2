

public class Dog extends Mammal{

	private boolean Stupid;
	
	
	public Dog(String LatinName, int gestationTime, boolean Stupid){
		super(LatinName, gestationTime);
		this.Stupid = Stupid;
		
		
		
	}
	public Dog(String LatinName, int gestationTime, boolean Stupid, String FriendlyName){
		super(LatinName, gestationTime);
		this.Stupid=Stupid;
		super.setFriendlyName(FriendlyName);
		
		
		
	}
	public boolean isStupid(){
		return Stupid;
		
	}
	
	public String getInfo() {
		String notStupid = " is not stupid";
		String isStupid = " is stupid";
		String info = " The dog (" + this.getLatinName() + ") " + getFriendlyName() + " has the gestation time " + this.getGestationTime() + " months, \n and "; 
		if (isStupid()==true){
			
			return info + isStupid;
		}else{
		
		return info + notStupid;
		
	}
	
}}