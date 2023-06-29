package WinBuilder;

import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class AreaShowColer {
	public AreaShowColer(JPanel panel_gas_aera, JLabel graph_lower, JLabel graph_on, JLabel data_on, JLabel data_lower,
			float area, float data_gas, int distance, DecimalFormat format_one, DecimalFormat format_two,
			DecimalFormat format_three) {
		float height_on = (int) area;
		if (area < 0) {
			panel_gas_aera.setSize(330, (int) height_on);
			float height_lower = 100 - (int) area;
			panel_gas_aera.setSize(330, (int) height_lower);
			height_lower = height_lower * 330;
		} else {
			panel_gas_aera.setSize(330, (int) height_on * 2);
			float height_lower = 50 + (int) area;
			panel_gas_aera.setSize(330, (int) height_lower);
			height_lower = height_lower * 330;
		}
		if (height_on >= 100) {
			data_on.setBounds(85, (155 - (int) height_on), 160, 20);
			graph_on.setLocation(155, (155 - (int) height_on));
			graph_on.setText(format_two.format(data_gas));
			data_lower.setBounds(100, (260 - (int) height_on), 160, 20);
			graph_lower.setLocation(170, (260 - (int) height_on));
			graph_lower.setText(format_one.format(distance));
		} else if (height_on >= 95) {
			data_on.setBounds(85, (140 - (int) height_on), 160, 20);
			graph_on.setLocation(155, (140 - (int) height_on));
			graph_on.setText(format_two.format(data_gas));
			data_lower.setBounds(100, (245 - (int) height_on), 160, 20);
			graph_lower.setLocation(170, (245 - (int) height_on));
			graph_lower.setText(format_one.format(distance));
		} else if (height_on >= 90) {
			data_on.setBounds(85, (135 - (int) height_on), 160, 20);
			graph_on.setLocation(155, (135 - (int) height_on));
			graph_on.setText(format_two.format(data_gas));
			data_lower.setBounds(100, (240 - (int) height_on), 160, 20);
			graph_lower.setLocation(170, (240 - (int) height_on));
			graph_lower.setText(format_one.format(distance));
		} else if (height_on >= 85) {
			data_on.setBounds(85, (155 - (int) height_on), 160, 20);
			graph_on.setLocation(155, (130 - (int) height_on));
			graph_on.setText(format_two.format(data_gas));
			data_lower.setBounds(100, (235 - (int) height_on), 160, 20);
			graph_lower.setLocation(170, (235 - (int) height_on));
			graph_lower.setText(format_one.format(distance));
		} else if (height_on >= 80) {
			data_on.setBounds(85, (125 - (int) height_on), 160, 20);
			graph_on.setLocation(155, (125 - (int) height_on));
			graph_on.setText(format_two.format(data_gas));
			data_lower.setBounds(100, (230 - (int) height_on), 160, 20);
			graph_lower.setLocation(170, (230 - (int) height_on));
			graph_lower.setText(format_one.format(distance));
		} else if (height_on >= 75) {
			data_on.setBounds(85, (120 - (int) height_on), 160, 20);
			graph_on.setLocation(155, (120 - (int) height_on));
			graph_on.setText(format_two.format(data_gas));
			data_lower.setBounds(100, (225 - (int) height_on), 155, 20);
			graph_lower.setLocation(170, (225 - (int) height_on));
			graph_lower.setText(format_one.format(distance));
		} else if (height_on >= 70) {
			data_on.setBounds(85, (115 - (int) height_on), 160, 20);
			graph_on.setLocation(155, (115 - (int) height_on));
			graph_on.setText(format_two.format(data_gas));
			data_lower.setBounds(100, (220 - (int) height_on), 155, 20);
			graph_lower.setLocation(170, (220 - (int) height_on));
			graph_lower.setText(format_one.format(distance));
		} else if (height_on >= 65) {
			data_on.setBounds(85, (110 - (int) height_on), 160, 20);
			graph_on.setLocation(150, (110 - (int) height_on));
			graph_on.setText(format_two.format(data_gas));
			data_lower.setBounds(100, (210 - (int) height_on), 160, 20);
			graph_lower.setLocation(170, (210 - (int) height_on));
			graph_lower.setText(format_one.format(distance));
		} else if (height_on >= 60) {
			data_on.setBounds(85, (100 - (int) height_on), 160, 20);
			graph_on.setLocation(150, (100 - (int) height_on));
			graph_on.setText(format_two.format(data_gas));
			data_lower.setBounds(100, (205 - (int) height_on), 160, 20);
			graph_lower.setLocation(170, (205 - (int) height_on));
			graph_lower.setText(format_one.format(distance));
		} else if (height_on >= 55) {
			data_on.setBounds(85, (90 - (int) height_on), 160, 20);
			graph_on.setLocation(150, (90 - (int) height_on));//
			graph_on.setText(format_two.format(data_gas));
			data_lower.setBounds(100, (195 - (int) height_on), 160, 20);
			graph_lower.setLocation(170, (195 - (int) height_on));
			graph_lower.setText(format_one.format(distance));
		} else if (height_on >= 50) {
			data_on.setBounds(85, (85 - (int) height_on), 160, 20);
			graph_on.setLocation(150, (85 - (int) height_on));
			graph_on.setText(format_two.format(data_gas));
			data_lower.setBounds(100, (190 - (int) height_on), 160, 20);
			graph_lower.setLocation(170, (190 - (int) height_on));
			graph_lower.setText(format_one.format(distance));
		} else if (height_on >= 45) {
			data_on.setBounds(85, (75 - (int) height_on), 160, 20);
			graph_on.setLocation(150, (75 - (int) height_on));
			graph_on.setText(format_two.format(data_gas));
			data_lower.setBounds(100, (180 - (int) height_on), 160, 20);
			graph_lower.setLocation(170, (180 - (int) height_on));
			graph_lower.setText(format_one.format(distance));

		} else if (height_on >= 40) {
			data_on.setBounds(85, (70 - (int) height_on), 160, 20);
			graph_on.setLocation(150, (70 - (int) height_on));
			graph_on.setText(format_two.format(data_gas));
			data_lower.setBounds(100, (175 - (int) height_on), 155, 20);
			graph_lower.setLocation(170, (175 - (int) height_on));
			graph_lower.setText(format_one.format(distance));
		} else if (height_on >= 35) {
			data_on.setBounds(85, (65 - (int) height_on), 160, 20);
			graph_on.setLocation(150, (65 - (int) height_on));
			graph_on.setText(format_two.format(data_gas));
			data_lower.setBounds(100, (170 - (int) height_on), 155, 20);
			graph_lower.setLocation(170, (170 - (int) height_on));
			graph_lower.setText(format_one.format(distance));
		} else if (height_on >= 30) {
			data_on.setBounds(85, (60 - (int) height_on), 160, 20);
			graph_on.setLocation(150, (60 - (int) height_on));
			graph_on.setText(format_two.format(data_gas));
			data_lower.setBounds(100, (165 - (int) height_on), 155, 20);
			graph_lower.setLocation(170, (165 - (int) height_on));
			graph_lower.setText(format_one.format(distance));
		} else if (height_on >= 25) {
			data_on.setBounds(85, (50 - (int) height_on), 160, 20);
			graph_on.setLocation(155, (50 - (int) height_on));//
			graph_on.setText(format_two.format(data_gas));
			data_lower.setBounds(100, (150 - (int) height_on), 155, 20);
			graph_lower.setLocation(170, (150 - (int) height_on));
			graph_lower.setText(format_one.format(distance));
		} else if (height_on >= 20) {
			data_on.setBounds(85, (45 - (int) height_on), 160, 20);
			graph_on.setLocation(150, (45 - (int) height_on));
			graph_on.setText(format_two.format(data_gas));
			data_lower.setBounds(100, (145 - (int) height_on), 155, 20);
			graph_lower.setLocation(170, (145 - (int) height_on));
			graph_lower.setText(format_one.format(distance));
		} else if (height_on >= 15) {
			data_on.setBounds(85, (40 - (int) height_on), 160, 20);
			graph_on.setLocation(150, (40 - (int) height_on));
			graph_on.setText(format_two.format(data_gas));
			data_lower.setBounds(100, (140 - (int) height_on), 155, 20);
			graph_lower.setLocation(170, (140 - (int) height_on));
			graph_lower.setText(format_one.format(distance));
		} else if (height_on >= 10) {
			data_on.setBounds(85, (35 - (int) height_on), 160, 20);
			graph_on.setLocation(150, (35 - (int) height_on));
			graph_on.setText(format_two.format(data_gas));
			data_lower.setBounds(100, (135 - (int) height_on), 155, 20);
			graph_lower.setLocation(170, (135 - (int) height_on));
			graph_lower.setText(format_one.format(distance));
		} else if (height_on >= 5) {
			data_on.setBounds(85, (30 - (int) height_on), 160, 20);
			graph_on.setLocation(150, (30 - (int) height_on));
			graph_on.setText(format_two.format(data_gas));
			data_lower.setBounds(100, (130 - (int) height_on), 155, 20);
			graph_lower.setLocation(170, (130 - (int) height_on));
			graph_lower.setText(format_one.format(distance));
		} else if (height_on >= 0) {
			data_on.setBounds(85, (10 - (int) height_on), 160, 20);
			graph_on.setLocation(150, (10 - (int) height_on));
			graph_on.setText(format_three.format(data_gas));
			data_lower.setBounds(100, (110 - (int) height_on), 155, 20);
			graph_lower.setLocation(170, (110 - (int) height_on));
			graph_lower.setText(format_one.format(distance));
		}
	}
}