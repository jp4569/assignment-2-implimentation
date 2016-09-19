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
public void examine4( ){
	setName("Jak Popovic");
	setWeight(200);
	examine();
	System.out.println("Nutrition: " + nutrition);
	System.out.println("Quantity: " + quantity);
	
}
}