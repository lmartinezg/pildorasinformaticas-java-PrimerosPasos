// Referencias:
//
// Vídeo 102 - Procesador de textos - 2

package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class V102_ProcesadorTextos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V102_MenuProcesador_II mimarco = new V102_MenuProcesador_II();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// mimarco.setVisible(true);

	}
}

class V102_MenuProcesador_II extends JFrame {

	public V102_MenuProcesador_II() {

		setBounds(500, 300, 550, 400);
		setTitle("Prueba procesador de textos - 2");

		V102_LaminaProcesador_II milamina = new V102_LaminaProcesador_II();
		add(milamina);

		setVisible(true);

	}
}

class V102_LaminaProcesador_II extends JPanel {

	public V102_LaminaProcesador_II() {

		setLayout(new BorderLayout());

		JPanel laminaMenu = new JPanel();

		// ---- Preparar menú en parte superior
		JMenuBar miBarra = new JMenuBar();

		// ------------------------------------------------------
		JMenu menuFuente = new JMenu("Fuente");
		JMenuItem f_Arial = new JMenuItem("Arial");
		JMenuItem f_Courier = new JMenuItem("Courier");
		// Gestiona_Menus tipo_letra = new Gestiona_Menus();
		f_Courier.addActionListener(new Gestiona_Menus());
		JMenuItem f_Verdana = new JMenuItem("Verdana");
		menuFuente.add(f_Arial);
		menuFuente.add(f_Courier);
		menuFuente.add(f_Verdana);
		miBarra.add(menuFuente);
		// ------------------------------------------------------
		JMenu menuEstilo = new JMenu("Estilo");
		JMenuItem e_Negrita = new JMenuItem("Negrita");
		JMenuItem e_Cursiva = new JMenuItem("Cursiva");
		menuEstilo.add(e_Negrita);
		menuEstilo.add(e_Cursiva);
		miBarra.add(menuEstilo);
		// ------------------------------------------------------
		JMenu menuTamano = new JMenu("Tamaño");
		JMenuItem t_12 = new JMenuItem("12");
		JMenuItem t_16 = new JMenuItem("16");
		JMenuItem t_20 = new JMenuItem("20");
		JMenuItem t_24 = new JMenuItem("24");
		menuTamano.add(t_12);
		menuTamano.add(t_16);
		menuTamano.add(t_20);
		menuTamano.add(t_24);
		miBarra.add(menuTamano);
		// ------------------------------------------------------
		laminaMenu.add(miBarra);
		add(laminaMenu, BorderLayout.NORTH);
		// ------------------------------------------------------

		// ---- Preparar lámina para el texto en parte central
		miarea = new JTextPane();
		add(miarea, BorderLayout.CENTER);

	}

	private class Gestiona_Menus implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			miarea.setFont(new Font("Courier", Font.PLAIN, 20));

		}

	}

	JTextPane miarea;
}
