package graficos;

import javax.swing.*;

public class V055_CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		miMarco marco1 = new miMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class miMarco extends JFrame {

	public miMarco() {
		setSize(500, 300);
	}
}