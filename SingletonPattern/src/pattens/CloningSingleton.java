package pattens;

/*
 * Cloning
	Using the "clone" method, we can create a copy of the original object; 
	it's the same thing if we applied clone in the singleton pattern. 
	It will create two instances: one original and another one cloned object. 
	In this case, we will break the Singleton principle, as shown in the below code.

Implement the " Cloneable" interface and override the clone method in the above Singleton class.
 */
public class CloningSingleton {
	public static void main(String[] args) {
		Singleton inst1 = Singleton.getInstance();
		try {
			Singleton inst2 = (Singleton) inst1.getInstance().clone();
			System.out.println("Instance 1 : " + inst1);
			System.out.println("Instance 2 : " + inst2);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
