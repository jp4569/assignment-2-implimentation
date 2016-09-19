public class Armor extends Item {
private int defense;
public void setDefense(int defense){
	this.defense = defense;
}
public int getDefense(){
	return defense;
}
public void examine3(){
	setName("Jak Popovic");
	setWeight(200);
	examine();
	System.out.println("Defense: " + defense);
}
}