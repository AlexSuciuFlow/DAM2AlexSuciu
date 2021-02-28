package exemples;
import java.util.ArrayList;
import java.util.LinkedList;
public class MatriuLlista {

	public static void main(String[] args) {
		
		ArrayList<String> cotxes = new ArrayList<String>();
		
		cotxes.add("AUDI");
		cotxes.add("Volvo");
		cotxes.add("MAN");
		cotxes.add("BMW");
		cotxes.add("Mercedes");
		cotxes.add("AUDI");
		
//		System.out.println(cotxes);
//		System.out.println(cotxes.get(2));
//		cotxes.set(2, "Honda");
//		System.out.println(cotxes.get(2));
//		
//		cotxes.remove(3);
//		System.out.println(cotxes);
//		
//		cotxes.clear();
//		System.out.println(cotxes);
//		
//		for (int i = 0; i < cotxes.size(); i ++ ) {
//			System.out.println(cotxes.get(i));
//		}
		
		LinkedList<String> cotxes2 = new LinkedList<String>();
		
		cotxes2.add("AUDI");
		cotxes2.add("Volvo");
		cotxes2.add("MAN");
		cotxes2.add("BMW");
		cotxes2.add("Mercedes");
		cotxes2.add("AUDI");
		
		System.out.println(cotxes2);
		cotxes2.addFirst("Mercedes");
		System.out.println(cotxes2);
		cotxes2.addFirst("Mazda");
		System.out.println(cotxes2);
		
	}

}
