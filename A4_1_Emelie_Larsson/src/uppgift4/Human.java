package uppgift4;

public class Human {

	private Dog dog;
	private String name;
	private String error;
	
	
	public Human (String name){
	if(name.length()>3){
		this.name=name;
	}else{
		this.error ="Namnet på human är för kort!";
	}
}
	
	
	

public String getName(){
return this.name;

}


	public String getError(){
		return this.error;
	}

public String getInfo(){
	String allInfo = "";
	allInfo += getName() + " äger en hund som heter " + dog.memberName();
	
	return allInfo;}
	
	public void buyDog(Dog dog){
		this.dog=dog;
		
	}
}