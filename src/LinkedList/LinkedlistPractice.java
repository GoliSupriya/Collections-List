package LinkedList;
import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedlistPractice 
{
	public static void main(String args[])
	{
		LinkedList<Integer> l1=new LinkedList<>();
		
		//empty list
		System.out.println(l1);
		
		//add elements
		l1.add(72);
		l1.add(73);
		l1.add(74);
		l1.add(75);
		System.out.println(l1);
		
		//add ArrayList in LinkedList
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(70);
		a1.add(71);
		l1.addAll(0,a1);
		System.out.println(l1);
		
		//retrieving
		System.out.println(l1.get(2));
		
		//verification
		System.out.println(l1.contains(72));
		
		//updating
		l1.set(0, 69);
		System.out.println(l1);
		
		//removing elements
		l1.removeAll(a1);
		System.out.println(l1);
		l1.clear();
		System.out.println(l1);
	}
}
