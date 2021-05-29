import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(55, 47, 116, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(55, 86, 116, 13);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(181, 44, 139, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(181, 83, 139, 19);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("User Type");
		lblNewLabel_2.setBounds(56, 132, 115, 13);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Student", "Tourist"}));
		comboBox.setBounds(181, 128, 139, 21);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String username, pass,usertype;
				username = textField.getText();
				pass = String.valueOf(passwordField.getPassword());
				usertype = comboBox.getSelectedItem().toString();
				String chk = username+" "+pass+" "+usertype;
				int flag=0;
				try {
				      File myObj = new File("usernames.txt");
				      Scanner myReader = new Scanner(myObj);
				      while (myReader.hasNextLine()) {
				        String data = myReader.nextLine();
				        if(data.equals(chk))
				        {
				        	flag = 1;
				        }
				        
				      }
				      myReader.close();
				    } catch (FileNotFoundException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
				if(flag == 1 && usertype.equals("Student"))
				{
					StudentMenu sm = new StudentMenu();
					sm.setVisible(true);
					dispose();
				}
				
				if(flag == 1 && usertype.equals("Tourist"))
				{
					TouristMenu sm = new TouristMenu();
					sm.setVisible(true);
					dispose();
				}
				
				if(flag==0)
				{
					JOptionPane.showMessageDialog(null, "Invalid Username or password!");
				}
			
				
			}
		});
		btnNewButton.setBounds(181, 187, 68, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				dispose();
			}
		});
		btnNewButton_1.setBounds(259, 187, 68, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\JavaImages\\download.jpg"));
		lblNewLabel_3.setBounds(0, 0, 436, 263);
		contentPane.add(lblNewLabel_3);
	}
}
