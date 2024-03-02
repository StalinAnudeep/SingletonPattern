package abstractfactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		AbstractFactory af = FactoryProcedure.getFactory(false);
		Shape sf = af.getShape("S");
		sf.draw();
		
		AbstractFactory af1 = FactoryProcedure.getFactory(true);
		Shape sf1 = af1.getShape("R");
		sf1.draw();
	}
}
