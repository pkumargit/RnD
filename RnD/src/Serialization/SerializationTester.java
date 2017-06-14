package Serialization;


import java.io.*;

public class SerializationTester{
	public static void main(String[] args) {
		try{
		Serialize serialize=new Serialize(310805, "Pankaj");
		FileOutputStream fileOutputStream= new FileOutputStream("D:\\Temp\\file.ser");
		ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(serialize);
		objectOutputStream.flush();
		}
		catch(IOException e){
			System.out.println(e);
		}
		
	}

}
