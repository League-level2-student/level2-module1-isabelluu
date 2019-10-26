package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> ray = new ArrayList<String>();
		//2. Add five Strings to your list
		ray.add("hello");
		ray.add("goodbye");
		ray.add("hola");
		ray.add("adios");
		ray.add("ciao");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < ray.size(); i++)
		{
			String a = ray.get(i);
			System.out.println(a);
		}
		System.out.println(" ");
		//4. Print all the Strings using a for-each loop
		for(String a : ray)
		{
			System.out.println(a);
		}
		System.out.println("  ");
		//5. Print only the even numbered elements in the list.
		for(int b = 0; b<ray.size(); b+=2)
		{
			String c = ray.get(b);
			System.out.println("String index " + b + ": " + c);
		}
		//6. Print all the Strings in reverse order.
		System.out.println("  ");
		for(int d = ray.size()-1; d>=0; d--)
		{
			String e = ray.get(d);
			System.out.println("String index " + d + ": " + e);
		}
		
		System.out.println("  ");
		//7. Print only the Strings that have the letter 'e' in them.
		for(int a = 0; a<ray.size(); a++)
		{
			String f = ray.get(a);
		if(f.contains("e"))
		{
			
			System.out.println(f);
		}
		}
	}
}
