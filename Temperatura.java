package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		
		//(°F - 32) x 5/9 = °C
		
		final double FATOR = 5.0 / 9.0;
		 final double AJUSTE = 32 ;
		final double FATOR2 = 9.0/5.0;
		 
		 double fahrenheit = 90.5 ;
		 double celsius = (fahrenheit - AJUSTE) * FATOR;
		 
		 System.out.println(" O  resultado é: " + celsius + "°C");
		
		
		fahrenheit = 50;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println(" O  resultado é: " + celsius + "°C");
		
//		tranformando celsius em fahrenheit  formula °F= (°C *9.0/5.0)+32
		
		fahrenheit = (celsius*FATOR2) + AJUSTE;
		System.out.println( "O resultado em fahrenheit é = " + fahrenheit + "°F");
		 
		 
		
	}
}
