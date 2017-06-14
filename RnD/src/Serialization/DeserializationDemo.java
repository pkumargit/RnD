package Serialization;
import java.io.*;
public class DeserializationDemo {
public static void main(String[] args) {
	try{
	FileInputStream fileInputStream=new FileInputStream("D:\\Temp\\file.ser");
	ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
	Serialize serialize=(Serialize)inputStream.readObject();
	System.out.println(serialize.id);
	System.out.println(serialize.name);
	}
	catch(Exception e){
		System.out.println(e);
	}
}
}
