package FlywheelDesignPattern;

import java.util.Random;

public class EngineeringCompany {
	
	private static String EmployeeType[] = {"Developer", "Tester"};
	private static String Skills[] = {"Java", "C++", "Python", "React"};
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			Employee emp = EmployeeFactory.getEmployee(getRandomEmployee());
			emp.assignSkill(getRandomSkills());
			emp.assignTask();
		}
	}
	
	public static String getRandomEmployee() {
		Random r = new Random();
		int randomInt = r.nextInt(EmployeeType.length);
		return EmployeeType[randomInt];
	}
	
	public static String getRandomSkills() {
		Random r = new Random();
		int randomInt = r.nextInt(Skills.length);
		return Skills[randomInt];
	}
	

}
