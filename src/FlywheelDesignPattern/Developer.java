package FlywheelDesignPattern;

public class Developer implements Employee {
	
	private final String JOB;
	private String skill;
	
	public Developer() {
		JOB = "Fix the issue";
	}

	@Override
	public void assignSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public void assignTask() {
		System.out.println("Developer with " + skill + JOB);
	}
}
