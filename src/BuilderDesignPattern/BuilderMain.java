package BuilderDesignPattern;

import BuilderDesignPattern.Vehicle.VehicleBuilder;

public class BuilderMain {
	public static void main(String[] args) {
		Vehicle car = new Vehicle.VehicleBuilder("4000cc", 4).setAirbags(6).build();
		Vehicle motorCycle =  new Vehicle.VehicleBuilder("300cc", 2).build();
		Vehicle auto = new Vehicle.VehicleBuilder("150cc", 3).build();
		
		System.out.println("Engine name = "+ car.getEngineName()+
		" No of wheels = " + car.getWheels() +"Air Bags = " +car.getAirBags());
		

		System.out.println("Engine name = "+ auto.getEngineName()+
		" No of wheels = " + auto.getWheels() +"Air Bags = " + auto.getAirBags());
		
	}

}
