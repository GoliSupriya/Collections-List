package vector;

import java.util.*;
public class VectorPractice 
{
	public static void main(String[] args)
	{
		//converting a list to Vector
		Vector<Integer> v2=new Vector<>(Arrays.asList(1,2,3,4,5));
		System.out.println(v2);
		System.out.println(v2.size());
		System.out.println(v2.capacity());//default capacity of vector is 10
		Vector<String> v=new Vector<>();
		System.out.println(v);
		
		//Adding elements to vector
		v.add("priya");
		v.add(0,"riya");
		v.add("swathi");
		v.add("doreamon");
		v.add("nobitha");
		v.add("suneo");
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		Vector<String> v1=new Vector<>();
		v1.add("hatori");
		v1.add("dora");
		for(int i=0;i<v.size();i++)
		{
			v1.add(v.get(i));
		}
		System.out.println(v1);
		System.out.println(v1.contains("priya"));
		System.out.println(v1.containsAll(v));
		
		//retrieving
		System.out.println(v1.get(2));
		System.out.println(v1.indexOf("priya"));
		
		//updating
		v1.set(0,"riya");
		System.out.println(v1);
		
		//deleting
		v1.remove(0);
		System.out.println(v1);
		v1.removeAll(v);
		System.out.println(v1);
}
}
