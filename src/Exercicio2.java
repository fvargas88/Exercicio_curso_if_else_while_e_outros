import java.util.Scanner;

	

public class Exercicio2 {
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double raio, area, pi = 3.14159;
		
		raio = sc.nextDouble();
		area = pi * raio * raio;
		
		System.out.printf("area=%.4f%n " , area);
		
		
		
		
		
		
		sc.close();

	}

}

//Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste c�rculo com quatro//

	//casas decimais conforme exemplos.//

	//F�rmula da �rea: area = pi . raio2//

	//Considere o valor de pi = 3.14159//
