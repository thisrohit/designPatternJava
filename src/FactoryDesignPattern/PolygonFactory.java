package FactoryDesignPattern;

public class PolygonFactory {
	public static Polygon getInstance(Integer sides) {

		Polygon polygon = null;

		switch (sides) {
		case 3:
			polygon = new Triangle();
			break;

		case 4:
			polygon = new Rectangle();
			break;

		case 5:
			polygon = new Pentagon();
			break;

		case 6:
			polygon = new Hexagon();
			break;

		case 7:
			polygon = new Heptagon();
			break;

		case 8:
			polygon = new Octagon();
			break;

		default:
//			Throw exception
			System.out.println("Wrong Input");
			break;

		}

		return polygon;

	}

}
