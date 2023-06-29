import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Popup {
	public static void main(String[] args) 
	{
		JLabel l1 = new JLabel();
		l1.setText("Program Gas Celculeter");
		l1.setFont(new Font("MV Boli", Font.PLAIN, 15));
		
		JFrame f1 = new JFrame();
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setSize(500, 500);
		f1.setVisible(true);
		f1.add(l1);
		
		
	}
}
