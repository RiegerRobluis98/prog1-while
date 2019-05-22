//Construa um programa que gere e apresente os 20 primeiros valores da Série de Fibonacci.
package listawhile;
//import java.util.Scanner;
public class Exe02 {
	public static void main(String[] args) {
		//Scanner key = new Scanner (System.in);
		int num, a2, a1, con= 1;
		System.out.println("Série de Fibonacci");
		a2 = 1;
		a1 = 1;
		System.out.println(con + " -> "+a2);
		con++;
		System.out.println(con + " -> "+a1);
		while (con < 20) {
			num = a2 + a1;
			con++;
			System.out.println(con + " -> "+num);
			a2 = a1;
			a1 = num;
		}
	}

}