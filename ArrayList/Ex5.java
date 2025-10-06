import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

        ArrayList<Integer> valores = new ArrayList<>();
        valores.add(10);
        valores.add(20);    
        valores.add(30);
        valores.add(40);
        valores.add(50);
        

        valores.set(1, 100);
        
        for(int i : valores) {
        	System.out.println(i);
        }
        	

	}

}
