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

public class Array extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	Object[] arr;
	int n;
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1035, 750);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Array");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(373, 22, 417, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Array Size :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(43, 92, 229, 35);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				 n = Integer.parseInt(textField.getText());
			
				if(n<=0) {
					JOptionPane.showMessageDialog(null, "Enter valid number");
				}
				else {
				 arr = new Object[n];	
				JOptionPane.showMessageDialog(null, "Array Created");
				}
				textField.setText("");
				}
				catch (Exception e1) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Please enter a valid integer for size");
				}
				 
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(681, 92, 136, 37);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(273, 92, 194, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2 = new JLabel("Position :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2.setBounds(43, 181, 187, 35);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(170, 186, 161, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JLabel lblNewLabel_3 = new JLabel("Element :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_3.setBounds(539, 178, 144, 28);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(656, 181, 179, 31);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JButton btnNewButton_1 = new JButton("Insert");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int pos = Integer.parseInt(textField_1.getText());
				String elementStr = textField_2.getText();
				//Object element = Integer.parseInt(textField_2.getText());
				Object element = parseElement(elementStr);
				if(pos>=n) {
					JOptionPane.showMessageDialog(null, "Enter valid Index");
				}
				else {
				arr[pos] = element;
				JOptionPane.showMessageDialog(null, "Element Inserted");
				}
				 textField_1.setText("");
				 textField_2.setText("");
			}
			catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "Invalid position input");
			}
			}
		});
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_1.setBounds(392, 231, 121, 40);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel(" Position To Delete :");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_4.setBounds(43, 321, 248, 40);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(287, 321, 194, 34);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try  {
				int pos = Integer.parseInt(textField_3.getText());
				if(pos>=n) {
					JOptionPane.showMessageDialog(null, "Enter valid Index");
				}
				else {
				arr[pos] = null;
				JOptionPane.showMessageDialog(null, "Element Deleted");
				}
				 textField_3.setText("");
			}
			catch (Exception e3) {
				// TODO: handle exception
			}
			}
		});
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_2.setBounds(630, 321, 136, 40);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_5 = new JLabel("Array Elements :");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_5.setBounds(43, 432, 229, 40);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(257, 432, 620, 34);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		textField_4.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JButton btnNewButton_3 = new JButton("Display");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder arrayText = new StringBuilder();
		        for (Object item : arr) {
		            arrayText.append(item).append(" "); // Add a space between elements
		        }
		        textField_4.setText(arrayText.toString().trim());
		       
			}
		});
		btnNewButton_3.setForeground(Color.RED);
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_3.setBounds(154, 536, 194, 52);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Back");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h = new Home();
				h.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setForeground(Color.RED);
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_4.setBounds(644, 536, 161, 52);
		contentPane.add(btnNewButton_4);
	}

private Object parseElement(String elementStr) {
	try {
		return Integer.parseInt(elementStr);
	} catch (NumberFormatException e1) {
		try {
			return Double.parseDouble(elementStr);
		} catch (NumberFormatException e2) {
			return elementStr; // If not a number, store as String
		}
	}
}
}
