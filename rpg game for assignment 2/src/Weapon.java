
public class Weapon extends Item{
private int damage;
public int getDamage(){
	return damage;
}
public void setDamage(int damage){
	this.damage = damage;
}
public void examine2(){
	System.out.println("Name: " + getName());
	System.out.println("Name: " + getWeight());
	System.out.println("Damage: " + damage);
	
}
}
