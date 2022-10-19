package FlywheelDesignPattern;

import java.util.HashMap;

public class EmployeeFactory {
	
	private static HashMap<String, Employee>  map= new HashMap<String, Employee>();
	
	public static Employee getEmployee(String type) {
		Employee p = null;
		
		if(map.get(type) != null) {
			p = map.get(type);
		}
		else {
			switch(type) {
				
			case "Developer":
				p = new Developer();
				System.out.println("Developer Created");
				break;
				
			case "Tester" :
				p = new Tester();
				System.out.println("Tester Created");
				break;
				
			default :
				System.out.println("No such employee found");
			}
			map.put(type, p);
		}
		return p;
	}

}
