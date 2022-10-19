package PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

class Vehicle implements Cloneable {
	
	private List<String> vehicleList;
	
	public Vehicle() {
		this.vehicleList = new ArrayList<String>();
	}
	
	public Vehicle(List<String> vehicleList) {
		this.vehicleList = vehicleList;
	}
	
	public void insertList() {
		vehicleList.add("BMW X Series");
		vehicleList.add("BMW XE Series");
		vehicleList.add("BMW XE+ Series");
		vehicleList.add("Mercedes S Class");
		vehicleList.add("Mercedes C Class");
		vehicleList.add("Mercedes Maybac");
		vehicleList.add("Range Rover XE");
	}
	
	public List<String> getVehicleList(){
		return this.vehicleList;
	}
	
	public Object Clone() {
		List<String> tempList = new ArrayList<>();
		for(String s: vehicleList) {
			tempList.add(s);
		}
		return new Vehicle(tempList);
	}
}
