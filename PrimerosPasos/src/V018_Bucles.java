import javax.swing.*;

public class V018_Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Clave prefijada
		String clave = "Juanjo";

		String pass = "";

		while (clave.equals(pass) == false) {
			pass = JOptionPane.showInputDialog("Introduce la contraseņa, por favor");
			if (clave.equals(pass) == false) {
				System.out.println("Contraseņa incorrecta");
			}
		}
		System.out.println("Contraseņa correcta. Acceso permitido");
	}
}
