
public class Food extends Item {
private int nutrition;
private int quantity;
public int getNutrition(){
	return nutrition;
}
public int getQuantity(){
	return quantity;
}
public void setNutrition(int nutrition){
	this.nutrition = nutrition;
}
public void setQuantity(int quantity){
	this.quantity = quantity;
}
public void examine3(){
	System.out.println("Name: " + getName());
	System.out.println("Name: " + getWeight());
	System.out.println("Nutrition: " + nutrition);
	System.out.println("Quantity: " + quantity);
}
}
