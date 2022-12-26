package curso_programacao;

import java.util.Locale;

public class Exemplo1 {

	public static void main(String[] args) {
	 String product1= "computer1";
	 String product2= "computer2";
	 
	 int age = 30;
	 int code = 5290;
	 char gender = 'F';
	 
	 double prince1 = 2100.0;
	 double prince2 = 650.50;
	 double meassure = 53.234567;
	 
	 System.out.println("Products:");
	 System.out.println("Computer, wich price is $ " + prince1);
	 System.out.println("Record " + age + " years old cold " + code + " gender " + gender);
	 System.out.print("Meassure with eight decimal places: ");
	 System.out.printf("%.8f%n", meassure);
	 System.out.print("Rouded (three decimal places): ");
	 System.out.printf("%.3f%n", meassure);
	 System.out.print("US decimal point:  ");
	 Locale.setDefault(Locale.US);
	 System.out.printf("%.4f%n", meassure);
	 
	  

	}

}
