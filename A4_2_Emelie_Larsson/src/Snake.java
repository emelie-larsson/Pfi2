
public class Snake extends Animal{

	private boolean Poisonous; //instansvariabel 
	
	public Snake(String LatinName, boolean Poisonous) {  // konstruktor
		super(LatinName);
		this.Poisonous=Poisonous;
		
	}
	public boolean isPoisonous(){ // metod
	return Poisonous;
	
}
	public String getInfo() {
		String poison = " is poisonous";
		String noPoison = " is not poisonous";
		String info = " The snake (" + this.getLatinName() + ") ";
		if(isPoisonous()==true){
			return info + poison;
			
		}else{
			
			return info + noPoison;
		}

	}
	
}
