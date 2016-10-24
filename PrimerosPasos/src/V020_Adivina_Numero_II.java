import java.util.Scanner;

public class V020_Adivina_Numero_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aleatorio = (int) (Math.random() * 100);

		Scanner entrada = new Scanner(System.in);

		int numero = 0;
		int intentos = 0;

		// Corrige el fallo de la versi�n en V019. Se ejecuta al menos una vez.
		do {
			intentos++;
			System.out.println("Introduce un n�mero, por favor.");
			numero = entrada.nextInt();

			if (aleatorio < numero) {
				System.out.println("Es m�s bajo. Prueba otra vez.");
			} else if (aleatorio > numero) {
				System.out.println("Es m�s alto. Prueba otra vez.");
			}
		} while (numero != aleatorio);
		System.out.println("Correcto! Lo has conseguido en " + intentos + " intentos.");
	}
}
