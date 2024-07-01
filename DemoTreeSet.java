package collections;

import java.util.TreeSet;
//Class Declaration
public class DemoTreeSet {
    //Main Method
	public static void main(String[] args) {
		//Create a TreeSet Instance
		TreeSet<String> ts=new TreeSet<String>();
		//Add key value pairs to TreeSet
		ts.add("India");
		ts.add("Pakistan");
		ts.add("China");
		ts.add("UK");
		//Print the entire TreeSet
		System.out.println(ts);
		//ts.add(null);
		ts.add("USA");
		//Print entire TreeSet
		System.out.println(ts);
		//Print first key of TreeSet
		System.out.println(ts.first());
		//Print Descending order of TreeSet
		System.out.println(ts.descendingSet());
		//Print size of TreeSet
		System.out.println(ts.size());
		
	}

}
