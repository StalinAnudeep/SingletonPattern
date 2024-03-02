package abstractfactory;

public class RoundedFactory extends AbstractFactory{

	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if(shapeType.equals("S"))return new RoundedSquare();
		if(shapeType.equals("R"))return new RoundedRectangle();
		return null;
	}

}
