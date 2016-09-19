

public class Main{
	 public static void main(String[] args){
		 Item impliment = new Item();
		 Weapon impliment2 = new Weapon();
		 Armor impliment3 = new Armor();
		 Food impliment4 = new Food();
		 impliment.setName("Jak Popovic");
		 impliment.setWeight(200);
		 impliment2.setDamage(4500);
		 impliment3.setDefense(5500);
		 impliment4.setNutrition(500);
		 impliment4.setQuantity(7);
		 impliment.examine();
	}

}