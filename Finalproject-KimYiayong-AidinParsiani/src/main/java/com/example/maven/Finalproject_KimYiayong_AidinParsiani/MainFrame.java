package com.example.maven.Finalproject_KimYiayong_AidinParsiani;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainFrame {

	private JFrame frame;
	private JTextField tffirstNumber;
	private JTextField tfsecondNumber;
	private JLabel lblEnterYourFirst = new JLabel("Enter your first number/only number");
	private JLabel lblNewLabel = new JLabel("Enter your second number");
	private JLabel lblResult = new JLabel("Result:");
	private ScientificCalculator sc = new ScientificCalculator();
	private SimpleCalculator sic = new SimpleCalculator();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 296, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tffirstNumber = new JTextField();
		tffirstNumber.setBounds(24, 82, 125, 20);	
		frame.getContentPane().add(tffirstNumber);
		tffirstNumber.setColumns(10);
		
		JButton btaddition = new JButton("+");
		btaddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double addition = sic.addition(Double.parseDouble(tffirstNumber.getText()), Double.parseDouble(tfsecondNumber.getText()));
				String result = String.valueOf(addition);
				lblResult.setText("Result: " + result);
				cleanTextFields();
			}
		});
		
		tfsecondNumber = new JTextField();
		tfsecondNumber.setBounds(24, 138, 125, 20);
		frame.getContentPane().add(tfsecondNumber);
		tfsecondNumber.setColumns(10);
		btaddition.setBounds(10, 243, 64, 23);
		frame.getContentPane().add(btaddition);
		
		JButton btnsubstraction = new JButton("-");
		btnsubstraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double substraction = sic.substraction(Double.parseDouble(tffirstNumber.getText()), Double.parseDouble(tfsecondNumber.getText()));
				String result = String.valueOf(substraction);
				lblResult.setText("Result: " + result);
			}
		});
		btnsubstraction.setBounds(74, 243, 64, 23);
		frame.getContentPane().add(btnsubstraction);
		
		JButton btnmultiplication = new JButton("*");
		btnmultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double multiplication = sic.multiplication(Double.parseDouble(tffirstNumber.getText()), Double.parseDouble(tfsecondNumber.getText()));
				String result = String.valueOf(multiplication);
				lblResult.setText("Result: " + result);
				cleanTextFields();
			}
		});
		btnmultiplication.setBounds(142, 243, 64, 23);
		frame.getContentPane().add(btnmultiplication);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double division = sic.division(Double.parseDouble(tffirstNumber.getText()), Double.parseDouble(tfsecondNumber.getText()));
				String result = String.valueOf(division);
				lblResult.setText("Result: " + result);
				cleanTextFields();
			}
		});
		btndivide.setBounds(206, 243, 64, 23);
		frame.getContentPane().add(btndivide);
		
		JButton btnsqrt = new JButton("SQRT");
		btnsqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double sqrt = sc.sqrt(Double.parseDouble(tffirstNumber.getText()));
				String result = String.valueOf(sqrt);
				lblResult.setText("Result: " + result);
				cleanTextFields();
			}
		});
		btnsqrt.setBounds(10, 277, 64, 23);
		frame.getContentPane().add(btnsqrt);
		
		JButton btnpow2 = new JButton("x^2");
		btnpow2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double pow2 = sc.pow2(Double.parseDouble(tffirstNumber.getText()));
				String result = String.valueOf(pow2);
				lblResult.setText("Result: " + result);
				cleanTextFields();
			}
		});
		btnpow2.setBounds(74, 277, 64, 23);
		frame.getContentPane().add(btnpow2);
		
		JButton btnpow3 = new JButton("x^3");
		btnpow3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double pow3 = sc.pow3(Double.parseDouble(tffirstNumber.getText()));
				String result = String.valueOf(pow3);
				lblResult.setText("Result: " + result);
				cleanTextFields();

			}
		});
		btnpow3.setBounds(142, 277, 64, 23);
		frame.getContentPane().add(btnpow3);
		
		JButton btncos = new JButton("COS");
		btncos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double COS = sc.COS(Double.parseDouble(tffirstNumber.getText()));
				String result = String.valueOf(COS);
				lblResult.setText("Result: " + result);
				cleanTextFields();

			}
		});
		btncos.setBounds(206, 277, 64, 23);
		frame.getContentPane().add(btncos);
		
		JButton btnsin = new JButton("SIN");
		btnsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double SIN = sc.SIN(Double.parseDouble(tffirstNumber.getText()));
				String result = String.valueOf(SIN);
				lblResult.setText("Result: " + result);
				cleanTextFields();
			}
		});
		btnsin.setBounds(10, 311, 64, 23);
		frame.getContentPane().add(btnsin);
		
		JButton btntan = new JButton("TAN");
		btntan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double TAN =sc.TAN(Double.parseDouble(tffirstNumber.getText()));
				String result = String.valueOf(TAN);
				lblResult.setText("Result: " + result);
				cleanTextFields();
			}
		});
		btntan.setBounds(74, 311, 64, 23);
		frame.getContentPane().add(btntan);
		
		
		lblEnterYourFirst.setBounds(24, 57, 205, 14);
		frame.getContentPane().add(lblEnterYourFirst);
		
		
		lblNewLabel.setBounds(20, 113, 186, 14);
		frame.getContentPane().add(lblNewLabel);
		
		
		lblResult.setBounds(20, 185, 129, 14);
		frame.getContentPane().add(lblResult);
	}
	public void cleanTextFields() {
		tffirstNumber.setText("");
		tfsecondNumber.setText("");
	}
}
