package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ShipOrderUI extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShipOrderUI frame = new ShipOrderUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ShipOrderUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(6, 6, 226, 434);
		panel.setBackground(new Color(255, 239, 213));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("船票購買資訊");
		lblNewLabel.setBounds(73, 6, 87, 25);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("台東<->綠島");
		lblNewLabel_1.setBounds(6, 55, 97, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("台東<->蘭嶼");
		lblNewLabel_2.setBounds(6, 83, 87, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("蘭嶼<->綠島");
		lblNewLabel_3.setBounds(6, 111, 87, 16);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("單程");
		lblNewLabel_4.setBounds(123, 32, 37, 16);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("來回");
		lblNewLabel_5.setBounds(172, 32, 37, 16);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("600/張");
		lblNewLabel_6.setBounds(115, 55, 61, 16);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("800/張");
		lblNewLabel_7.setBounds(115, 83, 61, 16);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("700/張");
		lblNewLabel_8.setBounds(115, 111, 61, 16);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("1000/張");
		lblNewLabel_9.setBounds(172, 55, 61, 16);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("1500/張");
		lblNewLabel_10.setBounds(172, 83, 61, 16);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("僅單程");
		lblNewLabel_11.setBounds(172, 111, 61, 16);
		panel.add(lblNewLabel_11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(16, 139, 193, 113);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("團體票10張以上9折");
		lblNewLabel_13.setBounds(6, 25, 162, 16);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_12 = new JLabel("注意事項");
		lblNewLabel_12.setBounds(69, 6, 78, 16);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_14 = new JLabel("團體票20張以上8折");
		lblNewLabel_14.setBounds(6, 45, 162, 16);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("居民半價優惠(與團體不得重複)");
		lblNewLabel_15.setBounds(6, 64, 181, 16);
		panel_1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("目前綠島前往蘭嶼船班停航");
		lblNewLabel_16.setBounds(6, 84, 162, 16);
		panel_1.add(lblNewLabel_16);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBounds(244, 6, 450, 211);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_17 = new JLabel("船票訂購系統試算");
		lblNewLabel_17.setBounds(138, 5, 184, 22);
		lblNewLabel_17.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		panel_2.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("訂購人：");
		lblNewLabel_18.setBounds(19, 40, 61, 16);
		panel_2.add(lblNewLabel_18);
		
		name = new JTextField();
		name.setBounds(74, 39, 130, 26);
		panel_2.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("是否為島民：");
		lblNewLabel_19.setBounds(216, 40, 83, 16);
		panel_2.add(lblNewLabel_19);
		
		JRadioButton butt = new JRadioButton("是");
		butt.setBounds(294, 36, 45, 23);
		panel_2.add(butt);
		
		JLabel lblNewLabel_4_1 = new JLabel("單程");
		lblNewLabel_4_1.setBounds(152, 77, 37, 16);
		panel_2.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("來回");
		lblNewLabel_5_1.setBounds(241, 77, 37, 16);
		panel_2.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("台東<->綠島");
		lblNewLabel_1_1.setBounds(19, 100, 97, 16);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("台東<->蘭嶼");
		lblNewLabel_2_1.setBounds(19, 128, 87, 16);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("蘭嶼<->綠島");
		lblNewLabel_3_1.setBounds(19, 156, 87, 16);
		panel_2.add(lblNewLabel_3_1);
		
		JTextArea taiGreen1 = new JTextArea();
		taiGreen1.setText("0");
		taiGreen1.setBounds(126, 100, 63, 16);
		panel_2.add(taiGreen1);
		
		JTextArea taiLan1 = new JTextArea();
		taiLan1.setText("0");
		taiLan1.setBounds(126, 128, 63, 16);
		panel_2.add(taiLan1);
		
		JTextArea lanGreen = new JTextArea();
		lanGreen.setText("0");
		lanGreen.setBounds(126, 156, 63, 16);
		panel_2.add(lanGreen);
		
		JTextArea taiGreen2 = new JTextArea();
		taiGreen2.setText("0");
		taiGreen2.setBounds(216, 100, 63, 16);
		panel_2.add(taiGreen2);
		
		JTextArea taiLan2 = new JTextArea();
		taiLan2.setText("0");
		taiLan2.setBounds(215, 128, 63, 16);
		panel_2.add(taiLan2);
		
		JLabel lblNewLabel_8_1 = new JLabel("張");
		lblNewLabel_8_1.setBounds(191, 100, 23, 16);
		panel_2.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("張");
		lblNewLabel_8_1_1.setBounds(191, 128, 23, 16);
		panel_2.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_8_1_2 = new JLabel("張");
		lblNewLabel_8_1_2.setBounds(191, 156, 23, 16);
		panel_2.add(lblNewLabel_8_1_2);
		
		JLabel lblNewLabel_8_1_3 = new JLabel("張");
		lblNewLabel_8_1_3.setBounds(280, 100, 23, 16);
		panel_2.add(lblNewLabel_8_1_3);
		
		JLabel lblNewLabel_8_1_4 = new JLabel("張");
		lblNewLabel_8_1_4.setBounds(280, 128, 23, 16);
		panel_2.add(lblNewLabel_8_1_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(220, 220, 220));
		panel_3.setBounds(244, 229, 450, 211);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JTextArea outPut = new JTextArea();
		outPut.setBounds(6, 5, 438, 200);
		panel_3.add(outPut);
		
		
		JButton btnNewButton = new JButton("送出訂單");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				String Name = name.getText();
				String tG1 = taiGreen1.getText();
				String tG2 = taiGreen2.getText();
				String tL1 = taiLan1.getText();
				String tL2 = taiLan2.getText();
				String lG = lanGreen.getText();
				
				
				Integer TG1 = Integer.parseInt(tG1);
				Integer TG2 = Integer.parseInt(tG2);
				Integer TL1 = Integer.parseInt(tL1);
				Integer TL2 = Integer.parseInt(tL2);
				Integer LG = Integer.parseInt(lG);
				
				
				ShipOrder SSS = new ShipOrder(Name, TG1, TG2, TL1, TL2, LG);
				
				Integer totalTickets = TG1 + TG2 + TL1 + TL2 + LG;
				 
				if (butt.isSelected()) {
					// 如果 JRadioButton butt 结果为 true
					outPut.setText("你的訂單資料如下" +
							"\n訂購人為島民：" + SSS.getName() +
							"\n綠島單程船票：" + SSS.getTaiGreen1() + "張" +
							"\t綠島來回船票：" + SSS.getTaiGreen2() + "張" +
							"\n蘭嶼單程船票：" + SSS.getTaiLan1() + "張" +
							"\t蘭嶼來回船票：" + SSS.getTaiLan2() + "張" +
							"\n蘭嶼單程綠島：" + SSS.getLanGreen() + "張" +
							"\n半價後金額：" + ((int)(SSS.getSum() * 0.5)) + "元");
				} 
				else {
					if (totalTickets >= 0 && totalTickets <= 9) {
			            outPut.setText("你的訂單資料如下" +
			                    "\n訂購人：" + SSS.getName() +
			                    "\n綠島單程船票：" + SSS.getTaiGreen1() + "張" +
			                    "\t綠島來回船票：" + SSS.getTaiGreen2() + "張" +
			                    "\n蘭嶼單程船票：" + SSS.getTaiLan1() + "張" +
			                    "\t蘭嶼來回船票：" + SSS.getTaiLan2() + "張" +
			                    "\n蘭嶼單程綠島：" + SSS.getLanGreen() + "張" +
			                    "\n總金額：" + SSS.getSum() + "元");
			        } else if (totalTickets >= 10 && totalTickets <= 19) {
			            outPut.setText("你的訂單資料如下" +
			                    "\n訂購人：" + SSS.getName() +
			                    "\n綠島單程船票：" + SSS.getTaiGreen1() + "張" +
			                    "\t綠島來回船票：" + SSS.getTaiGreen2() + "張" +
			                    "\n蘭嶼單程船票：" + SSS.getTaiLan1() + "張" +
			                    "\t蘭嶼來回船票：" + SSS.getTaiLan2() + "張" +
			                    "\n蘭嶼單程綠島：" + SSS.getLanGreen() + "張" +
			                    "\n團體九折金額：" + ((int)(SSS.getSum() * 0.9)) + "元");
			        } else if (totalTickets >= 20) {
			            outPut.setText("你的訂單資料如下" +
			                    "\n訂購人：" + SSS.getName() +
			                    "\n綠島單程船票：" + SSS.getTaiGreen1() + "張" +
			                    "\t綠島來回船票：" + SSS.getTaiGreen2() + "張" +
			                    "\n蘭嶼單程船票：" + SSS.getTaiLan1() + "張" +
			                    "\t蘭嶼來回船票：" + SSS.getTaiLan2() + "張" +
			                    "\n蘭嶼單程綠島：" + SSS.getLanGreen() + "張" +
			                    "\n團體八折金額：" + ((int)(SSS.getSum() * 0.8)) + "元");
			        } else {
			            outPut.setText("訂單無效"+
			            "\n輸入欄內禁止空白或無效數字");
			        }
					
				}	
			}
		});
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.setBounds(308, 151, 117, 54);
		panel_2.add(btnNewButton);
	}
}



/*
 * package com.cz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ShipOrderUI extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShipOrderUI frame = new ShipOrderUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 
	public ShipOrderUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(6, 6, 226, 434);
		panel.setBackground(new Color(255, 239, 213));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("船票購買資訊");
		lblNewLabel.setBounds(73, 6, 87, 25);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("台東<->綠島");
		lblNewLabel_1.setBounds(6, 55, 97, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("台東<->蘭嶼");
		lblNewLabel_2.setBounds(6, 83, 87, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("蘭嶼<->綠島");
		lblNewLabel_3.setBounds(6, 111, 87, 16);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("單程");
		lblNewLabel_4.setBounds(123, 32, 37, 16);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("來回");
		lblNewLabel_5.setBounds(172, 32, 37, 16);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("600/張");
		lblNewLabel_6.setBounds(115, 55, 61, 16);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("800/張");
		lblNewLabel_7.setBounds(115, 83, 61, 16);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("700/張");
		lblNewLabel_8.setBounds(115, 111, 61, 16);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("1000/張");
		lblNewLabel_9.setBounds(172, 55, 61, 16);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("1500/張");
		lblNewLabel_10.setBounds(172, 83, 61, 16);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("僅單程");
		lblNewLabel_11.setBounds(172, 111, 61, 16);
		panel.add(lblNewLabel_11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(16, 139, 193, 113);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("團體票10張以上9折");
		lblNewLabel_13.setBounds(6, 25, 162, 16);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_12 = new JLabel("注意事項");
		lblNewLabel_12.setBounds(69, 6, 78, 16);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_14 = new JLabel("團體票20張以上8折");
		lblNewLabel_14.setBounds(6, 45, 162, 16);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("居民半價優惠(與團體不得重複)");
		lblNewLabel_15.setBounds(6, 64, 181, 16);
		panel_1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("目前綠島前往蘭嶼船班停航");
		lblNewLabel_16.setBounds(6, 84, 162, 16);
		panel_1.add(lblNewLabel_16);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBounds(244, 6, 450, 211);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_17 = new JLabel("船票訂購系統試算");
		lblNewLabel_17.setBounds(138, 5, 184, 22);
		lblNewLabel_17.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		panel_2.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("訂購人：");
		lblNewLabel_18.setBounds(19, 40, 61, 16);
		panel_2.add(lblNewLabel_18);
		
		name = new JTextField();
		name.setBounds(74, 39, 130, 26);
		panel_2.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("是否為島民：");
		lblNewLabel_19.setBounds(216, 40, 83, 16);
		panel_2.add(lblNewLabel_19);
		
		JRadioButton butt = new JRadioButton("是");
		butt.setBounds(294, 36, 45, 23);
		panel_2.add(butt);
		
		JLabel lblNewLabel_4_1 = new JLabel("單程");
		lblNewLabel_4_1.setBounds(152, 77, 37, 16);
		panel_2.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("來回");
		lblNewLabel_5_1.setBounds(241, 77, 37, 16);
		panel_2.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("台東<->綠島");
		lblNewLabel_1_1.setBounds(19, 100, 97, 16);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("台東<->蘭嶼");
		lblNewLabel_2_1.setBounds(19, 128, 87, 16);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("蘭嶼<->綠島");
		lblNewLabel_3_1.setBounds(19, 156, 87, 16);
		panel_2.add(lblNewLabel_3_1);
		
		JTextArea taiGreen1 = new JTextArea();
		taiGreen1.setText("0");
		taiGreen1.setBounds(126, 100, 63, 16);
		panel_2.add(taiGreen1);
		
		JTextArea taiLan1 = new JTextArea();
		taiLan1.setText("0");
		taiLan1.setBounds(126, 128, 63, 16);
		panel_2.add(taiLan1);
		
		JTextArea lanGreen = new JTextArea();
		lanGreen.setText("0");
		lanGreen.setBounds(126, 156, 63, 16);
		panel_2.add(lanGreen);
		
		JTextArea taiGreen2 = new JTextArea();
		taiGreen2.setText("0");
		taiGreen2.setBounds(216, 100, 63, 16);
		panel_2.add(taiGreen2);
		
		JTextArea taiLan2 = new JTextArea();
		taiLan2.setText("0");
		taiLan2.setBounds(215, 128, 63, 16);
		panel_2.add(taiLan2);
		
		JLabel lblNewLabel_8_1 = new JLabel("張");
		lblNewLabel_8_1.setBounds(191, 100, 23, 16);
		panel_2.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("張");
		lblNewLabel_8_1_1.setBounds(191, 128, 23, 16);
		panel_2.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_8_1_2 = new JLabel("張");
		lblNewLabel_8_1_2.setBounds(191, 156, 23, 16);
		panel_2.add(lblNewLabel_8_1_2);
		
		JLabel lblNewLabel_8_1_3 = new JLabel("張");
		lblNewLabel_8_1_3.setBounds(280, 100, 23, 16);
		panel_2.add(lblNewLabel_8_1_3);
		
		JLabel lblNewLabel_8_1_4 = new JLabel("張");
		lblNewLabel_8_1_4.setBounds(280, 128, 23, 16);
		panel_2.add(lblNewLabel_8_1_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(220, 220, 220));
		panel_3.setBounds(244, 229, 450, 211);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JTextArea outPut = new JTextArea();
		outPut.setBounds(6, 5, 438, 200);
		panel_3.add(outPut);
		
		
		JButton btnNewButton = new JButton("送出訂單");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				String Name = name.getText();
				String tG1 = taiGreen1.getText();
				String tG2 = taiGreen2.getText();
				String tL1 = taiLan1.getText();
				String tL2 = taiLan2.getText();
				String lG = lanGreen.getText();

				if (Name.equals("") || Name == null) {
					outPut.setText("輸入正確資訊");
					return;
				}

				ShipOrder shipOrder;
				try{
					Integer TG1 = Integer.parseInt(tG1);
					Integer TG2 = Integer.parseInt(tG2);
					Integer TL1 = Integer.parseInt(tL1);
					Integer TL2 = Integer.parseInt(tL2);
					Integer LG = Integer.parseInt(lG);

					shipOrder = new ShipOrder(Name, TG1, TG2, TL1, TL2, LG);
				} catch (Exception ex) {
					outPut.setText("輸入正確資訊");
					return;
				}

				outPut.setText(shipOrder.calculate(butt.isSelected()));

			}
		});
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.setBounds(308, 151, 117, 54);
		panel_2.add(btnNewButton);
	}
}


 */
