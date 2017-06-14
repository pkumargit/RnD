package Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
       // HashSet<String> hashSet=new HashSet<String>();
		//LinkedHashSet<String> hashSet=new LinkedHashSet<String>();
        TreeSet<String> hashSet=new TreeSet<String>();
		hashSet.add("Elephant");
		hashSet.add("Rhino");
		hashSet.add("Fox");
		hashSet.add("Fish");
		hashSet.add("Goat");
		
		System.out.println(hashSet);
	}


}
