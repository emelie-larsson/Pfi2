package uppgift4;

public class Human {

	private Dog dog;				//variabler
	private String name;
	private String error;
	
	
	public Human (String name){		// konstruktor
	if(name.length()>3){
		this.name=name;
	}else{
		this.error ="Namnet p� human �r f�r kort!";
	}
}
	
	
	

public String getName(){ 				//metoder 
return this.name;

}


	public String getError(){
		return this.error;
	}

public String getInfo(){
	String allInfo = "";
	allInfo += getName() + " �ger en hund som heter " + dog.memberName();
	
	return allInfo;}
	
	public void buyDog(Dog dog){
		this.dog=dog;
		
	}
}