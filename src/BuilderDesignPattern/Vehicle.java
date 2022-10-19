package BuilderDesignPattern;

public class Vehicle {	
	private String engineName;
	private int wheels;
	
	// optional thign
	private int airBags;

	public String getEngineName() {
		return engineName;
	}

	public int getWheels() {
		return wheels;
	}
	
	public int getAirBags() {
		return airBags;
	}

	public void setAirBags(int airBags) {
		this.airBags = airBags;
	}
	
	private Vehicle(VehicleBuilder vehicleBuilder) {
		this.engineName = vehicleBuilder.engineName;
		this.wheels = vehicleBuilder.wheel;
		this.airBags = vehicleBuilder.airBags;
	}
	
	public static class VehicleBuilder {
		private String engineName;
		private int wheel;
		
		private int airBags;
		
		public VehicleBuilder(String engineName, int wheel) {
			this.engineName = engineName;
			this.wheel = wheel;
		}
		
		public VehicleBuilder setAirbags(int airbags) {
			this.airBags = airbags;
			return this;
		}
		public Vehicle build() {
			return new Vehicle(this);
		}
		
	}
	
	
	

}
