//Construa um programa que leia um n�mero, verifique se esse n�mero � primo e apresenta uma mensagem informando o resultado.
package listawhile;
import java.util.Scanner;
public class Exe01 {

	public static void main(String[] args) {
		Scanner key = new Scanner (System.in);
		int num, div, qua = 0;
		System.out.println("Informe um valor p/ verificar se � primo");
		num = key.nextInt();
		div = 2;
				while (div < (num/2)) {
					System.out.println("Testando a divis�o de "+num+" por "+div+"=>"+(num%div));
					if (num%div==0) {
						qua++;
						div = num;
					}
					div++;
				}
		if (qua > 0) {
		System.out.println("N�o � primo");
		} else {
			System.out.println("� primo");
		}
		}
	}