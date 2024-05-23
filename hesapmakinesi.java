package ders7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Action;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class gercekhesapmakinesi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int operator;
	private double sonuc,sayi,hafıza;
	private JTextField txtekran;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gercekhesapmakinesi frame = new gercekhesapmakinesi();
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
	public void addInput(String str)
	{
		txtekran.setText(txtekran.getText()+str);
		//addInput ekrandaki sayıyı alıyo
	}
	
	public void calculate() { 
		
		switch(operator)
		{
		case 1:
			sonuc= sayi +  Double.parseDouble(txtekran.getText());

			txtekran.setText(Double.toString(sonuc));
			
			break;
		case 2:
			sonuc= sayi -  Double.parseDouble(txtekran.getText());
			txtekran.setText(Double.toString(sonuc));
			break;
		case 3:
			sonuc= sayi *  Double.parseDouble(txtekran.getText());
			txtekran.setText(Double.toString(sonuc));
			break;
		case 4:
			sonuc= sayi /  Double.parseDouble(txtekran.getText());
			sonuc+=hafıza;
			txtekran.setText(Double.toString(sonuc));
			break;
	
		}
		
	}
	
	
	
	public gercekhesapmakinesi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(254, 96, 117));
		panel.setBounds(-72, 0, 594, 272);
		
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(new Color(0, 0, 0));
		btn9.setBounds(252, 89, 63, 29);
		panel.add(btn9);
		btn9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		
		JButton btn6 = new JButton("6");
		btn6.setForeground(new Color(0, 0, 0));
		btn6.setBounds(252, 130, 60, 29);
		panel.add(btn6);
		btn6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		
		JButton btn3 = new JButton("3");
		btn3.setForeground(new Color(0, 0, 0));
		btn3.setBounds(252, 171, 60, 29);
		panel.add(btn3);
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(new Color(0, 0, 0));
		btn0.setBounds(102, 214, 141, 29);
		panel.add(btn0);
		btn0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(new Color(0, 0, 0));
		btn8.setBounds(180, 89, 63, 29);
		panel.add(btn8);
		btn8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		
		JButton btn = new JButton("5");
		btn.setForeground(new Color(0, 0, 0));
		btn.setBounds(180, 130, 63, 29);
		panel.add(btn);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		
		JButton btn2 = new JButton("2");
		btn2.setForeground(new Color(0, 0, 0));
		btn2.setBounds(177, 171, 63, 29);
		panel.add(btn2);
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		
		JButton btnNewButton_7 = new JButton("/");
		btnNewButton_7.setBackground(new Color(234, 182, 64));
		btnNewButton_7.setBounds(318, 48, 63, 29);
		panel.add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sayi=Double.parseDouble(txtekran.getText());
				operator=4;
				calculate();
				txtekran.setText(" ");
				
				
			}
			
		});
		
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(new Color(0, 0, 0));
		btn1.setBackground(new Color(233, 242, 232));
		btn1.setBounds(102, 171, 63, 29);
		panel.add(btn1);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(new Color(0, 0, 0));
		btn4.setBounds(102, 130, 64, 29);
		panel.add(btn4);
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(new Color(0, 0, 0));
		btn7.setBounds(102, 89, 63, 29);
		panel.add(btn7);
		btn7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		
		txtekran = new JTextField();
		txtekran.setForeground(new Color(0, 0, 0));
		txtekran.setBackground(new Color(248, 255, 185));
		txtekran.setEditable(false);
		txtekran.setBounds(105, 6, 276, 40);
		panel.add(txtekran);
		txtekran.setColumns(100);
		
		JButton btnNewButton_11 = new JButton("+");
		btnNewButton_11.setBackground(new Color(254, 187, 33));
		btnNewButton_11.setBounds(318, 89, 63, 29);
		panel.add(btnNewButton_11);
		btnNewButton_11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sayi=Double.parseDouble(txtekran.getText());
				operator=1;
				calculate();
				hafıza=  Double.parseDouble(txtekran.getText());

			
				txtekran.setText(" "+hafıza);
				
			}
			
		});
		
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.setBounds(318, 130, 63, 29);
		panel.add(btnNewButton_12);
		btnNewButton_12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sayi=Double.parseDouble(txtekran.getText());
				operator=2;
				calculate();
				txtekran.setText(" ");
				
				
			}
			
		});
		
		
		JButton btnNewButton_13 = new JButton("=");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		btnNewButton_13.setBounds(318, 214, 63, 29);
		panel.add(btnNewButton_13);
		
		JButton btnNewButton = new JButton("*");
	
		btnNewButton.setBounds(321, 171, 60, 29);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("C");
		btnNewButton_1.setBounds(115, 48, 38, 29);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtekran.setText("");
			}

		});
		
		JButton btnNewButton_2 = new JButton("%");
		btnNewButton_2.setForeground(new Color(3, 3, 3));
		btnNewButton_2.setBounds(180, 48, 63, 29);
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sayi=Double.parseDouble(txtekran.getText());
				sonuc=sayi/100;
				txtekran.setText(""+sonuc);
			}
			
		});
		
		JButton btnNewButton_3 = new JButton("x²");
		btnNewButton_3.setBounds(252, 48, 63, 29);
		panel.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sayi=Double.parseDouble(txtekran.getText());
				sonuc=sayi*sayi;
				txtekran.setText(""+sonuc);
			}
			
		});
		
		JButton btnNewButton_4 = new JButton(",");
		btnNewButton_4.setBounds(252, 214, 63, 29);
		panel.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				txtekran.setText(txtekran.getText()+",");
			}
			
		});
	}
}
