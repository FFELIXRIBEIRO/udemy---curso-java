package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informacoes do funcionario
		
		// Tipos  numericos inteiros
		byte anosDeEmpresa = 23;
		short numeDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//tipos nuericos Reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo boolean
		boolean estaDeFerias = false; // ou true
		
		// tipo caractere
		char status = 'a';// ativo
		
		// dias de empresa
		System.out.println(anosDeEmpresa * 365   +   ", Dias trabalhados!");
		
		//numeros de viajem
		System.out.println(numeDeVoos / 2 + "  viajem!");
		
		//pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println( id + ":ganha->" + salario);
		System.out.println("ferias?" + estaDeFerias);
		System.out.println("Status:" +  status);
		
		
				
		
		 
	}
}
