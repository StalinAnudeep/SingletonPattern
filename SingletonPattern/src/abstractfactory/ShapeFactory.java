package abstractfactory;

public class ShapeFactory extends AbstractFactory{

	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if(shapeType.equals("S"))return new Square();
		if(shapeType.equals("R"))return new Rectangle();
		return null;
	}

}
