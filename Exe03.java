//Construa um programa que leia um n�mero, verifique se esse n�mero � �perfeito� e apresenta o resultado.
package listawhile;
import java.util.Scanner;
public class Exe03 {
	public static void main(String[] args) {
		Scanner key = new Scanner (System.in);
		int num, div, som = 0;
		System.out.println("Informe um valor p/ verificar se � perfeito");
		num = key.nextInt();
		div = 1;
				while (div <= (num/2)) {
					if (num%div==0) {
					System.out.println("Testando a divis�o de "+num+" por "+div+"=>"+(num%div));
					
						som+=div;
						//div = num;
					}
					div++;
				}
				System.out.println("Soma dos divisores "+som);
				if (som == num) {
					System.out.println("� perfeito");
				}else {
					System.out.println("N�o � perfeito");
				}
		}
	}