public class OperacionMatematica {
	
	public static void main(String args){
		int v_num1 = 10;
		int v_num2 = 5;
		
		//Suma
		suma(v_num1, v_num2);
		
		//Resta
		resta(v_num1, v_num2);
		
		//Multiplica
		multiplica(v_num1, v_num2);
		
	}	
	
	public static void suma(int num1, int num2) {
		int v_suma;
		
		v_suma = num1 + num2;
		
		System.out.println("La suma es : " + v_suma);
	}
	
	public static void resta(int num1, int num2) {
		int v_resta;
		
		v_resta = num1 + num2;
		
		System.out.println("La resta es : " + v_resta);
	}
	
	public static void multiplica(int num1, int num2) {
		int v_multiplica;
		
		v_multiplica = num1 + num2;
		
		System.out.println("El resutado es : " + v_multiplica);
	}
	
}