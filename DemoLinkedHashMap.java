package collections;

import java.util.LinkedHashMap;

public class DemoLinkedHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> courseCode=new LinkedHashMap<String,Integer>();
	courseCode.put("USA", 1);
	courseCode.put("Pakistan", 92);
	courseCode.put("China", 23);
	courseCode.put("England", 66);
	courseCode.put("Australia", 15);
	
	System.out.println(courseCode);
	System.out.println(courseCode.values());
	System.out.println(courseCode.remove("Pakistan"));
	
	}

}
