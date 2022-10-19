package PrototypeDesignPattern;

import java.util.List;

public class PrototypeDPMain {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.insertList();
		
		Vehicle v2 = (Vehicle)v1.Clone();
		List<String> list = v2.getVehicleList();
		System.out.println(list);
		
		list.add("Maruti Suzuki Esteem");
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
	
	}

}
