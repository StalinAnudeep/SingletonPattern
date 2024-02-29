package pattens;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*Reflection: In Java, Reflection API is used to explore or change 
 * the behavior of methods, interfaces, classes at runtime.
*/

public class Reflection {
public static void main(String[] args) {
	Singleton ins1 = Singleton.getInstance();
	Singleton ins2 = null;
	
	Constructor[] constructors = Singleton.class.getDeclaredConstructors();
	for(Constructor constructor : constructors)
	{
		System.out.println(constructor);
		constructor.setAccessible(true);
		try {
			ins2 = (Singleton) constructor.newInstance();
			break;
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println("Instance 1 Hascode : "+ins1.hashCode());
	System.out.println("Instance 2 Hascode : "+ins2.hashCode());
}
}
