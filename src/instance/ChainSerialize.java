package instance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ChainSerialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		Cat c = new Cat();
		Dog d = new Dog();
		
		
//		System.out.println(d.dog+"...."+c.name+"...."+c.num);
		
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
	
		oos.writeObject(c);
		oos.writeObject(d);
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		
		if(object instanceof Cat) {
			
			System.out.println(c.name+"Cat Name "+c.num+" Cat num ");
			
		}
		else if(object instanceof Dog) {
			
			System.out.println("Dog Breed : "+d.dog);
		}
		
		
		
		
		

	}

}
