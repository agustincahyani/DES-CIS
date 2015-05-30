import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;


public class SHA512 extends JFrame{
	JFileChooser chooser = new JFileChooser();
	private JTextField textField;
	JTextPane txtpnFileChoosen = new JTextPane();
	JTextPane txtpnHashFile = new JTextPane();
	JTextPane txtpnResult = new JTextPane();
	
	private String directory;
	private String fileIn;
	private String fileHash = "";
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SHA512 frame = new SHA512();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	public SHA512() {
		setTitle("Tugas 2 CIS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		
		JLabel lblDesCipher = new JLabel("SHA512");
		panel_5.add(lblDesCipher);
		lblDesCipher.setVerticalAlignment(SwingConstants.CENTER);
		lblDesCipher.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesCipher.setEnabled(true);
		lblDesCipher.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblInputFile = new JLabel("Input File");
		lblInputFile.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInputFile.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblInputFile);
		
		JButton btnChooseFile = new JButton("Choose File");
		panel_1.add(btnChooseFile);
		btnChooseFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
			    FileNameExtensionFilter filter = new FileNameExtensionFilter(
			        "Text", "txt");
			    chooser.setFileFilter(filter);
			    int returnVal = chooser.showOpenDialog(chooser);
			    if(returnVal == JFileChooser.APPROVE_OPTION) {
			    	directory = chooser.getCurrentDirectory() + "\\";
			       	fileIn = directory + chooser.getSelectedFile().getName();
			       	txtpnFileChoosen.setText("File Choosen: " + fileIn);
			    }
			}
		});
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		txtpnFileChoosen.setEditable(false);
		txtpnFileChoosen.setText("File Choosen:");
		panel_3.add(txtpnFileChoosen);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblHashFiletxt = new JLabel("(Optional) Hash Value: ");
		lblHashFiletxt.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_4.add(lblHashFiletxt);
		
		JButton btnChooseFile_1 = new JButton("Choose File");
		panel_4.add(btnChooseFile_1);
		btnChooseFile_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
			    FileNameExtensionFilter filter = new FileNameExtensionFilter(
			        "Text", "txt");
			    chooser.setFileFilter(filter);
			    int returnVal = chooser.showOpenDialog(chooser);
			    if(returnVal == JFileChooser.APPROVE_OPTION) {
			       	fileHash = chooser.getCurrentDirectory() + "\\" + chooser.getSelectedFile().getName();
			       	txtpnHashFile.setText("Hash Value: " + fileHash);
			    }
			}
		});
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		txtpnHashFile.setEditable(false);
		txtpnHashFile.setText("Hash Value: ");
		panel_6.add(txtpnHashFile);
		
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 7));
		
		JLabel lblYourDesiredResult = new JLabel("Your Desired Result File Name");
		panel_2.add(lblYourDesiredResult);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(30);
		
		JButton btnCompute = new JButton("Compute");
		
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		panel_2.add(btnCompute);
		
		JButton btnAthenticate = new JButton("Athenticate*");
		
		btnAthenticate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(fileHash.isEmpty()){
						throw new NoHashFileException("[WARNING] Hash Value is empty/not found!");
					}
					txtpnResult.setText("Hashing is done");
				} catch (NoHashFileException e) {
					txtpnResult.setText(e.getMessage());
				}
				
			}
		});	
		
		panel_2.add(btnAthenticate);
		
		JTextPane txtpnWarning = new JTextPane();
		txtpnWarning.setEditable(false);
		txtpnWarning.setText("*If you want to Authenticate, Hash Value is mandatory.");
		panel_2.add(txtpnWarning);
		
		JTextPane txtpnTheResultFile = new JTextPane();
		txtpnTheResultFile.setEditable(false);
		txtpnTheResultFile.setText("The result file will be saved in the same directory as the input file.");
		panel_2.add(txtpnTheResultFile);
		
		txtpnResult.setEditable(false);
		txtpnResult.setText("Author: Nefri Suswita & Dhika Ayu Agustin Cahyani");
		panel_2.add(txtpnResult);
		
		
		
		String dir = System.getProperty("user.dir");
		chooser.setCurrentDirectory(new File(dir));
		
		
	}
	
	class NoHashFileException extends Exception
	{
		public NoHashFileException() {}
		public NoHashFileException(String message)
		{
			super(message);
		}
	}
}
