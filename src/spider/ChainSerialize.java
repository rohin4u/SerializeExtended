package spider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ChainSerialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Dog d = new Dog();
		Cat c = new Cat();
		System.out.println(c.dog+"...."+c.name+"...."+c.num);
		
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
//		oos.writeObject(d);
		oos.writeObject(c);
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ois.readObject();
		
		System.out.println(c.dog+"...."+c.name+"...."+c.num);
		

	}

}
