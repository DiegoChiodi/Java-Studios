import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		Random ale = new Random();

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 20;i++)
        {
        	numeros.add(ale.nextInt(101));
        }
        
        int removidos =0;
        
        for (int i = 0; i < numeros.size(); i++)
        {
        	if (par(numeros.get(i)))
        	{
        		numeros.remove(i);
        		removidos += 1;
        		i--;
        	}
        }
        System.out.println(numeros);
        System.out.println(removidos);
        	

	}
	
	public static boolean par(int ver)
	{
		if (ver % 2 == 0)
		{
			return true;
		}
		return false;
	}

}
