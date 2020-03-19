package com.naim;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Rectangle;

public class Home extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame Frame;
	private JButton btnExit;
	private JButton btnClear;
	private JButton testView;
	private JButton btnPrint;
	
	private JTextArea txtView;

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf6;
	private JTextField tf7;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf13;
	private JTextField tf12;
	private JTextField tf11;
	private JTextField tf10;
	private JTextField tf9;
	private JTextField tf8;
	private JTextField tf17;
	private JTextField tf18;
	private JTextField tf19;
	private JTextField tf20;
	private JTextField tf21;
	private JTextField tf22;
	private JTextField tf23;
	private JTextField tf24;
	private JTextField tf25;
	private JTextField tf26;
	private JTextField tf27;
	private JTextField tf28;
	private JTextField tf29;
	private JTextField txtserial;
	private JTextField tf14;
	private JTextField tf15;
	private JTextField tf16;
	private JTextField tf31;
	private JTextField tf30;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\New folder\\shopping_icon.jpg"));
		setResizable(false);
		setTitle("Medicla Shop");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(SystemColor.inactiveCaption, 5));
		panel.setBounds(0, 0, 1284, 662);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, SystemColor.activeCaption, SystemColor.activeCaption, SystemColor.activeCaption, SystemColor.activeCaption));
		panel_1.setBounds(10, 67, 443, 577);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		testView = new JButton("Test View");
		testView.setIcon(null);
		testView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				txtView.setText("\t===================================\n\n"
			+
			"\t\tMy Memo\n"+"\t\tSerial Id:"+txtserial.getText()
			+"\n\t===================================\n\n"
			+"\tBat:"+tf1.getText()+"\t\t"
			+"Bat:"+tf2.getText()+"\n"
			+"\tBat:"+tf3.getText()+"\t\t"
			+"Bat:"+tf4.getText()+"\n"
			+"\tBat:"+tf5.getText()+"\t\t"
			+"Bat:"+tf6.getText()+"\n"
			+"\tBat:"+tf7.getText()+"\t\t"
			+"Bat:"+tf8.getText()+"\n"
			+"\tBat:"+tf9.getText()+"\t\t"
			+"Bat:"+tf10.getText()+"\n"
			+"\tBat:"+tf11.getText()+"\t\t"
			+"Bat:"+tf12.getText()+"\n"
			+"\tBat:"+tf13.getText()+"\t\t"
			+"Bat:"+tf14.getText()+"\n"
			+"\tBat:"+tf15.getText()+"\t\t"
			+"Bat:"+tf16.getText()+"\n"
			+"\tBat:"+tf17.getText()+"\t\t"
			+"Bat:"+tf18.getText()+"\n"
			+"\tBat:"+tf19.getText()+"\t\t"
			+"Bat:"+tf20.getText()+"\n"
			+"\tBat:"+tf21.getText()+"\t\t"
			+"Bat:"+tf22.getText()+"\n"
			+"\tBat:"+tf23.getText()+"\t\t"
			+"Bat:"+tf24.getText()+"\n"
			+"\tBat:"+tf25.getText()+"\t\t"
			+"Bat:"+tf26.getText()+"\n"
			+"\tBat:"+tf27.getText()+"\t\t"
			+"Bat:"+tf28.getText()+"\n"
			+"\tBat:"+tf29.getText()+"\t\t"
			+"Bat:"+tf30.getText()+"\n"
			+"\tBat:"+tf31.getText()+"\t\t"
		
			);
			}
		});
		testView.setBounds(49, 543, 97, 23);
		panel_1.add(testView);
		
		btnClear = new JButton("Reset");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtserial.setText(null);
				txtView.setText(null);
				tf1.setText(null);
				tf2.setText(null);
				tf3.setText(null);
				tf4.setText(null);
				tf5.setText(null);
				tf6.setText(null);
				tf7.setText(null);
				tf8.setText(null);
				tf9.setText(null);
				tf10.setText(null);
				tf11.setText(null);
				tf12.setText(null);
				tf13.setText(null);
				tf14.setText(null);
				tf15.setText(null);
				tf16.setText(null);
				tf17.setText(null);
				tf18.setText(null);
				tf19.setText(null);
				tf20.setText(null);
				tf21.setText(null);
				tf22.setText(null);
				tf23.setText(null);
				tf24.setText(null);
				tf25.setText(null);
				tf26.setText(null);
				tf27.setText(null);
				tf28.setText(null);
				tf29.setText(null);
				tf30.setText(null);
				tf31.setText(null);
				txtserial.requestFocus();
				
				
				
			}
		});
		btnClear.setBounds(324, 543, 89, 23);
		panel_1.add(btnClear);
		
		JLabel lblProductName = new JLabel("Product Name:");
		lblProductName.setForeground(SystemColor.activeCaption);
		lblProductName.setBackground(SystemColor.activeCaption);
		lblProductName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblProductName.setBounds(30, 11, 129, 30);
		panel_1.add(lblProductName);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setForeground(SystemColor.activeCaption);
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuantity.setBackground(SystemColor.activeCaption);
		lblQuantity.setBounds(284, 11, 129, 30);
		panel_1.add(lblQuantity);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new LineBorder(SystemColor.activeCaption, 3));
		separator.setBounds(20, 39, 384, 2);
		panel_1.add(separator);
		
		JLabel lblBat = new JLabel("Bat");
		lblBat.setBounds(49, 96, 46, 14);
		panel_1.add(lblBat);
		
		JLabel label = new JLabel("Bat");
		label.setBounds(49, 121, 46, 14);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("Bat");
		label_1.setBounds(49, 146, 46, 14);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("Bat");
		label_2.setBounds(49, 171, 46, 14);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Bat");
		label_3.setBounds(49, 196, 46, 14);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Bat");
		label_4.setBounds(49, 221, 46, 14);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("Bat");
		label_5.setBounds(49, 246, 46, 14);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("Bat");
		label_6.setBounds(49, 308, 46, 14);
		panel_1.add(label_6);
		
		JLabel label_10 = new JLabel("Bat");
		label_10.setBounds(49, 433, 46, 14);
		panel_1.add(label_10);
		
		JLabel label_11 = new JLabel("Bat");
		label_11.setBounds(49, 408, 46, 14);
		panel_1.add(label_11);
		
		JLabel label_12 = new JLabel("Bat");
		label_12.setBounds(49, 383, 46, 14);
		panel_1.add(label_12);
		
		JLabel label_13 = new JLabel("Bat");
		label_13.setBounds(49, 358, 46, 14);
		panel_1.add(label_13);
		
		JLabel label_14 = new JLabel("Bat");
		label_14.setBounds(49, 333, 46, 14);
		panel_1.add(label_14);
		
		tf1 = new JTextField();
		tf1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf2.requestFocus();
				break;
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf1.setBounds(280, 93, 86, 20);
		panel_1.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf3.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf1.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf2.setColumns(10);
		tf2.setBounds(280, 118, 86, 20);
		panel_1.add(tf2);
		
		tf3 = new JTextField();
		tf3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf4.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf2.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf3.setColumns(10);
		tf3.setBounds(280, 143, 86, 20);
		panel_1.add(tf3);
		
		tf4 = new JTextField();
		tf4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf5.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf3.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf4.setColumns(10);
		tf4.setBounds(280, 168, 86, 20);
		panel_1.add(tf4);
		
		tf5 = new JTextField();
		tf5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf6.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf4.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf5.setColumns(10);
		tf5.setBounds(280, 193, 86, 20);
		panel_1.add(tf5);
		
		tf6 = new JTextField();
		tf6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf7.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf5.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf6.setColumns(10);
		tf6.setBounds(280, 218, 86, 20);
		panel_1.add(tf6);
		
		tf7 = new JTextField();
		tf7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf8.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf6.requestFocus();
				break;
				
				}
				
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf7.setColumns(10);
		tf7.setBounds(280, 243, 86, 20);
		panel_1.add(tf7);
		
		tf13 = new JTextField();
		tf13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf14.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf12.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf13.setBounds(new Rectangle(280, 0, 0, 0));
		tf13.setColumns(10);
		tf13.setBounds(280, 430, 86, 20);
		panel_1.add(tf13);
		
		tf12 = new JTextField();
		tf12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf13.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf11.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf12.setBounds(new Rectangle(280, 0, 0, 0));
		tf12.setColumns(10);
		tf12.setBounds(280, 405, 86, 20);
		panel_1.add(tf12);
		
		tf11 = new JTextField();
		tf11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf12.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf10.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf11.setBounds(new Rectangle(280, 0, 0, 0));
		tf11.setColumns(10);
		tf11.setBounds(280, 380, 86, 20);
		panel_1.add(tf11);
		
		tf10 = new JTextField();
		tf10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf11.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf9.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf10.setBounds(new Rectangle(280, 0, 0, 0));
		tf10.setColumns(10);
		tf10.setBounds(280, 352, 86, 20);
		panel_1.add(tf10);
		
		tf9 = new JTextField();
		tf9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf10.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf8.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf9.setBounds(new Rectangle(280, 0, 0, 0));
		tf9.setColumns(10);
		tf9.setBounds(280, 327, 86, 20);
		panel_1.add(tf9);
		
		tf8 = new JTextField();
		tf8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf9.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf7.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf8.setBounds(new Rectangle(280, 0, 0, 0));
		tf8.setColumns(10);
		tf8.setBounds(280, 302, 86, 20);
		panel_1.add(tf8);
		
		JLabel lblClassA = new JLabel("Class A:");
		lblClassA.setForeground(SystemColor.activeCaption);
		lblClassA.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblClassA.setBackground(SystemColor.activeCaption);
		lblClassA.setBounds(30, 52, 129, 30);
		panel_1.add(lblClassA);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBorder(new LineBorder(SystemColor.activeCaption, 3));
		separator_2.setBounds(20, 76, 384, 2);
		panel_1.add(separator_2);
		
		JLabel lblClassB = new JLabel("Class B:");
		lblClassB.setForeground(SystemColor.activeCaption);
		lblClassB.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblClassB.setBackground(SystemColor.activeCaption);
		lblClassB.setBounds(30, 259, 129, 30);
		panel_1.add(lblClassB);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBorder(new LineBorder(SystemColor.activeCaption, 3));
		separator_3.setBounds(20, 289, 384, 2);
		panel_1.add(separator_3);
		
		JLabel label_7 = new JLabel("Bat");
		label_7.setBounds(49, 458, 46, 14);
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel("Bat");
		label_8.setBounds(49, 483, 46, 14);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("Bat");
		label_9.setBounds(49, 508, 46, 14);
		panel_1.add(label_9);
		
		tf14 = new JTextField();
		tf14.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf15.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf13.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf14.setColumns(10);
		tf14.setBounds(new Rectangle(280, 0, 0, 0));
		tf14.setBounds(280, 455, 86, 20);
		panel_1.add(tf14);
		
		tf15 = new JTextField();
		tf15.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf16.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf14.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf15.setColumns(10);
		tf15.setBounds(new Rectangle(280, 0, 0, 0));
		tf15.setBounds(280, 480, 86, 20);
		panel_1.add(tf15);
		
		tf16 = new JTextField();
		tf16.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf17.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf15.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf16.setColumns(10);
		tf16.setBounds(new Rectangle(280, 0, 0, 0));
		tf16.setBounds(280, 505, 86, 20);
		panel_1.add(tf16);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBorder(new LineBorder(SystemColor.activeCaption, 3));
		separator_4.setBounds(20, 530, 384, 2);
		panel_1.add(separator_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, SystemColor.activeCaption, SystemColor.activeCaption, SystemColor.activeCaption, SystemColor.activeCaption));
		panel_2.setBounds(463, 67, 356, 577);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_15 = new JLabel("Product Name:");
		label_15.setBounds(26, 11, 129, 30);
		label_15.setForeground(SystemColor.activeCaption);
		label_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_15.setBackground(SystemColor.activeCaption);
		panel_2.add(label_15);
		
		JLabel label_16 = new JLabel("Quantity:");
		label_16.setBounds(226, 11, 104, 30);
		label_16.setForeground(SystemColor.activeCaption);
		label_16.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_16.setBackground(SystemColor.activeCaption);
		panel_2.add(label_16);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBorder(new LineBorder(SystemColor.activeCaption, 3));
		separator_1.setBounds(26, 40, 304, 2);
		panel_2.add(separator_1);
		
		JLabel label_17 = new JLabel("Bat");
		label_17.setBounds(26, 92, 46, 14);
		panel_2.add(label_17);
		
		JLabel label_18 = new JLabel("Bat");
		label_18.setBounds(26, 117, 46, 14);
		panel_2.add(label_18);
		
		JLabel label_19 = new JLabel("Bat");
		label_19.setBounds(26, 142, 46, 14);
		panel_2.add(label_19);
		
		JLabel label_20 = new JLabel("Bat");
		label_20.setBounds(26, 200, 46, 14);
		panel_2.add(label_20);
		
		JLabel label_21 = new JLabel("Bat");
		label_21.setBounds(26, 225, 46, 14);
		panel_2.add(label_21);
		
		JLabel label_22 = new JLabel("Bat");
		label_22.setBounds(26, 250, 46, 14);
		panel_2.add(label_22);
		
		JLabel label_23 = new JLabel("Bat");
		label_23.setBounds(26, 301, 46, 14);
		panel_2.add(label_23);
		
		JLabel label_24 = new JLabel("Bat");
		label_24.setBounds(26, 326, 46, 14);
		panel_2.add(label_24);
		
		JLabel label_25 = new JLabel("Bat");
		label_25.setBounds(26, 351, 46, 14);
		panel_2.add(label_25);
		
		JLabel label_26 = new JLabel("Bat");
		label_26.setBounds(26, 397, 46, 14);
		panel_2.add(label_26);
		
		JLabel label_27 = new JLabel("Bat");
		label_27.setBounds(26, 422, 46, 14);
		panel_2.add(label_27);
		
		JLabel label_28 = new JLabel("Bat");
		label_28.setBounds(26, 446, 46, 14);
		panel_2.add(label_28);
		
		JLabel label_29 = new JLabel("Bat");
		label_29.setBounds(26, 471, 46, 14);
		panel_2.add(label_29);
		
		tf17 = new JTextField();
		tf17.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf18.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf16.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf17.setColumns(10);
		tf17.setBounds(222, 89, 86, 20);
		panel_2.add(tf17);
		
		tf18 = new JTextField();
		tf18.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf19.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf17.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf18.setColumns(10);
		tf18.setBounds(222, 114, 86, 20);
		panel_2.add(tf18);
		
		tf19 = new JTextField();
		tf19.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf20.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf18.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf19.setColumns(10);
		tf19.setBounds(222, 139, 86, 20);
		panel_2.add(tf19);
		
		tf20 = new JTextField();
		tf20.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf21.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf19.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf20.setColumns(10);
		tf20.setBounds(222, 197, 86, 20);
		panel_2.add(tf20);
		
		tf21 = new JTextField();
		tf21.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf22.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf20.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf21.setColumns(10);
		tf21.setBounds(222, 222, 86, 20);
		panel_2.add(tf21);
		
		tf22 = new JTextField();
		tf22.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf23.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf21.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf22.setColumns(10);
		tf22.setBounds(222, 247, 86, 20);
		panel_2.add(tf22);
		
		tf23 = new JTextField();
		tf23.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf24.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf22.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf23.setColumns(10);
		tf23.setBounds(226, 298, 86, 20);
		panel_2.add(tf23);
		
		tf24 = new JTextField();
		tf24.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf25.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf23.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf24.setColumns(10);
		tf24.setBounds(226, 323, 86, 20);
		panel_2.add(tf24);
		
		tf25 = new JTextField();
		tf25.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf26.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf24.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf25.setColumns(10);
		tf25.setBounds(226, 348, 86, 20);
		panel_2.add(tf25);
		
		tf26 = new JTextField();
		tf26.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf27.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf25.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf26.setColumns(10);
		tf26.setBounds(226, 397, 86, 20);
		panel_2.add(tf26);
		
		tf27 = new JTextField();
		tf27.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf28.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf26.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf27.setColumns(10);
		tf27.setBounds(226, 419, 86, 20);
		panel_2.add(tf27);
		
		tf28 = new JTextField();
		tf28.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf29.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf27.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf28.setColumns(10);
		tf28.setBounds(226, 443, 86, 20);
		panel_2.add(tf28);
		
		tf29 = new JTextField();
		tf29.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf30.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf28.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf29.setColumns(10);
		tf29.setBounds(226, 468, 86, 20);
		panel_2.add(tf29);
		
		JLabel lblClassC = new JLabel("Class C:");
		lblClassC.setForeground(SystemColor.activeCaption);
		lblClassC.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblClassC.setBackground(SystemColor.activeCaption);
		lblClassC.setBounds(26, 48, 129, 30);
		panel_2.add(lblClassC);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBorder(new LineBorder(SystemColor.activeCaption, 3));
		separator_5.setBounds(26, 77, 304, 2);
		panel_2.add(separator_5);
		
		JLabel lblClassD = new JLabel("Class D:");
		lblClassD.setForeground(SystemColor.activeCaption);
		lblClassD.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblClassD.setBackground(SystemColor.activeCaption);
		lblClassD.setBounds(26, 159, 129, 30);
		panel_2.add(lblClassD);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBorder(new LineBorder(SystemColor.activeCaption, 3));
		separator_6.setBounds(26, 187, 304, 2);
		panel_2.add(separator_6);
		
		JLabel lblClassE = new JLabel("Class E:");
		lblClassE.setForeground(SystemColor.activeCaption);
		lblClassE.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblClassE.setBackground(SystemColor.activeCaption);
		lblClassE.setBounds(26, 262, 129, 30);
		panel_2.add(lblClassE);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBorder(new LineBorder(SystemColor.activeCaption, 3));
		separator_7.setBounds(26, 290, 304, 2);
		panel_2.add(separator_7);
		
		JLabel lblClassF = new JLabel("Class F:");
		lblClassF.setForeground(SystemColor.activeCaption);
		lblClassF.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblClassF.setBackground(SystemColor.activeCaption);
		lblClassF.setBounds(26, 364, 129, 30);
		panel_2.add(lblClassF);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBorder(new LineBorder(SystemColor.activeCaption, 3));
		separator_8.setBounds(26, 392, 304, 2);
		panel_2.add(separator_8);
		
		JLabel label_30 = new JLabel("Bat");
		label_30.setBounds(26, 521, 46, 14);
		panel_2.add(label_30);
		
		JLabel label_31 = new JLabel("Bat");
		label_31.setBounds(26, 496, 46, 14);
		panel_2.add(label_31);
		
		tf31 = new JTextField();
		tf31.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf1.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf30.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf31.setColumns(10);
		tf31.setBounds(226, 518, 86, 20);
		panel_2.add(tf31);
		
		tf30 = new JTextField();
		tf30.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf31.requestFocus();
				break;
				
				case KeyEvent.VK_UP:tf29.requestFocus();
				break;
				
				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE)) {
					e.consume();
					
				}
			}
		});
		tf30.setColumns(10);
		tf30.setBounds(226, 493, 86, 20);
		panel_2.add(tf30);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, SystemColor.activeCaption, SystemColor.activeCaption, SystemColor.activeCaption, SystemColor.activeCaption));
		panel_3.setBounds(829, 67, 437, 577);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
	    btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					txtView.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnPrint.setBounds(35, 543, 89, 23);
		panel_3.add(btnPrint);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(Frame, "Do you want to exit ?", "Pharmacy",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION ) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(326, 543, 89, 23);
		panel_3.add(btnExit);
		
		txtView = new JTextArea();
		txtView.setBounds(10, 11, 417, 521);
		panel_3.add(txtView);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(SystemColor.activeCaption, 5));
		panel_4.setBounds(10, 11, 1256, 43);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("My Shop");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(75, 0, 128, 43);
		panel_4.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 56, 43);
		panel_4.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("E:\\New folder\\shopping_icon.jpg"));
		
		JLabel lblNewLabel_2 = new JLabel("Serial Id:");
		lblNewLabel_2.setForeground(SystemColor.activeCaption);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(1024, 11, 84, 21);
		panel_4.add(lblNewLabel_2);
		
		txtserial = new JTextField();
		txtserial.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				switch(key) {
				case KeyEvent.VK_DOWN:tf1.requestFocus();
				break;
				
				}
			}
		});
		txtserial.setBorder(new LineBorder(SystemColor.activeCaption, 3));
		txtserial.setForeground(SystemColor.activeCaption);
		txtserial.setBounds(1128, 13, 118, 20);
		panel_4.add(txtserial);
		txtserial.setColumns(10);
	}
}
