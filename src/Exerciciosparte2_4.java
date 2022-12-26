import java.util.Scanner;

public class Exerciciosparte2_4 {
	
	//Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode
	//come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita a hora inicial do jogo: ");
		int horaInicio = sc.nextInt();
		System.out.println("Digite a hora final do jogo: ");
		int horaFinal = sc.nextInt();
		int duracao;
		
		if(horaInicio < horaFinal) {
			duracao = horaFinal - horaInicio;
		}else {
			duracao = 24 - horaInicio + horaFinal;
		}
		
		System.out.println("O jogo durou " + duracao + " horas");
		
		
		
		
		sc.close();

	}

}
