package abstractfactory;

public class FactoryProcedure {
public static AbstractFactory getFactory(boolean shapeType) {
	if(shapeType)
		return new ShapeFactory();
	else
		return new RoundedFactory();
	
}
}
