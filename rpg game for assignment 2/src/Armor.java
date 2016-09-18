
public class Armor extends Item {
private int defense;
public void setDefense(int defense){
	this.defense = defense;
}
public int getDefense(){
	return defense;
}
public void examine3(){
	System.out.println("Name: " + getName());
	System.out.println("Name: " + getWeight());
	System.out.println("Defense: " + defense);
}
}
