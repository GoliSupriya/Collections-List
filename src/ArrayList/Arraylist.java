package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist 
{
	public static void main(String args[])
	{
		Integer[] arr=new Integer[] {2,3,4,5};
		ArrayList<Integer> a1=new ArrayList<>(Arrays.asList(arr));
		
		//adding elements
		a1.add(6);
		a1.add(8);
		a1.add(9);
		a1.add(7);
		System.out.println(a1);
		
		//retrieving
		System.out.println(a1.get(2));
		
		//verification
		System.out.println(a1.contains(5));
		
		//updating
		a1.set(0, 12);
		System.out.println(a1);
		
		//deleting
		a1.remove(0);
		System.out.println(a1);
	}
}
