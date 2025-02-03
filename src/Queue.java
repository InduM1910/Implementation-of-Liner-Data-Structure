import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

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
					Queue frame = new Queue();
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
	 Object[] queue;
	 int front = 0; // Index of the front element
     int rear = -1; // Index of the last element
     int maxSize; // Maximum size of the queue
     int currentSize = 0 ; // Current size of the queue

	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 984, 684);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To Queue");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setBounds(293, 20, 377, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Size :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1.setBounds(29, 105, 230, 41);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(193, 105, 222, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(textField.getText());
				maxSize = n;
				if(n<=0) {
					JOptionPane.showMessageDialog(null, "Enter valid Number");
				}
				else {
				  queue = new Object[n];
				  JOptionPane.showMessageDialog(null, "Queue Created");
				}
				 textField.setText("");
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton.setBounds(577, 105, 171, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Element :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_2.setBounds(29, 185, 136, 41);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(193, 185, 222, 41);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JButton btnNewButton_1 = new JButton("Enqueue");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object value = parseElement(textField_1.getText());
				//int value = Integer.parseInt(textField_1.getText());
				 if (currentSize >= maxSize) {
			            JOptionPane.showMessageDialog(null, "Queue Overflow");
			        } 
				 else {
			            rear = (rear + 1) % maxSize; // Circular increment
			            queue[rear] = value; // Assign value
			            currentSize++; // Increase current size
			            JOptionPane.showMessageDialog(null, "Element Inserted");
			        }
				 textField_1.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBounds(577, 185, 171, 47);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Elements In Queue :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_3.setBounds(29, 278, 268, 58);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(307, 289, 624, 47);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JButton btnNewButton_2 = new JButton("Dequeue");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentSize <= 0) {
		            JOptionPane.showMessageDialog(null, "Queue Underflow");
		        } else {
		            queue[front] = 0; // Get front value
		            front = (front + 1) % maxSize; // Circular increment
		            currentSize--; // Decrease current size
		            JOptionPane.showMessageDialog(null, "Element Removed");
		            
		        }
			}
		});
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton_2.setBounds(80, 404, 179, 58);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Display");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder arrayText = new StringBuilder();
		        for (Object item : queue) {
		            arrayText.append(item).append(" "); // Add a space between elements
		        }
		        textField_2.setText(arrayText.toString().trim());
			}
		});
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton_3.setBounds(646, 404, 179, 58);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Back");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h = new Home();
				h.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setForeground(Color.BLUE);
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton_4.setBounds(382, 509, 202, 58);
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
