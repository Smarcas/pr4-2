import java.util.Scanner;

public class Ex3_NameandAge {

	public static void main(String[] args) {
		// TODO Mejorar el código aportado por el profesor y conseguir que solo tengamos que introducir una línea de información, eliminando el parseo en caso posible
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce tu nombre y edad: ");
		String nombre = s.next();
		int edad = s.nextInt();
		System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
		s.close();
		
		/* el código original era
		 * Scanner s = new Scanner(System.in);
			System.out.print(“Introduce tu nombre: ") ;
			String nombre = s.nextLine() ;
			System.out.print("Introduce tu edad: ") ;
			int edad = Integer.parseInt(s.nextLine());
			System.out.println(“Tu nombre es " + nombre + " y tu edad es “ + edad);
			s.close();
		 */
	}

}
