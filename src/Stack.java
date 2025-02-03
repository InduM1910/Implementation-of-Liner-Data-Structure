import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Stack extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	Object[] stack;
	int top;
	int maxSize;
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 846, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To Stack");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setBounds(235, 21, 442, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Size :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1.setBounds(22, 85, 169, 39);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(180, 86, 150, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int size = Integer.parseInt(textField.getText());
				maxSize = size; // Set maximum size
				if(size<=0) {
					JOptionPane.showMessageDialog(null, "Enter valid Number");
				} else {
		        stack = new Object[maxSize]; // Initialize the stack array
		        top = -1;
		      	JOptionPane.showMessageDialog(null, "Stack Created");
				}
				 textField.setText("");
			}
			
			catch (Exception e1) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "Please enter a valid integer for size");
			}
			}
		});
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setBounds(461, 87, 143, 37);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Element :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_2.setBounds(22, 146, 131, 39);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(163, 146, 167, 35);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JButton btnNewButton_1 = new JButton("Push");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//int element = Integer.parseInt(textField_1.getText());
				 if (top >= maxSize - 1) {
					 JOptionPane.showMessageDialog(null, "Stack Overflow");
			           } 
				 else {
						Object element = parseElement(textField_1.getText());
			            stack[++top] = element; // Increment top and assign value
			          	JOptionPane.showMessageDialog(null, "Element Pushed");
			        }
				 textField_1.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_1.setForeground(Color.GREEN);
		btnNewButton_1.setBounds(461, 148, 143, 37);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Elements In Stack :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_3.setBounds(22, 221, 261, 39);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(275, 221, 535, 51);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JButton btnNewButton_2 = new JButton("Pop");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if (top < 0) {
		        	JOptionPane.showMessageDialog(null, "Stack Underflow");
		            // Return a sentinel value
		        } else {
		            stack[top--] = null; // Return value and decrement top
		          	JOptionPane.showMessageDialog(null, "Element Popped");
		        }

			}
		});
		btnNewButton_2.setForeground(Color.GREEN);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_2.setBounds(42, 324, 197, 46);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Display");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder arrayText = new StringBuilder();
		        for (Object item : stack) {
		            arrayText.append(item).append(" "); // Add a space between elements
		        }
		        textField_2.setText(arrayText.toString().trim());
			}
		});
		btnNewButton_3.setForeground(Color.GREEN);
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_3.setBounds(549, 324, 197, 46);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Back");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h = new Home();
				h.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_4.setForeground(Color.GREEN);
		btnNewButton_4.setBounds(308, 438, 191, 51);
		contentPane.add(btnNewButton_4);
	}


private Object parseElement(String elementStr) {
	try {
		return Integer.parseInt(elementStr);
	} catch (NumberFormatException e1) {
		try {
			return Double.parseDouble(elementStr);
		} catch (NumberFormatException e2) {
			return elementStr;
		}
	}
}
}
