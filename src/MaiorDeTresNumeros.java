import java.util.Scanner;

public class MaiorDeTresNumeros {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite tr�s n�meros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max (a, b, c);
		
		MostreResultado(maior);
		
		
		
		
		
		
		sc.close();

	}
	
	public static int max (int x, int y, int z) {
		
		int aux;
		if (x > y && x > z) {
			aux = x;
			
		}else if (y > z) {
			aux = y;
			
		}else {
			aux = z;
		}
		
		return aux;
	}
	
	public static void MostreResultado(int value) {
		System.out.println("Maior: " + value);
	}

}
