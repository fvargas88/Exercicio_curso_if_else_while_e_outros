import java.util.Scanner;

public class Exerciciosparte_5 {
	
	//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
	//seguir, calcule e mostre o valor da conta a pagar
	
	// codigo                 Especificacao            Preco
	//  1                   cachorro quente            4.00
	//  2                   xsalada                   4.50
	//  3                   xbacon                    5.00
	//  4                   torrada simples            2.00
	//  5						refigerente			   1.50

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total;
		
		if(codigo ==1) {
			total = quantidade * 4.00;
		}else if (codigo == 2) {
			total = quantidade * 4.50;
			
		}else if (codigo == 3) {
			total = quantidade * 5.00;
		}else if (codigo == 4) {
			total = quantidade * 2.00;
		}else {
			total = quantidade * 1.50;
			
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();

	}

}
