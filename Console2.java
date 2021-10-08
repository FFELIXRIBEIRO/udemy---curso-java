package fundamentos;

import java.util.Scanner;

public class Console2 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		 
		System.out.println("Qual a sua idade?");
		int idade = teclado.nextInt();
		teclado.nextLine(); // ler o "\n" que o teclado.nxtInt() deixa
		
		System.out.println("Qual o seu nome?");
		String nome = teclado.nextLine();
		
		System.out.println("Qual o seu sobrenome?");
		String sobrenome = teclado.nextLine();
		 
		System.out.printf("%s %s tem %d anos, %n",
				nome, sobrenome,idade );
		teclado.close();
		
	}

}
