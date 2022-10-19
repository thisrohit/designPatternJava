package SingletonDesignPattern;

public class CoffeeMachine {
	
	private float coffeeQty;
	private float milkQty;
	private float sugarQty;
	private float waterQty;
	
	static private CoffeeMachine my = null;
	
	private CoffeeMachine() {
		coffeeQty = 1;
		milkQty = 1;
		sugarQty = 1;
		waterQty = 1;
	}
	
	public void fillWater(float waterQty) {
		this.waterQty = waterQty;
	}
	
	public void addCoffee(float coffeeQty) {
		this.coffeeQty = coffeeQty;
	}
	
	public void addMilk(float milkQty) {
		this.milkQty = milkQty;
	}
	
	public float knowSugarQty() {
		return sugarQty;
	}
	
	static CoffeeMachine getInstance() {
		if(my == null) 
			return new CoffeeMachine();
		else return my;
	}

}
