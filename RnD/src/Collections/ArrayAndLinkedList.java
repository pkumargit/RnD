package Collections;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayAndLinkedList {
public static void main(String[] args) {
	List<Integer> arrayList=new ArrayList<Integer>();
	List<Integer> linkedList=new LinkedList<Integer>();
	
	doMore("ArrayList",arrayList);
	doMore("LinkedList",linkedList);
}

public static void doMore(String type,List<Integer> list){
	
	long start= System.currentTimeMillis();
	
	for(int i=0;i<1E5;i++){
		list.add(0,i);
	}
	long end= System.currentTimeMillis();
	
	System.out.println("TimeTaken by" +type + "is" + (end-start));
	
}

}
