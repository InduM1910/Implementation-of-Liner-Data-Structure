import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 472);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Choose Your Data Structure");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(162, 34, 431, 70);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Array");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Array a = new Array();
				a.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(81, 174, 157, 56);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Stack");
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stack s = new Stack();
				s.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setForeground(Color.MAGENTA);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(327, 174, 157, 56);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Queue");
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Queue q = new Queue();
				q.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setForeground(Color.MAGENTA);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_2.setBounds(548, 174, 148, 56);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Array Dequeue");
		btnNewButton_3.setBackground(Color.CYAN);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			Circular_Queue cq = new Circular_Queue();
			cq.setVisible(true);
			dispose();
			}
		});
		btnNewButton_3.setForeground(Color.MAGENTA);
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_3.setBounds(103, 320, 223, 70);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Linked List");
		btnNewButton_4.setBackground(Color.CYAN);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Linked_List ll = new Linked_List();
				ll.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setForeground(Color.MAGENTA);
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_4.setBounds(456, 320, 205, 70);
		contentPane.add(btnNewButton_4);
	}
}
