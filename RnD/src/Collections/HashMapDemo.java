package Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
public class HashMapDemo {
public static void main(String[] args) {
	//HashMap<Integer, String> hashMap= new HashMap<Integer, String>();
	//LinkedHashMap<Integer, String> linkedHashMap= new LinkedHashMap<Integer, String>();
	TreeMap<Integer, String> treeMap=new TreeMap<Integer, String>();
	//doMapping(hashMap);
	//doMapping(linkedHashMap);
	doMapping(treeMap);
}


public static void doMapping(Map<Integer,String> map){
	map.put(1,"One");
	map.put(3,"Three");
	map.put(2,"Two");
	map.put(5,"Five");
	map.put(4,"Four");
	
	
	for(Map.Entry<Integer, String> entry : map.entrySet()){
		System.out.println(entry.getKey() + ":" + entry.getValue());
	}
}
}