package Stack;
import java.util.Stack;

public class StackPractice 
{
	public static void main(String args[])
	{
		Stack<String> s1=new Stack<>();
		
		//adding
		s1.add("Red");
		s1.add("Green");
		s1.add("Blue");
		s1.add("Yellow");
		s1.add("White");
		s1.add("Black");
		s1.push("Pink");
		
		//retrieving peek element
		System.out.println(s1.peek());
		
		//removing elements
		s1.pop();
		System.out.println(s1);
		
		//searching
		System.out.println(s1.search("Green"));
	}
}
