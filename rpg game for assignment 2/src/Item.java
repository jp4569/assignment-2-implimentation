//Jak Popovic
//ICEN 213
//RPG Assignment 2
public class Item {
	private String name;
	private int weight;
	//These private variables will be inherited by other classes
	
public String getName(){
	return name;
}
public void setWeight(int weight){
	this.weight = weight;
}
public void setName(String name){
	this.name = name;
}
public int getWeight(){
	return weight;
}
public void examine(){
	System.out.println("Name: " + name);
	System.out.println("Weight: " + weight);
}

}