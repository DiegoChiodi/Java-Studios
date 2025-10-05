import java.util.Scanner;

public class Ogro {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int esq = tec.nextInt();
        int dir = tec.nextInt();

        if (esq > dir) {
            System.out.println(esq + dir);
        } else if (esq < dir) {
            System.out.println((dir - esq) * 2);
        } else {
            System.out.println(esq + " = " + dir);
        }
    }

}
