import java.util.Scanner;

public class Exercicioparte2_1 {
	//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		
		int numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("Numero Negativo");
		}else {
			System.out.println("Numero positivo");
		}
		
		
		
		
		sc.close();

	}

}
