package SingletonDesignPattern;

public class Singleton {
	public static void main(String[] args) {
		CoffeeMachine mc1 = CoffeeMachine.getInstance();
		CoffeeMachine mc2 = CoffeeMachine.getInstance();
		CoffeeMachine mc3 = CoffeeMachine.getInstance();
		
		System.out.println(mc1+ " " + mc2 + " "+ mc3 + " " );
		
//		lets check if m1 m2 m3 m4 are same object or different
		
		if(mc1 == mc2 && mc1 == mc3) 
			System.out.println("True");
		else System.out.println("false");
	}
}
