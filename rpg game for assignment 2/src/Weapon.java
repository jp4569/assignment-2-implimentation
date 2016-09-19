public class Weapon extends Item{
private int damage;
public int getDamage(){
	return damage;
}
public void setDamage(int damage){
	this.damage = damage;
}
public void examine2(){
	setName("Jak Popovic");
	setWeight(200);
	examine();
	System.out.println("Damage: " + damage);
	
	
}
}