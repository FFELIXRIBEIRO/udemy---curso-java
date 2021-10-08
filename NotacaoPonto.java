package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		double a = 2.3;
		String s = "Bom dia x ";
		s = s.replace("x","senhora");
		s =s.toUpperCase();
		s = s.concat("! ! !");
		
		System.out.println(s);
		System.out.println(a);
		
		String x ="Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia x "
				.replace("x", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		// tipos primitivos nao tem operador ponto
		
		int b = 3;
		
		System.out.println(b);
		
			 
	}

}
