package level2;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class JFrameUpdate extends JFrame implements ActionListener {

	JButton btnSubmit;
	JButton btnClose;
	JTextField txtStudentID;
	JTextField txtGPA;
	
	int lblWidthMin = 180;
	int lblHeight = 25;
	
	JFrameUpdate(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Update Student GPA");
		this.setSize(620,500);
		centerFrameOnDesktop(this);
		//this.setResizable(false);
		this.setLayout(new BorderLayout());
		this.setVisible(true);	
		//Border border = BorderFactory.createLineBorder(Color.green, 3);		
						
		JLabel lblStudentID = new JLabel();
		lblStudentID.setText("Enter Student ID(xxx-xxx)");		
		lblStudentID.setPreferredSize(new Dimension(lblWidthMin, lblHeight));	
		
		JLabel lblGPA = new JLabel();
		lblGPA.setText("Enter New GPA");
		lblGPA.setPreferredSize(new Dimension(lblWidthMin, lblHeight));

		
		txtStudentID = new JTextField();
		txtStudentID.setPreferredSize(new Dimension(lblWidthMin, lblHeight));
		
		txtGPA = new JTextField();
		txtGPA.setPreferredSize(new Dimension(lblWidthMin, lblHeight));
		
		
		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(evt -> {				
			    //update student GPA to database
		        dbconnection dbconnect = new dbconnection();
		        dbconnect.Connect();
		       
		        dbconnect.DoUpdate("Update StudentInfo Set GPA=" + txtGPA.getText() + " where StudentID ='" + txtStudentID.getText() + "'");
		        
				//System.out.println("Student ID " + txtStudentID.getText() + " is successfully updated.");
				dbconnect.Close();  //close database connection
		});	
		
		btnClose = new JButton("Close");
		btnClose.addActionListener(evt -> {
			this.dispose();
		});
		
		JPanel northPanel = new JPanel();
		northPanel.setPreferredSize(new Dimension(500, 90));
		northPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,0));
		
		JPanel centerPanel = new JPanel();
		centerPanel.setPreferredSize(new Dimension(300, 50));
		centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,0));
		centerPanel.setBorder(BorderFactory.createLineBorder(Color.yellow, 0));
		
		JPanel westPanel = new JPanel();
		westPanel.setPreferredSize(new Dimension(100, 50));
		westPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,0));
		westPanel.setBorder(BorderFactory.createLineBorder(Color.red, 0));
		
		JPanel eastPanel = new JPanel();
		eastPanel.setPreferredSize(new Dimension(100, 50));
		eastPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,0));
		eastPanel.setBorder(BorderFactory.createLineBorder(Color.red, 0));
		
		JPanel southPanel = new JPanel();
		southPanel.setPreferredSize(new Dimension(100, 80));
		southPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,20));
		southPanel.setBorder(BorderFactory.createLineBorder(Color.red, 0));
		
		northPanel.add(lblStudentID);
		northPanel.add(lblGPA);
			
		northPanel.add(txtStudentID);
		northPanel.add(txtGPA);
		
		southPanel.add(btnSubmit);
		southPanel.add(btnClose);
		
		this.add(northPanel,BorderLayout.NORTH);
		this.add(centerPanel,BorderLayout.CENTER);
		this.add(eastPanel, BorderLayout.EAST);
		this.add(westPanel,BorderLayout.WEST);
		this.add(southPanel,BorderLayout.SOUTH);		
		//
		this.pack();
		
	}

	
	public static void centerFrameOnDesktop(Component f) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		int xpos = (width - frameWidth) / 2;
		int ypos = (height - frameHeight) / 3;
		f.setLocation(xpos, ypos);
	}

	public static void main(String[] args) {
		
		JFrameUpdate form1 = new JFrameUpdate();
		
	}
	public void setVisible(boolean b)
	{
		if (b)
			setLocation(50, 50);
		super.setVisible(b);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//
	}
}
