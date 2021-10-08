package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print("Bom ");
		System.out.print("dia!!!\n\n" );
		
		System.out.println("bom!!!");
		System.out.println("dia!!!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d \n\n ",1,2,3,4,5,6);
		System.out.printf("salario :%.2f%n",1234.5678);		
		System.out.printf("Nome: %s%n" , "João");		

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o Seu Nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o Seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua Idade: ");
		 int idade = entrada.nextInt();
		//System.out.println("nome = " + nome  + " " + sobrenome);
		
		System.out.printf("%s %s tem %d anos, %n",
				nome, sobrenome, idade);
		entrada.close();
		
		
		
		
	}

}
