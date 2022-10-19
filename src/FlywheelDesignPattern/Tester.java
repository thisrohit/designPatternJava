package FlywheelDesignPattern;

public class Tester implements Employee {
	
	private final String JOB;
	private String skill;
	
	public Tester() {
		JOB = "Test the code and find issues if any";
	}
	
	@Override
	public void assignSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public void assignTask() {
		System.out.println("Tester with Skill : " + skill + "JOB : "+ JOB);
	}
}
