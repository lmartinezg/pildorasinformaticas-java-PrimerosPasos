import javax.swing.JOptionPane;

public class V024_Matrices_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;

		String[] paises = new String[8];

		paises[0] = "Espa�a";
		paises[1] = "M�xico";
		paises[2] = "Colombia";
		paises[3] = "Per�";
		paises[4] = "Chile";
		paises[5] = "Argentina";
		paises[6] = "Ecuador";
		paises[7] = "Venezuela";

		// Bucle for normal
		System.out.println("Bucle for tradicional");
		System.out.println("=====================");
		for (i = 0; i < paises.length; i++) {
			System.out.println("Pa�s " + (i + 1) + " = " + paises[i]);
		}
		System.out.println("");

		System.out.println("Bucle for - each");
		System.out.println("================");
		// Bucle for - each
		i = 0;
		for (String elemento : paises) {
			System.out.println("Pa�s " + (i + 1) + " = " + elemento);
			i++;
		}
		System.out.println("");

		// Con la sintaxis alternativa para inicializar la matriz
		System.out.println("Matriz inicializada con otra sintaxis");
		System.out.println("=====================================");
		String[] paises2 = { "Espa�a", "M�xico", "Colombia", "Per�", "Chile", "Argentina", "Ecuador", "Venezuela" };
		i = 0;
		for (String elemento : paises) {
			System.out.println("Pa�s " + (i + 1) + " = " + elemento);
			i++;
		}
		System.out.println("");

		// Cargar la matriz interactivamente
		System.out.println("Cargar la matriz interactivamente");
		System.out.println("=================================");
		for (i = 0; i < paises.length; i++) {
			paises[i] = "";
		}
		for (i = 0; i < paises.length; i++) {
			paises[i] = JOptionPane.showInputDialog("Introduzca pa�s " + (i + 1));
		}
		for (i = 0; i < paises.length; i++) {
			System.out.println("Pa�s " + (i + 1) + " = " + paises[i]);
		}
		System.out.println("");

	}

}
