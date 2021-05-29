import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.TextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

class College
{
	String name;
	String about;
	String contactInfo;
	String address;
	
	public College()
	{
		
	}
	
	public College(String nm,String abt, String cinf, String add)
	{
		name = nm;
		about = abt;
		contactInfo = cinf;
		address = add;
	}
	
}

class TouristAttractions
{
	String name;
	String about;
	String contactInfo;
	String address;
	
	public TouristAttractions()
	{
		
	}
	
	public TouristAttractions(String nm,String abt, String cinf, String add)
	{
		name = nm;
		about = abt;
		contactInfo = cinf;
		address = add;
	}
	
}

class Libraries
{
	String name;
	String about;
	String contactInfo;
	String address;
	
	public Libraries()
	{
		
	}
	
	public Libraries(String nm,String abt, String cinf, String add)
	{
		name = nm;
		about = abt;
		contactInfo = cinf;
		address = add;
	}
	
}

class Hotels
{
	String name;
	String about;
	String contactInfo;
	String address;
	
	public Hotels()
	{
		
	}
	
	public Hotels(String nm,String abt, String cinf, String add)
	{
		name = nm;
		about = abt;
		contactInfo = cinf;
		address = add;
	}
	
}

public class AddData extends JFrame {
	
	public ArrayList<Hotels> hotels = new ArrayList<Hotels>();
	public ArrayList<Libraries> libraries = new ArrayList<Libraries>();
	public ArrayList<TouristAttractions> touristAttractions = new ArrayList<TouristAttractions>();
	public ArrayList<College> colleges = new ArrayList<College>();

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					AddData frame = new AddData();
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
	public AddData() {
		setTitle("AddData");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(139, 38, 191, 19);
		contentPane.add(textField);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(46, 41, 45, 13);
		contentPane.add(lblNewLabel);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setBounds(46, 88, 284, 81);
		contentPane.add(textArea_1);
		
		JLabel lblNewLabel_3 = new JLabel("About");
		lblNewLabel_3.setBounds(46, 69, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(139, 183, 191, 19);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("Contact Info");
		lblNewLabel_1.setBounds(46, 186, 79, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setBounds(46, 223, 65, 13);
		contentPane.add(lblNewLabel_2);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(46, 255, 284, 93);
		contentPane.add(textArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"College", "Tourist Attraction", "Library", "Hotel"}));
		comboBox.setBounds(46, 7, 136, 21);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Add Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String place;
				String name, about, contact,address;
				about = textArea_1.getText();
				contact = textField_1.getText();
				
				name = textField.getText();
				address = textArea.getText();
			    place = comboBox.getSelectedItem().toString();
			    if(address.length()>50)
			    {
			    	JOptionPane.showMessageDialog(null, "Address should not exceed 50 characters!");
			    }
			    else if(about.equals("")||contact.equals("")||name.equals("")||address.equals("")||contact.length()!=10)
			    {
			    	JOptionPane.showMessageDialog(null, "Invalid Input!");
			    }
			    else
			    {
			    	try {
					      FileWriter myWriter = new FileWriter("places.txt",true);
					      myWriter.write(place+"\n"+name+"\n"+about+"\n"+contact+"\n"+address+"\n");
					      myWriter.close();
					      System.out.println("Successfully wrote to the file.");
					    } catch (IOException e) {
					      System.out.println("An error occurred.");
					      e.printStackTrace();
					    }
				    
				    if(place.equals("College"))
				    {
				    	College coll = new College(name,about,contact,address);
				    	colleges.add(coll);
				    	JOptionPane.showMessageDialog(null, "College Added!");
				    }
				    if(place.equals("Tourist Attraction"))
				    {
				    	TouristAttractions coll = new TouristAttractions(name,about,contact,address);
				    	touristAttractions.add(coll);
				    	JOptionPane.showMessageDialog(null, "Tourist Attraction Added!");
				    }
				    if(place.equals("Library"))
				    {
				    	Libraries coll = new Libraries(name,about,contact,address);
				    	libraries.add(coll);
				    	JOptionPane.showMessageDialog(null, "Library Added!");
				    }
				    if(place.equals("Hotel"))
				    {
				    	Hotels coll = new Hotels(name,about,contact,address);
				    	hotels.add(coll);
				    	JOptionPane.showMessageDialog(null, "Hotel Added!");
				    }
			    }
			    
			    
			    
			}
		});
		btnNewButton.setBounds(46, 381, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(146, 381, 79, 19);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("images (3).jpg"));
		lblNewLabel_4.setBounds(0, 0, 456, 459);
		contentPane.add(lblNewLabel_4);
		
		
		
		
	}
}
