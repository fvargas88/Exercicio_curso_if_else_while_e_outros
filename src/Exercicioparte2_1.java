import java.util.Scanner;

public class Exercicioparte2_1 {
	//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero");
		
		int numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("Numero Negativo");
		}else {
			System.out.println("Numero positivo");
		}
		
		
		
		
		sc.close();

	}

}
