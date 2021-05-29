import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.regex.Pattern;

class UserDetails{
	
	public String name;
	public String password;
	public int age;
	public String username;
	public String usertype;
	
	public UserDetails()
	{
		
	}
	
	public UserDetails(String nm, String pass, String usnm, String ustyp, int ag)
	{
		name = nm;
		password = pass;
		age = ag;
		username = usnm;
		usertype = ustyp;
		try {
		      FileWriter myWriter = new FileWriter("usernames.txt",true);
		      myWriter.write(username+" "+password+" "+usertype+"\n");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
	}
	
}



public class SignUp extends JFrame {
	public ArrayList<UserDetails> users = new ArrayList<UserDetails>();
	public UserDetails u1 = new UserDetails("Ganesh","ganesh","its_not_ganesh","Student",20);
	public UserDetails u2 = new UserDetails("Gaurav","gaurav","gaurav","Tourist",20);
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		users.add(u1);
		users.add(u2);
		setTitle("Sign Up");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(70, 31, 129, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(70, 65, 129, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(70, 98, 129, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Age");
		lblNewLabel_3.setBounds(70, 133, 129, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Type of User");
		lblNewLabel_4.setBounds(70, 166, 129, 13);
		contentPane.add(lblNewLabel_4);
		
		String user_type[]={"Student","Tourist"};
		JComboBox comboBox = new JComboBox(user_type);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Student", "Tourist"}));
		comboBox.setBounds(224, 162, 87, 21);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(224, 28, 151, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(224, 95, 151, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(224, 130, 151, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(224, 62, 151, 19);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Sign up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String usnm,pass,name,ustype,agge;
				int age;
				
				usnm = textField.getText();
				pass = String.valueOf(passwordField.getPassword());
				name = textField_1.getText();
				agge = textField_2.getText();
				
				int flag =0;
				char[] chars = name.toCharArray();
			      StringBuilder sb = new StringBuilder();
			      for(char c : chars){
			         if(Character.isDigit(c)){
			            flag = 1;
			            break;
			         }
			      }
				ustype = comboBox.getSelectedItem().toString();
				
				if(flag==1)
				{
					JOptionPane.showMessageDialog(null, "Name should not contain numbers!!");
				}
				else if(!agge.matches("[0-9]+"))
				{
					JOptionPane.showMessageDialog(null, "Age should be a whole number!!");
				}
				
				else if(usnm.equals("")||pass.equals("")||name.equals("")||textField_2.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Invalid Input!!");
				}
				else
				{
					age = Integer.parseInt(textField_2.getText());
					UserDetails u = new UserDetails(name, pass, usnm, ustype, age);
					users.add(u);
					Login login = new Login();
					login.setVisible(true);
					
					dispose();
				}
				
				
			}
		});
		btnNewButton.setBounds(226, 227, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(321, 227, 76, 21);
		contentPane.add(btnNewButton_1);
	}
}
