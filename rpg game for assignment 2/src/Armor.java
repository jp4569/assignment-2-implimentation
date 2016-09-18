
public class Armor extends Item {
private int defense;
public void setDefense(){
	this.defense = defense;
}
public int getDefense(){
	return defense;
}
public void examine3(){
	System.out.println("Defense: " + defense);
}
}
