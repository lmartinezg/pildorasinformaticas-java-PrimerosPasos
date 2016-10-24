package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class V046_Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona[] lasPersonas = new Persona[2];

		lasPersonas[0] = new V046_Empleado("Luis Conde", 50000, 2009, 2, 25);
		lasPersonas[1] = new Alumno("Ana L�pez", "Biol�gicas");

		for (Persona p : lasPersonas) {
			System.out.println(p.dameNombre() + ", " + p.dameDescripcion());

		}

	}

}

// La clase tiene que ser abstracta por tener un m�todo abstracto
abstract class Persona {

	public Persona(String nom) {
		nombre = nom;
	}

	public String dameNombre() { // Getter
		return nombre;
	}

	// Declaraci�n del m�todo abstracto
	// Obliga a que la clase sea abstracta
	public abstract String dameDescripcion(); // Getter

	private String nombre;

}

class V046_Empleado extends Persona {

	// M�todo constructor
	public V046_Empleado(String nom, double sue, int agno, int mes, int dia) {

		super(nom);

		sueldo = sue;
		// En la clase GregorianCalendar los meses van del 0 al 11
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		// getTime devuelve en objeto Date
		altaContrato = calendario.getTime();

		++IdSiguiente;
		Id = IdSiguiente;

	}

	public String dameDescripcion() { // Getter
		return "Este empleado tiene un Id= " + Id + " con un sueldo= " + sueldo + ".";
	}

	public double dameSueldo() { // Getter
		return sueldo;
	}

	public Date dameFechaContrato() { // Getter
		return altaContrato;
	}

	public int dameId() { // Getter
		return Id;
	}

	public void subeSueldo(double porcentaje) { // Setter
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

	// Variables declaradas al final de la clase.
	// Es lo mismo que declararlas al prncipio.
	private double sueldo; // Tipo de datos primitivo double
	private Date altaContrato; // Objeto de clase Date

	private static int IdSiguiente;
	private int Id;

}

class Alumno extends Persona {

	public Alumno(String nom, String car) {

		super(nom);

		carrera = car;

	}

	public String dameDescripcion() {
		return "Este alumno est� estudiando la carrera de " + carrera + ".";
	}

	private String carrera;
}