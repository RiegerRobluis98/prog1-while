/*Construa um programa que leia vários números e informe quantos desses números digitados estão entre 100 e 200. 
Quando o valor 0 (zero) for lido o algoritmo deverá cessar sua execução.*/
package listawhile;
import java.util.Scanner;
public class Exe05 {
	public static void main(String[] args) {
		Scanner key = new Scanner (System.in);
		int num = 1, qtos = 0;
		while (num != 0) {
			System.out.println("Digite um numero");
			num = key.nextInt();
			}
		if ((num > 100) && (num < 200)) {
			qtos = (qtos ++);	
		}
		System.out.println("Foram Digitados " + qtos + " numeros entre 100 e 200");
	}

}
