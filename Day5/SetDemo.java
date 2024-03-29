package Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		//creating a HashSet
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(12);
		hs.add(11);
		hs.add(13);
		hs.add(12); //2nd time adding 12
		hs.add(14);
		hs.add(14);	//2nd time adding 14
		
		System.out.println(hs); //Output - [11, 12, 13, 14]
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		
		lhs.add(12);
		lhs.add(11);
		lhs.add(13);
		lhs.add(12); //2nd time adding 12
		lhs.add(14);
		lhs.add(14);	//2nd time adding 14
		
		System.out.println(lhs); //Output - [12, 11, 13, 14]
		
		
        TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(12);
		ts.add(11);
		ts.add(13);
		ts.add(12); //2nd time adding 12
		ts.add(14);
		ts.add(14);	//2nd time adding 14
		
		System.out.println(ts); //Output - [11, 12, 13, 14]
	}

}
