import java.util.Scanner;

public class Exercicioparte2_3 {
	
	//Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
	//Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
	//ordem crescente ou decrescente.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 2 n�meros: ");
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("S�o multiplos!");
		}else {
			System.out.println("N�o s�o multiplos!");
		}
		
		sc.close();
	}

}
