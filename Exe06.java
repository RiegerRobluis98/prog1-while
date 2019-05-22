package listawhile;
import java.util.Scanner;
public class Exe06 {

	public static void main(String[] args) {
		Scanner key = new Scanner (System.in);
		int x, y, val;
		System.out.println("Digite o Valor de X");
		x = key.nextInt();
		System.out.println("Digite o Valor de Y");
		y = key.nextInt();
		val = x ^ y;
		System.out.println(val);
	}

}
