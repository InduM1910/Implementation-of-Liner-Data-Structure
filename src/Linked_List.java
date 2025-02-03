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
import java.util.LinkedList;
import java.awt.event.ActionEvent;

public class Linked_List extends JFrame {

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
					Linked_List frame = new Linked_List();
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
	  LinkedList list ;
	private JTextField textField;
	public Linked_List() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 678);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To Linked List");
		lblNewLabel.setForeground(new Color(255, 51, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setBounds(272, 22, 432, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Click Here to Create Liked List :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1.setBounds(33, 80, 441, 45);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list = new LinkedList<>(); // Initialization of the LinkedList
				JOptionPane.showMessageDialog(null, "Linked List Created");
				
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton.setBounds(610, 90, 168, 45);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Element :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_2.setBounds(33, 155, 156, 45);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(195, 155, 229, 45);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textField_1.getText();
	            if (input.isEmpty()) {
	                JOptionPane.showMessageDialog(null, "Please enter a value.");
	            } else {
	                list.add(input);
	                JOptionPane.showMessageDialog(null, "Element Added");
	                textField_1.setText("");
	            }
				  
			}
		});
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton_1.setBounds(610, 166, 168, 45);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Elements in List :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_3.setBounds(33, 359, 238, 52);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(298, 366, 698, 52);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value = Integer.parseInt(textField.getText());
				if(list.isEmpty()) {
					   JOptionPane.showMessageDialog(null, "List is Empty");
				}
				else {
					list.remove(value);
			       JOptionPane.showMessageDialog(null, "Element Removed");
				}
				 textField_2.setText("");
			}
		});
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton_2.setBounds(621, 259, 168, 52);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Display");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder listText = new StringBuilder();
		        for (Object item : list) {
		            listText.append(item).append(" "); // Add a space between elements
		        }
		        textField_2.setText(listText.toString().trim());
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.setBounds(155, 501, 144, 62);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Back");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h = new Home();
				h.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton_4.setForeground(Color.BLUE);
		btnNewButton_4.setBounds(644, 501, 168, 62);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_4 = new JLabel("Enter Position to Remove :");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_4.setBounds(33, 263, 354, 45);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(385, 273, 162, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setFont(new Font("Arial", Font.PLAIN, 20));
	}
}
