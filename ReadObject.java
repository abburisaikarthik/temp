import java.io.*;
public class ReadObject {

	public static void main(String[] args) {
		File f = new File("test2.dat");
		try 
		{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
			
			Student s = (Student)in.readObject();//Object class object
			
			System.out.println(s.n);
			System.out.print(s.x);
		} 
		catch (IOException | ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}

	}

}
