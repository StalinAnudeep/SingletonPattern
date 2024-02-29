package pattens;

public class TestSingletonPattern {
public static void main(String[] args) {
	
	Singleton sp = Singleton.getInstance();
	System.out.println(sp);
	sp.count = sp.count + 1;
	System.out.println("Count :"+sp.count);
	
	Singleton sp1 = Singleton.getInstance();
	System.out.println(sp1);
	sp1.count = sp1.count + 1;
	System.out.println("Count " +sp.count);
	
	
	
	
	
}
}
