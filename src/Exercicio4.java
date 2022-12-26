import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	
	//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
	//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
	//decimais.

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionario, horas;
		double valorHora, salario;
		
		funcionario = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = valorHora * horas;
		
		System.out.println("Numero do funcionario: " + funcionario);
		System.out.printf( "Salario: R$: %.2f%n", salario);
		
		
	
		
		sc.close();

	}

}
