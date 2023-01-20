package calculatrice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class AppliCalculatrice {

	private JFrame frame;
	private JTextField txtDisplay;
	
	double firstNumber;
	double secondNumber;
	double result;
	String operations;
	String answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppliCalculatrice window = new AppliCalculatrice();
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
	public AppliCalculatrice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.setBounds(100, 100, 374, 355);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(enterNumber);
			/**************************************/
			}
		});
		btn9.setBounds(179, 114, 85, 53);
		frame.getContentPane().add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(enterNumber);
			/**************************************/
			}
		});
		btn8.setBounds(95, 114, 85, 53);
		frame.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(enterNumber);
			/**************************************/
			}
		});
		btn7.setBounds(7, 114, 85, 53);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(enterNumber);
			/**************************************/
			}
		});
		btn4.setBounds(7, 166, 85, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(enterNumber);
			/**************************************/
			}
		});
		btn5.setBounds(95, 166, 85, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(enterNumber);
			/**************************************/
			}
		});
		btn6.setBounds(179, 166, 85, 50);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(enterNumber);
			/**************************************/
			}
		});
		btn1.setBounds(7, 211, 85, 52);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(enterNumber);
			/**************************************/
			}
		});
		btn2.setBounds(95, 211, 85, 52);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(enterNumber);
			/**************************************/
			}
		});
		btn3.setBounds(179, 213, 85, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
				operations = "+";
			/**************************************/
			}
		});
		btnPlusMinus.setBounds(7, 262, 85, 52);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(enterNumber);
			/**************************************/
			}
		});
		btn0.setBounds(95, 262, 85, 52);
		frame.getContentPane().add(btn0);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			/**************************************/	
			}
		});
		btnAdd.setBounds(267, 212, 85, 51);
		frame.getContentPane().add(btnAdd);
		
		JButton btnBS = new JButton("\uF0E7");
		btnBS.setFont(new Font("TWingdings", Font.BOLD, 16));
		btnBS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(txtDisplay.getText().length() > 0) {
					StringBuilder StrB =new StringBuilder(txtDisplay.getText());
					StrB.deleteCharAt(txtDisplay.getText().length()-1);
					backSpace = StrB.toString();
					txtDisplay.setText(backSpace);
				}
				//permet de reculer
			/**************************************/
			}
		});
		btnBS.setBounds(7, 66, 85, 51);
		frame.getContentPane().add(btnBS);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("");
			/**************************************/
			}
		});
		btnC.setBounds(95, 66, 85, 51);
		frame.getContentPane().add(btnC);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtDisplay.getText() + btnDot.getText();
				txtDisplay.setText(enterNumber);
			/**************************************/	
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDot.setBounds(179, 262, 85, 52);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondNumber = Double.parseDouble(txtDisplay.getText());
				if(operations == "+") {
					result = firstNumber + secondNumber;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				} else if(operations == "-") {
					result = firstNumber - secondNumber;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				} else if(operations == "*") {
					result = firstNumber * secondNumber;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				} else if(operations == "/") {
					result = firstNumber / secondNumber;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				} else if(operations == "%") {
					result = firstNumber % secondNumber;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				//Vérification des différents types d'opération
			/**************************************/	
			}
		});
		btnEqual.setBounds(267, 262, 85, 52);
		frame.getContentPane().add(btnEqual);
		
		JButton btnX = new JButton("%");
		btnX.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			/**************************************/
			}
		});
		btnX.setBounds(179, 66, 85, 51);
		frame.getContentPane().add(btnX);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			/**************************************/
			}
		});
		btnMinus.setBounds(267, 166, 85, 50);
		frame.getContentPane().add(btnMinus);
		
		JButton btnMul = new JButton("*");
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			/**************************************/
			}
		});
		btnMul.setBounds(267, 114, 85, 53);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			/**************************************/
			}
		});
		btnDiv.setBounds(267, 66, 85, 51);
		frame.getContentPane().add(btnDiv);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtDisplay.setBounds(10, 10, 340, 46);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
	}
}
