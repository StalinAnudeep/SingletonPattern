package pattens;

public class Singleton {
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

	public enum Sigleton {
		instance;
	}
}
