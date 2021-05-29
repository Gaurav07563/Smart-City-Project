import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class DeleteData extends JFrame {
	
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteData frame = new DeleteData();
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
	public DeleteData() {
		setTitle("DeleteData");
		
		List<String> colleges = new ArrayList<String>();
		try {
		      File myObj = new File("places.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        if(data.equals("College"))
		        {
		        	colleges.add(myReader.nextLine());
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
		String[] collegearray = colleges.toArray( new String[] {} );
		
		List<String> library = new ArrayList<String>();
		try {
		      File myObj = new File("places.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        if(data.equals("Library"))
		        {
		        	library.add(myReader.nextLine());
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
		String[] libraryarray = library.toArray( new String[] {} );
		
		List<String> attractions = new ArrayList<String>();
		try {
		      File myObj = new File("places.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        if(data.equals("Tourist Attraction"))
		        {
		        	attractions.add(myReader.nextLine());
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
		String[] attractionarray = attractions.toArray( new String[] {} );
		
		List<String> hotels = new ArrayList<String>();
		try {
		      File myObj = new File("places.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        if(data.equals("Hotel"))
		        {
		        	hotels.add(myReader.nextLine());
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
		String[] hotelarray = hotels.toArray( new String[] {} );
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 427, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("College");
		lblNewLabel.setBounds(24, 22, 65, 13);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(collegearray));
		comboBox.setBounds(24, 45, 356, 21);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					  String name = comboBox.getSelectedItem().toString();
					  String place ="College";
				      File myObj = new File("places.txt");
				      Scanner myReader = new Scanner(myObj);
				      while (myReader.hasNextLine()) {
				        String plc = myReader.nextLine();
				        String nm = myReader.nextLine();
				        String abt = myReader.nextLine();
				        String ctc = myReader.nextLine();
				        String addr = myReader.nextLine();
				        if(plc.equals(place)&&name.equals(nm))
				        {
				        	
				        }
				        else
				        {
				        	try {
				  		      FileWriter myWriter = new FileWriter("places.txt");
				  		      myWriter.write(plc+"\n"+nm+"\n"+abt+"\n"+ctc+"\n"+addr+"\n");
				  		      myWriter.close();
				  		      System.out.println("Successfully wrote to the file.");
				  		    } catch (IOException e) {
				  		      System.out.println("An error occurred.");
				  		      e.printStackTrace();
				  		    }
				        }
				        
				      }
				      myReader.close();
				    } catch (FileNotFoundException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
				
			}
		});
		btnNewButton.setBounds(24, 76, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Library");
		lblNewLabel_1.setBounds(24, 121, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(libraryarray));
		comboBox_1.setBounds(24, 144, 349, 21);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					  String name = comboBox_1.getSelectedItem().toString();
					  String place ="Library";
				      File myObj = new File("places.txt");
				      Scanner myReader = new Scanner(myObj);
				      while (myReader.hasNextLine()) {
				        String plc = myReader.nextLine();
				        String nm = myReader.nextLine();
				        String abt = myReader.nextLine();
				        String ctc = myReader.nextLine();
				        String addr = myReader.nextLine();
				        if(plc.equals(place)&&name.equals(nm))
				        {
				        	
				        }
				        else
				        {
				        	try {
				  		      FileWriter myWriter = new FileWriter("places2.txt");
				  		      myWriter.write(plc+"\n"+nm+"\n"+abt+"\n"+ctc+"\n"+addr+"\n");
				  		      myWriter.close();
				  		      System.out.println("Successfully wrote to the file.");
				  		    } catch (IOException e) {
				  		      System.out.println("An error occurred.");
				  		      e.printStackTrace();
				  		    }
				        }
				        
				      }
				      myReader.close();
				    } catch (FileNotFoundException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
			}
		});
		btnNewButton_1.setBounds(24, 175, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tourist Attractions");
		lblNewLabel_2.setBounds(24, 219, 105, 13);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(attractionarray));
		comboBox_2.setBounds(24, 242, 349, 21);
		contentPane.add(comboBox_2);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					  String name = comboBox_2.getSelectedItem().toString();
					  String place ="Tourist Attraction";
				      File myObj = new File("places.txt");
				      Scanner myReader = new Scanner(myObj);
				      while (myReader.hasNextLine()) {
				        String plc = myReader.nextLine();
				        String nm = myReader.nextLine();
				        String abt = myReader.nextLine();
				        String ctc = myReader.nextLine();
				        String addr = myReader.nextLine();
				        if(plc.equals(place)&&name.equals(nm))
				        {
				        	
				        }
				        else
				        {
				        	try {
				  		      FileWriter myWriter = new FileWriter("places2.txt");
				  		      myWriter.write(plc+"\n"+nm+"\n"+abt+"\n"+ctc+"\n"+addr+"\n");
				  		      myWriter.close();
				  		      System.out.println("Successfully wrote to the file.");
				  		    } catch (IOException e) {
				  		      System.out.println("An error occurred.");
				  		      e.printStackTrace();
				  		    }
				        }
				        
				      }
				      myReader.close();
				    } catch (FileNotFoundException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
			}
		});
		btnNewButton_2.setBounds(24, 273, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hotels");
		lblNewLabel_3.setBounds(24, 317, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(hotelarray));
		comboBox_3.setBounds(24, 340, 349, 21);
		contentPane.add(comboBox_3);
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					  String name = comboBox_3.getSelectedItem().toString();
					  String place ="Hotel";
				      File myObj = new File("places.txt");
				      Scanner myReader = new Scanner(myObj);
				      while (myReader.hasNextLine()) {
				        String plc = myReader.nextLine();
				        String nm = myReader.nextLine();
				        String abt = myReader.nextLine();
				        String ctc = myReader.nextLine();
				        String addr = myReader.nextLine();
				        if(plc.equals(place)&&name.equals(nm))
				        {
				        	
				        }
				        else
				        {
				        	try {
				  		      FileWriter myWriter = new FileWriter("places2.txt");
				  		      myWriter.write(plc+"\n"+nm+"\n"+abt+"\n"+ctc+"\n"+addr+"\n");
				  		      myWriter.close();
				  		      System.out.println("Successfully wrote to the file.");
				  		    } catch (IOException e) {
				  		      System.out.println("An error occurred.");
				  		      e.printStackTrace();
				  		    }
				        }
				        
				      }
				      myReader.close();
				    } catch (FileNotFoundException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
			}
		});
		btnNewButton_3.setBounds(24, 371, 85, 21);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Close");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_4.setBounds(119, 371, 83, 21);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("E:\\5 th sem\\java\\SmartCity\\JavaImages\\images (3).jpg"));
		lblNewLabel_4.setBounds(0, 0, 492, 450);
		contentPane.add(lblNewLabel_4);
	}

}
