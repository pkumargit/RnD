package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(100);
		arrayList.add(101);
		arrayList.add(102);
		//System.out.println(arrayList.get(0));
		//Iterate1
		/*for(int i=0;i<arrayList.size();i++){
			System.out.println(arrayList.get(i));
		}*/
			
	Iterator iterator = arrayList.iterator();
	while(iterator.hasNext()){
		System.out.println(iterator.next());
		}
			//Remove Item
			arrayList.remove(arrayList.size()-1);
			
			//Iterate 2
			for(Integer value : arrayList){
				System.out.println(value);
			}
		}
	}


