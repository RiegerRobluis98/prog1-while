/*Considerando que hoje a �rvore A tem 1,50 metro e cresce 2 cent�metros por ano e a
 * �rvore B tem 1,10 metro mas cresce 3 cent�metros por ano, construa um programa que calcula e mostra
 * quantos anos ainda ser�o necess�rios para que a �rvore B venha a ser maior que a �rvore A.
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
System.out.println("S�o necess�rios " + ano + " anos");
	}

}
