import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Separador decimal
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		double valor = 2907.18;
		
		System.out.print("Digite seu nome: ");
		nome = sc.next();
		
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		
		System.out.print("Digite seu salário: ");
		valor = sc.nextDouble();
		
		sc.close();
				
		System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome, idade, valor);
	}

}