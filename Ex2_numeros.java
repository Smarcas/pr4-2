
public class Ex2_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String linea;
		int x;
		int y;
		int resultado;
		System.out.print("Este programa permite conocer el resultado de 2x + y.");
		System.out.println("\n====================================================");
		System.out.print("Introduce el primer número: ");
		linea = System.console().readLine();
		x = Integer.parseInt(linea);
		System.out.print("Introduce el segundo número: ");
		linea = System.console().readLine();
		y = Integer.parseInt(linea);
		System.out.println("El primer número es " + x + " y el segundo número es " + y);
		resultado = 2*x + y;
		System.out.println("El doble del primero más el segundo es " + resultado);
	}

}
