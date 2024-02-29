package pattens;

import java.io.Serializable;

/*
 * Prevent Singleton Pattern From Reflection
There are many ways to prevent Singleton pattern from Reflection API, 
but one of the best solutions is to throw a run-time exception in the constructor if the instance already exists. 
In this, we can not able to create a second instance.
 */
public class Singleton implements Serializable,Cloneable{
	private static Singleton instance;
	public int count;

	private Singleton() {
		/*
		 * System.out.println("Singleton Instance Created :" + instance); if (instance
		 * != null) { System.out.println("Instacnce Created"); throw new
		 * RuntimeException("Do not try to break the Singleton Class"); }
		 */
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	/*
	 * Prevent Singleton Pattern From Deserialization
       To overcome this issue, we need to override readResolve() method in the Singleton class 
       and return the same Singleton instance. Update Singleton.java, with below method
	 */
	protected Object readResolve() { 
        return instance; 
  } 
	/*
	 * Prevent Singleton Pattern From Cloning
	In the above code, it breaks the Singleton principle, i. e created two instances. 
	To overcome the above issue, we need to implement/override the clone() method and 
	throw an exception CloneNotSupportedException from the clone method. 
	If anyone tries to create a clone object of Singleton, 
	it will throw an exception, as shown in the below code.
	 */
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	throw new CloneNotSupportedException();
	
}
/*
 * Since throw will make the execution of the method stop immediately and control is passed back to the caller,
  it doesn't matter what your method returns. No matter what type you return, that type will not be returned, 
  because you are throwing an exception (which indicates something wrong happened) on the first line.
  The compiler allows this because throwing an exception means something wrong happened, like the arguments are invalid, 
  or the argument is null, and so on. In such error conditions, 
  the compiler does not expect the method to return a value normally. It makes sense because obviously when something wrong happens,
  the method can't compute whatever it is that it was going to compute.
  So the phrase "all code paths must return a value" should really say "all code paths must return a value or throw a Throwable".
 */
}
