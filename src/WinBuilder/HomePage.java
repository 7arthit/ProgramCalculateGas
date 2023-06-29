package WinBuilder;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class HomePage implements ActionListener {
	JFrame jframe = new JFrame("Gas-Calculeter");// ˹�ҵ�ҧ�����
	JButton jbutton_program = new JButton(" Program ");
	JButton jbutton_about = new JButton("About");
	JLabel jlabel = new JLabel();
	Border border_coler_1 = BorderFactory.createLineBorder(new Color(0x00FF00), 3);
	Border border_coler_2 = BorderFactory.createLineBorder(new Color(0x00FF00), 2);

	HomePage() {// ��Ѻ��˹���á
		ImageIcon image = new ImageIcon("logo.png");
		jframe.setIconImage(image.getImage());
		jframe.setSize(400, 500);
		jframe.setLocationRelativeTo(null);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.add(jbutton_program, BorderLayout.CENTER);
		jframe.add(jbutton_about, BorderLayout.CENTER);
		jframe.add(jlabel, BorderLayout.CENTER);
		jframe.setVisible(true);
		jframe.add(jlabel, BorderLayout.CENTER);
		jframe.setIconImage(image.getImage());
		// label.setBounds(50,100,100,50);
		jlabel.setBorder(border_coler_1);// �ͺ˹�ҵ�ҧ
		jlabel.setVerticalAlignment(JLabel.TOP);// �Ѵ���˹�
		jlabel.setHorizontalAlignment(JLabel.CENTER);
		jlabel.setText("<html>" + "" + " <br> " + "---Gas---" + " <br> " + "Calculeter");
		jlabel.setIcon(image);
		jlabel.setFont(new Font("MV Boli", Font.PLAIN, 50));
		jlabel.setForeground(new Color(0x00FF00));
		jlabel.setBackground(Color.black);
		jlabel.setOpaque(true);
		jbutton_program.setBounds(135, 300, 100, 25);// ���˹�
		jbutton_program.addActionListener(this);
		jbutton_about.setBounds(135, 350, 100, 25);
		jbutton_about.addActionListener(this);
		jbutton_program.setBorder(border_coler_2);// �ͺ����
		jbutton_about.setBorder(border_coler_2);
		jbutton_program.setFont(new Font("MV Boli", Font.BOLD, 15));// ����ѡ�û���
		jbutton_about.setFont(new Font("MV Boli", Font.BOLD, 15));
		jbutton_program.setForeground(Color.black);// �յ��˹ѧ��� ����
		jbutton_about.setForeground(Color.black);
		jbutton_program.setBackground(new Color(0x00FF00));// �վ����ѧ ����
		jbutton_about.setBackground(new Color(0x00FF00));
	}

	@Override
	public void actionPerformed(ActionEvent e) {// method
		if (e.getSource() == jbutton_program) {
			jframe.dispose();// �� jbutton_program �����Դ 价�� WinBuilder
			@SuppressWarnings("unused")
			WinBuilder window = new WinBuilder();
		}
	}
}