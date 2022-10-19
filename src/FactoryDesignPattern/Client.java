package FactoryDesignPattern;

public class Client {
	public static void main(String[] args) {
		Polygon triangle = PolygonFactory.getInstance(3);
		System.out.println(triangle.getType());
		
		Polygon retangle = PolygonFactory.getInstance(4);
		System.out.println(retangle.getType());
		
		Polygon pentagon = PolygonFactory.getInstance(5);
		System.out.println(pentagon.getType());
		
		Polygon hexagon = PolygonFactory.getInstance(6);
		System.out.println(hexagon.getType());
		
		Polygon heptagon = PolygonFactory.getInstance(7);
		System.out.println(heptagon.getType());
		
		Polygon octagon = PolygonFactory.getInstance(8);
		System.out.println(octagon.getType());
		
	}

}
