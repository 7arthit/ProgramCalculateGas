package WinBuilder;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import java.awt.Color;
import javax.swing.JToggleButton;
import java.awt.Button;
import java.awt.Panel;
import java.awt.List;
import java.awt.Window.Type;
import java.awt.SystemColor;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.ScrollPane;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.FlowLayout;
import java.awt.Label;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.CardLayout;
import javax.swing.UIManager;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JMenu;

@SuppressWarnings({ "unused", "serial" })
public class WinBuilder extends JFrame implements ActionListener {
	JFrame jframe_program_gas = new JFrame();// พื้นหลังหลัก
	JFileChooser open_file = new JFileChooser();
	JMenu file_menu = new JMenu("File");// เปิดไฟล์หน้าต่าง
	JTextField jtextField = new JTextField();// แสดงตำแหน่งไฟล์
	JButton jbutton_open_file = new JButton("Open File");// เปิดไฟล์
	JButton jbutton_clear_file = new JButton("Clear");// เคลียตำแหน่งไฟล์
	JButton jbutton_ok_configure = new JButton("OK");// ปุ่ม OK
	JButton jbutton_clear_configure = new JButton("Clear");// ปุ่ม Clear
	JButton jbutton_table[] = new JButton[200];
	JLabel jlabel_file = new JLabel("File : ");// แสดงข้อความ ไฟล์ :
	JLabel jLabel_configure = new JLabel("กำหนดค่าความลึกของของเหลว");// กำหนดความลึก
	JLabel jLabel_meter = new JLabel("เมตร");// แสดง เมตร
	JLabel jlabel_amount = new JLabel("ปริมาณแก๊สทั้งหมด : ");// แสดงข้อความ ปริมาณแก๊สทั้งหมด
	JLabel jpanel_file = new JLabel();
	JPanel jpanelcoler = new JPanel();// JPanel ช่อง ตัวอย่างสี
	JPanel jpanel_exit = new JPanel();// JPanel ช่อง Exit
	JPanel jpanel_table = new JPanel();// JPanel ช่อง ของตาราง
	JPanel jpanel_configure = new JPanel();// JPanel ช่อง กำหนดค่าความลึก
	JPanel jpanel_average = new JPanel();// JPanel ช่อง แสดงค่าเฉลี่ย
	JPanel panel_show_coler = new JPanel();// JPanel ช่อง แสดงค่าสี
	JPanel jpanel_massage = new JPanel();// JPanel ช่อง แสดงMassage
	JPanel panel_gas_aera = new JPanel();
	JLabel lblNewLabel_1 = new JLabel("ค่าสูงสุด : ");// แสดงข้อความ ค่าสูงสุด
	JLabel jlabel_maximum = new JLabel("ค่าต่ำสุด : ");// แสดงข้อความ ค่าต่ำสุด
	JLabel jlabel_average = new JLabel("ค่าเฉลี่ย : ");// แสดงข้อความ ค่าเฉลี่ย
	JLabel textField_average = new JLabel();
	JLabel textField_min = new JLabel();
	JLabel jlabel_unit1 = new JLabel("ลบ.ม");// แสดงข้อความ ลบ.ม
	JLabel jlabel_unit2 = new JLabel("ลบ.ม");// แสดงข้อความ ลบ.ม
	JLabel jlabel_unit3 = new JLabel("ลบ.ม");// แสดงข้อความ ลบ.ม
	JLabel jlabel_unit4 = new JLabel("ลบ.ม");// แสดงข้อความ ลบ.ม
	JLabel jlabel_gas_area = new JLabel("GAS AREA 0 m^3");
	JLabel jlabel_space_on = new JLabel("GAS AREA                      m^3");// กราฟบน
	JLabel jlabel_distance = new JLabel("DISTANCE 0 m.");
	JLabel jlabel_space_lower = new JLabel("DISTANCE             m.");// กราฟล่าง
	JLabel textField_sumall = new JLabel();
	JLabel textField_max = new JLabel();
	JTextField jtextField_configure = new JTextField();// แสดง ความลึกInput
	Button button_exit = new Button("EXIT PROGRAM");// ออกจากระบบ
	TextArea text_area_massage = new TextArea(null, 10, 10, TextArea.SCROLLBARS_BOTH);// แสดงMassage
	Panel panel_red = new Panel();// ตัวอย่างสี แดง
	Panel panel_green = new Panel();// ตัวอย่างสี เขียว
	Panel panel_yellow = new Panel();// ตัวอย่างสี เหลือง
	Panel panel_orange = new Panel();// ตัวอย่างสี ส้ม
	Label label_Text_massage = new Label();
	Label label_no_gas = new Label("No Gas");// ชื่อประเภท สีแดง
	Label label_more_gas = new Label("More Gas");// ชื่อประเภท เขียว
	Label label_gas_mudium = new Label("Gas Mudium");// ชื่อประเภท เหลือง
	Label label_gas_quite_a_few = new Label("Gas quite a few");// ชื่อประเภท ส้ม
	String date_program = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	String million_one = "#,###,###.00";
	String million_two = "#,###,###.0";
	String million_three = "0,000,000.0";
	String first_one = "#.0";
	String first_two = "#.0";
	DecimalFormat format_million = new DecimalFormat(million_one);// กำหนดหน่วย #,###,###.00
	DecimalFormat format_thousand = new DecimalFormat(first_one);// กำหนดหน่วย #.00
	DecimalFormat format_one = new DecimalFormat(first_two);// กำหนดหน่วย #.0
	DecimalFormat format_two = new DecimalFormat(million_two);// กำหนดหน่วย #,###,###.0
	DecimalFormat format_three = new DecimalFormat(million_three);// กำหนดหน่วย #,###,###.0
	FileNameExtensionFilter file_filter;
	Scanner read_file;
	File file;
	int teble;
	int base_horizon[] = new int[200];
	int[] dis = new int[200];
	int count1 = 0;
	float max_gas = 0;
	float min_gas = 0;
	float calculate_result = 0;
	float data_gas[] = new float[200];
	float sumall_gas = 0;
	int fluid_contact;
	String get_configure;
	int reply;
	int i = 0;
	String text_in_box[] = new String[200];
	float area[] = new float[200];
	JOptionPane text_box[] = new JOptionPane[200];
	ActionListener listen;

	public static void main(String[] args) {// เปิดแอปพลิเคชัน
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinBuilder window = new WinBuilder();
					window.jframe_program_gas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public WinBuilder() {// สร้างแอปพลิเคชัน คำนวณก๊าซ
		initialize();
	}

	public void initialize() {// ปรับแต่งแอปพลิเคชัน
		jframe_program_gas.setFont(new Font("Arial", Font.PLAIN, 12));
		jframe_program_gas.getContentPane().setForeground(Color.WHITE);
		jframe_program_gas.setForeground(Color.WHITE);
		jframe_program_gas.getContentPane().setBackground(Color.WHITE);
		jframe_program_gas.setBackground(Color.WHITE);
		jframe_program_gas.setTitle("Gas-Calculeter");
		jframe_program_gas.getContentPane().setFont(new Font("Arial", Font.BOLD, 18));
		jframe_program_gas.getContentPane().setLayout(null);
		jframe_program_gas.setVisible(true);
		// *
		jpanel_file.setBackground(Color.WHITE);
		jpanel_file.setForeground(Color.WHITE);
		jpanel_file.setBounds(10, 10, 339, 94);
		jpanel_file.setBorder(new LineBorder(SystemColor.controlHighlight, 5, true));
		jframe_program_gas.getContentPane().add(jpanel_file);
		jpanel_file.setLayout(null);
		jbutton_open_file.setBackground(SystemColor.window);
		jbutton_open_file.setForeground(Color.DARK_GRAY);
		jbutton_open_file.setBounds(69, 18, 211, 19);
		jbutton_open_file.addActionListener(this);
		jbutton_open_file.setBounds(69, 47, 105, 21);
		jpanel_file.add(jbutton_open_file);
		// *
		jbutton_clear_file.setBackground(SystemColor.window);
		jbutton_clear_file.setForeground(Color.DARK_GRAY);
		jbutton_clear_file.setFont(new Font("Arial", Font.BOLD, 12));
		jbutton_clear_file.setBounds(184, 47, 98, 21);
		jbutton_clear_file.addActionListener(this);
		jpanel_file.add(jbutton_clear_file);//
		jtextField.setForeground(Color.DARK_GRAY);
		jtextField.setBounds(69, 18, 211, 19);
		jpanel_file.add(jtextField);
		jtextField.setColumns(10);
		jlabel_file.setForeground(Color.DARK_GRAY);
		jlabel_file.setFont(new Font("Arial", Font.BOLD, 15));
		jlabel_file.setBounds(20, 5, 45, 44);
		jpanel_file.add(jlabel_file);
		// *
		jpanel_configure.setBackground(Color.WHITE);
		jpanel_configure.setForeground(Color.BLACK);
		jpanel_configure.setBounds(10, 99, 339, 178);
		jpanel_configure.setBorder(new LineBorder(SystemColor.controlHighlight, 5));
		jframe_program_gas.getContentPane().add(jpanel_configure);
		jpanel_configure.setLayout(null);
		jtextField_configure.setBounds(69, 73, 168, 19);
		jpanel_configure.add(jtextField_configure);
		jtextField_configure.setColumns(10);

		jbutton_ok_configure.setForeground(Color.DARK_GRAY);
		jbutton_ok_configure.setBackground(Color.WHITE);
		jbutton_ok_configure.setFont(new Font("Arial", Font.BOLD, 12));
		jbutton_ok_configure.setBounds(69, 122, 104, 21);
		jpanel_configure.add(jbutton_ok_configure);
		jbutton_ok_configure.addActionListener(this);

		jbutton_clear_configure.setBackground(Color.WHITE);
		jbutton_clear_configure.setForeground(Color.DARK_GRAY);
		jbutton_clear_configure.addActionListener(this);
		jbutton_clear_configure.setFont(new Font("Arial", Font.BOLD, 12));
		jbutton_clear_configure.setBounds(179, 122, 104, 21);
		jpanel_configure.add(jbutton_clear_configure);

		jLabel_configure.setForeground(Color.DARK_GRAY);
		jLabel_configure.setFont(new Font("Angsana New", Font.BOLD, 25));
		jLabel_configure.setBounds(69, 20, 220, 30);
		jpanel_configure.add(jLabel_configure);

		jLabel_meter.setForeground(Color.DARK_GRAY);
		jLabel_meter.setFont(new Font("Angsana New", Font.BOLD, 25));
		jLabel_meter.setBounds(247, 67, 45, 21);
		jpanel_configure.add(jLabel_meter);
		// *
		jpanel_table.setForeground(Color.DARK_GRAY);
		jpanel_table.setBackground(Color.WHITE);
		jpanel_table.setBounds(359, 10, 985, 550);
		jpanel_table.setBorder(new LineBorder(SystemColor.controlHighlight, 5, true));
		jframe_program_gas.getContentPane().add(jpanel_table);
		jpanel_table.setLayout(new GridLayout(10, 20));
		// *
		jpanel_average.setBackground(Color.WHITE);
		jpanel_average.setBounds(10, 272, 339, 170);
		jpanel_average.setBorder(new LineBorder(SystemColor.controlHighlight, 5));
		jframe_program_gas.getContentPane().add(jpanel_average);//
		jpanel_average.setLayout(null);

		jlabel_amount.setForeground(Color.DARK_GRAY);
		jlabel_amount.setBackground(Color.WHITE);
		jlabel_amount.setFont(new Font("Angsana New", Font.BOLD, 18));
		jlabel_amount.setBounds(23, 20, 110, 22);
		jpanel_average.add(jlabel_amount);

		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Angsana New", Font.BOLD, 18));
		lblNewLabel_1.setBounds(76, 52, 55, 29);
		jpanel_average.add(lblNewLabel_1);

		jlabel_maximum.setForeground(Color.DARK_GRAY);
		jlabel_maximum.setFont(new Font("Angsana New", Font.BOLD, 18));
		jlabel_maximum.setBounds(77, 89, 54, 24);
		jpanel_average.add(jlabel_maximum);

		jlabel_average.setForeground(Color.DARK_GRAY);
		jlabel_average.setFont(new Font("Angsana New", Font.BOLD, 18));
		jlabel_average.setBounds(79, 124, 49, 23);
		jpanel_average.add(jlabel_average);

		jlabel_unit1.setForeground(Color.DARK_GRAY);
		jlabel_unit1.setBackground(Color.WHITE);
		jlabel_unit1.setFont(new Font("Angsana New", Font.BOLD, 18));
		jlabel_unit1.setBounds(290, 25, 30, 13);
		jpanel_average.add(jlabel_unit1);

		jlabel_unit2.setForeground(Color.DARK_GRAY);
		jlabel_unit2.setFont(new Font("Angsana New", Font.BOLD, 18));
		jlabel_unit2.setBounds(290, 60, 30, 13);
		jpanel_average.add(jlabel_unit2);

		jlabel_unit3.setForeground(Color.DARK_GRAY);
		jlabel_unit3.setFont(new Font("Angsana New", Font.BOLD, 18));
		jlabel_unit3.setBounds(290, 95, 30, 13);
		jpanel_average.add(jlabel_unit3);

		jlabel_unit4.setForeground(Color.DARK_GRAY);
		jlabel_unit4.setFont(new Font("Angsana New", Font.BOLD, 18));
		jlabel_unit4.setBounds(290, 130, 30, 13);
		jpanel_average.add(jlabel_unit4);

		textField_sumall.setBounds(133, 24, 147, 19);
		jpanel_average.add(textField_sumall);

		textField_max.setBounds(133, 59, 147, 19);
		jpanel_average.add(textField_max);

		textField_min.setBounds(133, 94, 147, 19);
		jpanel_average.add(textField_min);

		textField_average.setBounds(133, 128, 147, 19);
		jpanel_average.add(textField_average);
		// *
		panel_show_coler.setBackground(Color.GREEN);
		panel_show_coler.setBounds(10, 439, 339, 200);
		panel_show_coler.setBorder(new LineBorder(SystemColor.controlHighlight, 5));
		jframe_program_gas.getContentPane().add(panel_show_coler);
		panel_show_coler.setLayout(null);

		panel_gas_aera.setBounds(5, 5, 330, 100);
		panel_show_coler.add(panel_gas_aera);
		panel_gas_aera.setBackground(Color.RED);
		panel_gas_aera.setLayout(null);

		jlabel_gas_area.setBounds(115, 40, 155, 20);
		panel_gas_aera.add(jlabel_gas_area);
		jlabel_gas_area.setForeground(Color.DARK_GRAY);
		jlabel_gas_area.setFont(new Font("Angsana New", Font.BOLD, 18));
		jlabel_gas_area.setBackground(Color.WHITE);

		panel_gas_aera.add(jlabel_space_on);
		jlabel_space_on.setForeground(Color.DARK_GRAY);
		jlabel_space_on.setFont(new Font("Angsana New", Font.CENTER_BASELINE, 18));
		jlabel_space_on.setBackground(Color.WHITE);

		jlabel_distance.setBounds(120, 140, 130, 20);
		jlabel_distance.setForeground(Color.DARK_GRAY);
		jlabel_distance.setFont(new Font("Angsana New", Font.BOLD, 18));
		jlabel_distance.setBackground(Color.WHITE);
		panel_show_coler.add(jlabel_distance);

		jlabel_space_lower.setForeground(Color.DARK_GRAY);
		jlabel_space_lower.setFont(new Font("Angsana New", Font.CENTER_BASELINE, 18));
		jlabel_space_lower.setBackground(Color.WHITE);
		panel_show_coler.add(jlabel_space_lower);
		// *
		jpanel_massage.setBackground(Color.WHITE);
		label_Text_massage.setForeground(Color.DARK_GRAY);
		label_Text_massage.setFont(new Font("Arial", Font.BOLD, 10));
		jpanel_massage.setSize(500, 160);
		jpanel_massage.setLayout(null);
		text_area_massage.setSize(450, 90);
		text_area_massage.setLocation(18, 25);
		label_Text_massage.setText("Massage");// ชื่อช่อง Massage
		label_Text_massage.setSize(150, 15);
		label_Text_massage.setLocation(18, 6);
		jpanel_massage.add(text_area_massage);
		jpanel_massage.add(label_Text_massage);
		jpanel_massage.setBounds(359, 570, 504, 133);
		jpanel_massage.setBorder(new LineBorder(SystemColor.controlHighlight, 5, true));
		jframe_program_gas.getContentPane().add(jpanel_massage);
		jpanel_massage.setLayout(null);
		// *
		jpanelcoler.setBackground(Color.WHITE);
		jpanelcoler.setBounds(873, 570, 471, 133);
		jpanelcoler.setBorder(new LineBorder(SystemColor.controlHighlight, 5, true));
		jframe_program_gas.getContentPane().add(jpanelcoler);
		jpanelcoler.setLayout(null);

		panel_red.setBackground(Color.RED);
		panel_red.setBounds(29, 21, 45, 45);
		jpanelcoler.add(panel_red);

		panel_green.setBackground(Color.GREEN);
		panel_green.setBounds(29, 72, 45, 45);
		jpanelcoler.add(panel_green);

		panel_yellow.setBackground(Color.YELLOW);
		panel_yellow.setBounds(253, 21, 45, 45);
		jpanelcoler.add(panel_yellow);

		panel_orange.setBackground(Color.ORANGE);
		panel_orange.setBounds(253, 72, 45, 45);
		jpanelcoler.add(panel_orange);

		label_no_gas.setForeground(Color.DARK_GRAY);
		label_no_gas.setFont(new Font("Arial", Font.PLAIN, 12));
		label_no_gas.setBounds(91, 32, 59, 21);
		jpanelcoler.add(label_no_gas);

		label_more_gas.setForeground(Color.DARK_GRAY);
		label_more_gas.setFont(new Font("Arial", Font.PLAIN, 12));
		label_more_gas.setBounds(91, 83, 77, 21);
		jpanelcoler.add(label_more_gas);

		label_gas_mudium.setForeground(Color.DARK_GRAY);
		label_gas_mudium.setFont(new Font("Arial", Font.PLAIN, 12));
		label_gas_mudium.setBounds(329, 32, 59, 21);
		jpanelcoler.add(label_gas_mudium);

		label_gas_quite_a_few.setForeground(Color.DARK_GRAY);
		label_gas_quite_a_few.setFont(new Font("Arial", Font.PLAIN, 12));
		label_gas_quite_a_few.setBounds(329, 83, 111, 21);
		jpanelcoler.add(label_gas_quite_a_few);
		// *
		jpanel_exit.setBorder(new LineBorder(SystemColor.controlHighlight, 5, true));
		jpanel_exit.setBounds(10, 649, 339, 54);
		jframe_program_gas.getContentPane().add(jpanel_exit);
		jpanel_exit.setLayout(null);
		button_exit.setBounds(10, 10, 319, 34);
		jpanel_exit.add(button_exit);
		button_exit.setBackground(Color.WHITE);
		button_exit.setForeground(Color.DARK_GRAY);
		button_exit.addActionListener(this);
		button_exit.setFont(new Font("Arial", Font.BOLD, 15));
		jframe_program_gas.setBounds(80, 25, 1370, 770);
		jframe_program_gas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		listen = new ActionListener() {
			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < jbutton_table.length; i++) {
					if (e.getSource() == jbutton_table[i]) {// กดปุ่ม OK text Message
						text_box[i].showMessageDialog((null), text_in_box[i], "Message",
								text_box[i].INFORMATION_MESSAGE);
						if (text_box[i].OK_OPTION == 0) {
							AreaShowColer coler_Area = new AreaShowColer(panel_gas_aera, jlabel_distance,
									jlabel_gas_area, jlabel_space_on, jlabel_space_lower, area[i], data_gas[i], dis[i],
									format_one, format_two, format_three);// พื้นทีแสดงกราฟสี
						}
						text_area_massage.append("");
						text_area_massage.append("<" + date_program + ">" + "--->" + "You Ok Message \n");// เวลาทำงาน
					}
				}
			}
		};
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbutton_open_file) {
			file_filter = new FileNameExtensionFilter("Text file", "txt");
			open_file.addChoosableFileFilter(file_filter);
			reply = open_file.showOpenDialog(null);
			if (reply == JFileChooser.APPROVE_OPTION) {
				file = new File(open_file.getSelectedFile().getAbsolutePath());
				try {
					read_file = new Scanner(file);
					if (file.isFile()) {
						while (read_file.hasNext()) {
							get_base()[i] = read_file.nextInt();
							i++;
						}
					} else {
						jtextField.setText("");
					}
					jtextField.setText(file.getPath());
					read_file.close();
					text_area_massage.append("");
					text_area_massage
							.append("<" + date_program + ">" + "--->" + "You Import File into the Program" + "\n");
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				jtextField.setText(open_file.getSelectedFile().toString());
			}
		}
		if (e.getSource() == jbutton_ok_configure) {
			get_configure = jtextField_configure.getText();// รับค่าความลึก
			fluid_contact = Integer.parseInt(get_configure);// ตัวหนังสือเป็นตัวเลข
			for (int i = 0; i < jbutton_table.length; i++) {
				jbutton_table[i] = new JButton("");// สร้างปุ่มว่าง
				jbutton_table[i].setBorder(BorderFactory.createLineBorder(Color.white, 1));// ขอบของปุ่ม
				jpanel_table.add(jbutton_table[i]);// แสดงผล
				calculate_result = (float) ((fluid_contact - (base_horizon[i] - 200)) * 0.5); // สูตรในการหา %
				data_gas[i] = (150 * 150) * (fluid_contact - (base_horizon[i] - 200));// ปริมาณ gas
				if (fluid_contact > base_horizon[i]) {
					dis[i] = fluid_contact - base_horizon[i];
				} else {
					dis[i] = base_horizon[i] - fluid_contact;
				}
				if(calculate_result > 100) {
                    data_gas [i] = data_gas [i]/(calculate_result / 100); 
                    calculate_result = 100;
                    jbutton_table [i].setBackground (Color.green); 
                }
                else if(calculate_result >= 75)
                {
                    jbutton_table [i].setBackground (Color.green); 
                }
                else if (calculate_result >= 50)
                {
                    jbutton_table [i].setBackground (Color.yellow); 
                }
                else if(calculate_result >= 25) {
                    jbutton_table [i].setBackground (Color.orange); 
                }
                else if(calculate_result >=0) {
                    jbutton_table [i].setBackground (Color.red); 
                }
                else {
                    data_gas [i] = 0;
                    calculate_result = 0;
                    jbutton_table [i].setBackground(Color.red);
                }
				sumall_gas += data_gas[i];// ผลรวม gas ทั้งหมด
				textField_sumall.setText(format_million.format(sumall_gas));// gas ทั้งหมด
				textField_max.setText(format_million.format(max_gas));// ค่าสูงสุด
				textField_min.setText(format_thousand.format(min_gas));// ค่าต่ำสุด
				textField_average.setText(format_million.format(sumall_gas / 200));// ค่าเฉลี่ย

				jbutton_table[i].setText(calculate_result + "%");// แสดงผลในตาราง 200 เป็น %

				area[i] = calculate_result;// % พื้นที่
				jbutton_table[i].addActionListener(listen);// ถ้ากดปุ่ม
				jbutton_table[i].setToolTipText(
						"<html>" + "Top Horizon = " + (base_horizon[i] - 200) + " <br> " + "Fluid Contact = "
								+ (fluid_contact) + " <br> " + " Base Horizon = " + (base_horizon[i]) + "<html>");// เม้าท์เลื่อนผ่าน
				text_in_box[i] += "Gas : " + format_million.format(data_gas[i]) + " M^2\nDeep : "
						+ format_thousand.format(fluid_contact) + " m.\nPercent : " + calculate_result
						+ " %\nTop Horizon : " + (base_horizon[i] - 200) + " m.\nFluid Contact : " + (fluid_contact)
						+ " m.\nBase Horizon : " + (base_horizon[i]) + " m.";// กดปุ่ม OK แสดงพื้นที่ Massage
			}
			text_area_massage.append("");
			text_area_massage
					.append("<" + date_program + ">" + "--->" + "You Input fluid Contrac " + fluid_contact + " m.\n");// เวลาทำงาน
		}
		if (e.getSource() == jbutton_clear_file) {
			jtextField.setText("");
			text_area_massage.append("");
			text_area_massage.append("<" + date_program + ">" + "--->" + "You Clear " + file + " \n");
		}
		if (e.getSource() == jbutton_clear_configure) {
			jtextField_configure.setText("");// ช่องว่าง
			textField_sumall.setText("");
			textField_max.setText("");
			textField_min.setText("");
			textField_average.setText("");
			jlabel_gas_area.setText("");
			jlabel_space_on.setText("");
			jlabel_distance.setText("");
			jlabel_space_lower.setText("");
			for (int i = 0; i < jbutton_table.length; i++) {
				jbutton_table[i].setText(null);
				jbutton_table[i].setBackground(null);
			}
			text_area_massage.append("");
			text_area_massage
					.append("<" + date_program + ">" + "--->" + "You Clear fluid Contrac " + fluid_contact + " m.\n");// เวลาทำงาน
		}
		if (e.getSource() == button_exit) {
			System.exit(0);
		}
	}

	int[] get_base() {
		return base_horizon;// ค่า 200 ช่องที่แปลงแล้ว
	}
}