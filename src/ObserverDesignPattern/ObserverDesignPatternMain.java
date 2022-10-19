package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

interface Subject {
	void register(Observer obj);
	void unregister(Observer obj);
	void nofifyObserver();
}

class DeliveryData implements Subject {
	
	private List<Observer> observerList;
	private String location;
	
	public DeliveryData() {
		this.observerList = new ArrayList<>();
		
	}
	
	@Override
	public void register(Observer obj) {
		observerList.add(obj);
	}

	@Override
	public void unregister(Observer obj) {
		observerList.remove(obj);
		
	}

	@Override
	public void nofifyObserver() {
		for(Observer obj: observerList) {
			obj.update(location);
		}
	}
	
	public void locationChanged() {
		this.location = getNewLocation();
	}
	
	public String getNewLocation() {
		return "Location Y";
	}
}

interface Observer {
	void update(String location);
}

class Seller implements Observer {

	private String location;
	
	@Override
	public void update(String location) {
		this.location = location;
		showCurrentLocation();
	}
	
	public void showCurrentLocation() {
		System.out.println("Notification at seller's end : Current Location - " + this.location);
	}
}

class User implements Observer {
	
	private String location;

	@Override
	public void update(String location) {
		this.location = location;
		showCurrentLocation();
	}
	
	public void showCurrentLocation() {
		System.out.println("Notification at User's end : Current Location - " + this.location);
	}
}

class DeliveryWareHouse implements Observer {

	private String location;

	@Override
	public void update(String location) {
		this.location = location;
		showCurrentLocation();
	}
	
	public void showCurrentLocation() {
		System.out.println("Notification at Warehouse's end : Current Location - " + this.location);
	}
}




public class ObserverDesignPatternMain {
	
	public static void main(String[] args) {
		DeliveryData deliveryData = new DeliveryData();
		
		Observer obj1 = new Seller();
		Observer obj2 = new User();
		Observer obj3 = new DeliveryWareHouse();
		
		
		deliveryData.register(obj1);
		deliveryData.register(obj2);
		deliveryData.register(obj3);
		

		deliveryData.locationChanged();

		deliveryData.unregister(obj3);
		System.out.println();

		deliveryData.unregister(obj3);
		
		
	}

}
