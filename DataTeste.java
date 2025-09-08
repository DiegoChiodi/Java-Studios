import java.util.Scanner;

public class DataTeste {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		Data d1 = new Data();
		
		System.out.println("Digite o dia do seu nascimento:");
		d1.dia = tec.nextInt();
		System.out.println("Digite o mês do seu nascimento:");
		d1.mes = tec.nextInt();
		System.out.println("Digite o ano do seu nascimento:");
		d1.ano = tec.nextInt();
		d1.exibir();
	}

}
