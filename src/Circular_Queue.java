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
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.awt.event.ActionEvent;

public class Circular_Queue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Circular_Queue frame = new Circular_Queue();
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
	 ArrayDeque deque;

	public Circular_Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 993, 721);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To Array Dequeue");
		lblNewLabel.setForeground(new Color(85, 107, 47));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setBounds(247, 26, 504, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Click Here to create Array Deque :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1.setBounds(35, 109, 511, 45);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deque = new ArrayDeque<>(); // Initialization of the LinkedList
				JOptionPane.showMessageDialog(null, "Array Deque is Created");
			}
		});
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton.setBounds(565, 113, 186, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Element :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_2.setBounds(35, 198, 153, 45);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(202, 205, 196, 36);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JButton btnNewButton_1 = new JButton("Add First");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Object value = parseElement(textField_1.getText());
	                deque.addFirst(value);
	                JOptionPane.showMessageDialog(null, "Element Inserted at First");
	                textField_1.setText("");
			}
		});
		btnNewButton_1.setForeground(Color.MAGENTA);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton_1.setBounds(440, 198, 210, 45);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Elements are:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_3.setBounds(17, 411, 276, 57);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(235, 418, 682, 48);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JButton btnNewButton_3 = new JButton("Display");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder arrayText = new StringBuilder();
		        for (Object item : deque) {
		            arrayText.append(item).append(" "); // Add a space between elements
		        }
		        textField_2.setText(arrayText.toString().trim());
			}
		});
		btnNewButton_3.setForeground(Color.MAGENTA);
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton_3.setBounds(731, 568, 186, 51);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Back");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h = new Home();
				h.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setForeground(Color.MAGENTA);
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton_4.setBounds(45, 565, 188, 57);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Add Last");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                Object value = parseElement(textField_1.getText());
                deque.addLast(value);
                JOptionPane.showMessageDialog(null, "Element Inserted at Last");
                textField_1.setText("");

			}
		});
		btnNewButton_5.setForeground(Color.MAGENTA);
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton_5.setBounds(727, 198, 178, 45);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_4 = new JLabel("Deletion :");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_4.setBounds(35, 305, 153, 57);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_2 = new JButton("Remove First");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (deque.isEmpty()) {
	                    JOptionPane.showMessageDialog(null, "Deque is Empty");
	                } else {
	                    deque.removeFirst();
	                    JOptionPane.showMessageDialog(null, "First Element Removed");
	                }
			}
		});
		btnNewButton_2.setForeground(Color.MAGENTA);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton_2.setBounds(212, 317, 210, 57);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_6 = new JButton("Remove Last");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (deque.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Deque is Empty");
                } else {
                    deque.removeLast();
                    JOptionPane.showMessageDialog(null, "Last Element Removed");
                }
			}
		});
		btnNewButton_6.setForeground(Color.MAGENTA);
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton_6.setBounds(565, 317, 236, 57);
		contentPane.add(btnNewButton_6);
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
