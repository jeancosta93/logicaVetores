
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt();
		double[] alturas = new double [N];
		char[] generos = new char[N];
		
		for (int i=0; i<N; i++) {
			alturas[i] = sc.nextDouble();
			generos[i] = sc.next().charAt(0);
		}
		
		double menorAltura = alturas[0];
		for (int i=1; i<N; i++) {
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
		}
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		
		double maiorAltura = alturas[0];
		for (int i=1; i<N; i++) {
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
		}
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		
		double somaAltura = 0.0;
		int qtdMulheres = 0;
		for (int i=0; i<N; i++) {
			if (generos[i] == 'F') {
				somaAltura = somaAltura + alturas[i];
			    qtdMulheres = qtdMulheres + 1;
			}
		}
		double mediaAltura = (double) somaAltura / qtdMulheres;
		System.out.printf("Media das alturas das mulheres: %.2f%n", mediaAltura);
		
		int somaHomens = 0;
		for (int i=0; i<N; i++) {
			if (generos[i] == 'M') {
				somaHomens = somaHomens + 1;
			}
		}
		System.out.println("Numero de homens: " + somaHomens);
		
		sc.close();
 
	}
}
