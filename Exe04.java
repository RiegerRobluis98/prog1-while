//Construa um programa que mostre todos os valores da Série de Fibonacci que estejam entre 1000 e 2000.
package listawhile;
public class Exe04 {
	public static void main(String[] args) {
		//Scanner key = new Scanner (System.in);
		int num, a2, a1, con= 1;
		System.out.println("Série de Fibonacci");
		a2 = 1;
		a1 = 1;
		System.out.println(con + " -> "+a2);
		con++;
		System.out.println(con + " -> "+a1);
		while (con < 2000) {
			num = a2 + a1;
			con++;
			System.out.println(con + " -> "+num);
			a2 = a1;
			a1 = num;
		}
	}

}