package dataPopulant;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class UserInputGUI {


	//variables within initialize()
	
	String sign = null;
	String horo = null;

	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInputGUI window = new UserInputGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserInputGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblM = new JLabel("Birth Month:");
		lblM.setBounds(6, 27, 86, 16);
		frame.getContentPane().add(lblM);
		
		JComboBox comboBox = new JComboBox();
		
		comboBox.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String p = (String) comboBox.getSelectedItem();
				
				sign = p;
			
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn", "Aquarius", "Pisces"}));
		comboBox.setBounds(120, 23, 268, 27);
		frame.getContentPane().add(comboBox);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setWrapStyleWord(true);
		textArea.setBounds(120, 183, 268, 16);
		frame.getContentPane().add(textArea);
		
		JScrollPane sp = new JScrollPane(textArea);
		sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setSize(369, 65);
		sp.setLocation(55, 161);
		frame.getContentPane().add(sp);
	
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBackground(Color.WHITE);
		btnEnter.setForeground(Color.BLACK);
		btnEnter.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				
				if (comboBox.getSelectedItem() == "" ) {
					System.out.print("we are null");
				}
				
				//when user presses enter, send the sign to the download page
				String addr = DownloadPage.instanceOf().getAddress(sign);
				
			
				try {
					horo = DownloadPage.instanceOf().fromWeb(addr);
					textArea.setText(horo);
				
				
				} catch (IOException e1) {
	
					e1.printStackTrace();
				}
			}
		});
		btnEnter.setBounds(174, 120, 117, 29);
		frame.getContentPane().add(btnEnter);
		
		
	}
	
}
