/*Considerando que hoje a árvore A tem 1,50 metro e cresce 2 centímetros por ano e a
 * árvore B tem 1,10 metro mas cresce 3 centímetros por ano, construa um programa que calcula e mostra
 * quantos anos ainda serão necessários para que a árvore B venha a ser maior que a árvore A.
 */
package listawhile;
//import java.util.Scanner;
public class Exe07 {
	public static void main(String[] args) {
		//Scanner key = new Scanner (System.in);
		double a1 = 1.50, a2 = 1.10;
		int ano = 0; 
while (a1 > a2) {
	a1 = a1 + 0.02;
	a2 = a2 + 0.03;
	ano++;
		}
System.out.println("São necessários " + ano + " anos");
	}

}
