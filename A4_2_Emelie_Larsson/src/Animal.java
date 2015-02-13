
public abstract class Animal {
	
	private String LatinName;
	private String FriendlyName;
	
	

public Animal (String LatinName){
	this. LatinName=LatinName;
	

}

public abstract String getInfo();
	
public String getLatinName(){
	return this.LatinName;
	

}
public void setFriendlyName(String name){
	this.FriendlyName = name;
	
}
public String getFriendlyName(){
	return this.FriendlyName;
	
	

}
	
}

