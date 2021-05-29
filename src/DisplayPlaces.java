import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.TextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class DisplayPlaces extends JFrame {
	

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
					//DisplayPlaces frame = new DisplayPlaces();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DisplayPlaces(String place,String name) {
		setTitle("DisplayPlaces");
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(25, 23, 45, 13);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(118, 20, 191, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Contact Info");
		lblNewLabel_1.setBounds(25, 168, 79, 13);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(118, 165, 191, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setBounds(25, 205, 65, 13);
		contentPane.add(lblNewLabel_2);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(25, 237, 284, 93);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_3 = new JLabel("About");
		lblNewLabel_3.setBounds(25, 51, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setBounds(25, 70, 284, 81);
		contentPane.add(textArea_1);
		
		try {
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
		        	textField.setText(nm);
		        	textField_1.setText(ctc);
		        	textArea.setText(abt);
		        	textArea_1.setText(addr);
		        	
		        }
		        
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setBounds(226, 354, 83, 19);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("E:\\5 th sem\\java\\SmartCity\\JavaImages\\images (3).jpg"));
		lblNewLabel_4.setBounds(0, 0, 419, 437);
		contentPane.add(lblNewLabel_4);
	}
}
