import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class TouristMenu extends JFrame {
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TouristMenu frame = new TouristMenu();
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
	public TouristMenu() {
		setTitle("TouristMenu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("View Hotels");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(29, 23, 175, 23);
		contentPane.add(lblNewLabel);
		
		List<String> stringListclg = new ArrayList<String>();
		try {
		      File myObj = new File("places.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        if(data.equals("Hotel"))
		        {
		        	stringListclg.add(myReader.nextLine());
		        	String d = myReader.nextLine();
		        	String e = myReader.nextLine();
		        	String f = myReader.nextLine();
		        }
		        
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		String[] stringArrclg = stringListclg.toArray( new String[] {} );
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(stringArrclg));
		comboBox.setBounds(29, 66, 536, 21);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("View Hotels");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String place, name;
				name = comboBox.getSelectedItem().toString();
				place = "Hotel";
				DisplayPlaces dp = new DisplayPlaces(place,name);
				dp.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(29, 110, 123, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("View Attractions");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(29, 178, 175, 23);
		contentPane.add(lblNewLabel_1);
		
		
		
		
		List<String> stringListlib = new ArrayList<String>();
		try {
		      File myObj = new File("places.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        if(data.equals("Tourist Attraction"))
		        {
		        	stringListlib.add(myReader.nextLine());
		        	String d = myReader.nextLine();
		        	String e = myReader.nextLine();
		        	String f = myReader.nextLine();
		        }
		        
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		String[] stringArrlib = stringListlib.toArray( new String[] {} );
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(stringArrlib));
		comboBox_1.setBounds(29, 225, 536, 21);
		contentPane.add(comboBox_1);
		
		
		JButton btnNewButton_1 = new JButton("View Attractions");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String place, name;
				name = comboBox_1.getSelectedItem().toString();
				place = "Tourist Attraction";
				DisplayPlaces dp = new DisplayPlaces(place,name);
				dp.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(28, 269, 124, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Close");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_2.setBounds(177, 269, 99, 21);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("E:\\5 th sem\\java\\SmartCity\\JavaImages\\unnamed.jpg"));
		lblNewLabel_2.setBounds(0, 0, 634, 377);
		contentPane.add(lblNewLabel_2);
	}
}
