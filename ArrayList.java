import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("000");
		list.add('1');
		list.add(2.0);
		list.add(list.size(), "size");

		list.set(1, "trocado");
		
		list.remove(0);
		
		System.out.println(list);
	}
}