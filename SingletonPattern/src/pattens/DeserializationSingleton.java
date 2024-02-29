package pattens;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class DeserializationSingleton {
public static void main(String[] args) throws ClassNotFoundException {
	Singleton inst1 = Singleton.getInstance();
	System.out.println("Instance One" +inst1);
	
	try {
		/*
		 * In serialization, we can save the object of a byte stream into a file or send over a network. 
		 * Suppose if you serialize the Singleton class, and then again de-serialize that object, 
		 * it will create a new instance, hence deserialization will break the Singleton pattern.
		   The below code is used to illustrate how the Singleton pattern breaks with deserialization.
		   Implements Serializable interface for Singleton Class.
		 */
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.txt"));
		out.writeObject(inst1);
		out.close();
		
		ObjectInput in = new ObjectInputStream(new FileInputStream("file.txt"));
		Singleton inst2 = (Singleton) in.readObject();
		in.close();
		
		System.out.println("Instance Two"+inst2);
		
		
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
