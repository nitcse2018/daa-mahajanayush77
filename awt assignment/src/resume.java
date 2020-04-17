

	import java.awt.*;
	import java.awt.event.*;
	import java.io.FileWriter;
	import java.io.IOException;
	import javax.swing.JFrame;

	public class resume{
	  
	     
	     private Frame frame;
	     private TextField fname;
	     private TextField lname;
	     private TextField email;
	     private TextField dob;
	     private TextField contact;
	     private TextField address;
	     private TextField qualifications;
	     private TextField skills;
	     private TextField experience;

	     public resume(){
	          frame = new Frame("Resume Builder");
	          frame.setSize(900, 900);
			frame.setLayout(new GridLayout(11, 11));
			frame.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent windowEvent){
					System.exit(0);
				}
	          });
	     


	    Label fnameLabel = new Label("First Name: ",Label.CENTER);
	    fnameLabel.setForeground(Color.BLACK);
	    
	    Label lnameLabel = new Label("Last Name: ",Label.CENTER);
	    lnameLabel.setForeground(Color.BLACK);
	    
	    Label emailLabel = new Label("Email: ",Label.CENTER);
	    emailLabel.setForeground(Color.BLACK);
	    
	    Label dobLabel = new Label("Date Of Birth: ",Label.CENTER);
	    dobLabel.setForeground(Color.BLACK);
	    
	    Label contactLabel = new Label("Contact Number: ",Label.CENTER);
	    contactLabel.setForeground(Color.BLACK);
	    
	    Label addressLabel = new Label("Address: ",Label.CENTER);
	    addressLabel.setForeground(Color.BLACK);
	    
	    Label qualificationLabel = new Label("Qualifications: ",Label.CENTER);
	    qualificationLabel.setForeground(Color.BLACK);
	    
	    Label skillsLabel = new Label("Skills: ",Label.CENTER);
	    skillsLabel.setForeground(Color.BLACK);
	    
	    Label experienceLabel = new Label("Experience: ",Label.CENTER);
	    experienceLabel.setForeground(Color.BLACK);
	    
	    

	    fname = new TextField(45);
	    lname = new TextField(45);
	    email = new TextField(45);
	    dob = new TextField(45);
	    contact = new TextField(45);
	    address = new TextField(45);
	    qualifications = new TextField(45);
	    skills = new TextField(45);
	    experience = new TextField(45);
	    
	    

	    Button resetButton = new Button("Reset");
	    Button submitButton = new Button("Submit");
	    
	    resetButton.setBackground(Color.blue);
	    submitButton.setBackground(Color.blue);
	    
	    resetButton.setForeground(Color.black);
	    submitButton.setForeground(Color.black);

	    frame.add(fnameLabel);
	    frame.add(fname);

	    frame.add(lnameLabel);
	    frame.add(lname);
	 
	    frame.add(emailLabel);
	    frame.add(email);

	    frame.add(dobLabel);
	    frame.add(dob);

	    frame.add(contactLabel);
	    frame.add(contact);

	    frame.add(addressLabel);
	    frame.add(address);

	    frame.add(qualificationLabel);
	    frame.add(qualifications);

	    frame.add(skillsLabel);
	    frame.add(skills);

	    frame.add(experienceLabel);
	    frame.add(experience);
	    
	    frame.add(submitButton);
	    frame.add(resetButton);
	    

	         resetButton.setActionCommand("Reset");
		    submitButton.setActionCommand("Submit");
		    resetButton.addActionListener(new ButtonClickListener()); 
		    submitButton.addActionListener(new ButtonClickListener()); 
		      
			frame.setVisible(true);




	} 

	public class ButtonClickListener implements ActionListener{
	     
	     public void actionPerformed(ActionEvent e){
	          String command = e.getActionCommand();
	          System.out.print(command);
	          System.out.print(fname.getText());
	          System.out.print(lname.getText());
	          System.out.print(email.getText());
	          System.out.print(dob.getText());
	          System.out.print(contact.getText());
	          System.out.print(address.getText());
	          System.out.print(qualifications.getText());
	          System.out.print(skills.getText());
	          System.out.print(experience.getText());

	          if( command.equals( "Reset" ))  {
	                   fname.setText(""); 
	                   lname.setText("");
		        	 email.setText("");
		        	 contact.setText("");
		        	 skills.setText("");
		        	 qualifications.setText("");
		        	 experience.setText("");
		        	 address.setText("");
		        	 dob.setText("");
		        }
		        else if( command.equals( "Submit" ) )  {
		        	try {
						FileWriter fw = new FileWriter("output.txt", true);
						String s = fname.getText();
						fw.write("FIRST NAME:");
						for(int i=0;i<s.length();i++){
							fw.write(s.charAt(i));
						}
	                         fw.write("\n");
	                         
	                         s = lname.getText();
	                         fw.write("LAST NAME:");
						for(int i=0;i<s.length();i++){
							fw.write(s.charAt(i));
						}
						fw.write("\n");
						
						s = email.getText();
						fw.write("EMAIL:");
						for(int i=0;i<s.length();i++){
							fw.write(s.charAt(i));
						}
	                         fw.write("\n");
	                         
	                         s = dob.getText();
						fw.write("DOB:");
						for(int i=0;i<s.length();i++){
							fw.write(s.charAt(i));
						}
	                         fw.write("\n");

						s = contact.getText();
						fw.write("CONTACT NUMBER:");
						for(int i=0;i<s.length();i++){
							fw.write(s.charAt(i));
						}
	                         fw.write("\n");
	                         
						s = address.getText();
						fw.write("ADDRESS:");
						for(int i=0;i<s.length();i++){
							fw.write(s.charAt(i));
						}
						fw.write("\n");
						s = qualifications.getText();
						fw.write("QUALIFICATIONS:");
						for(int i=0;i<s.length();i++){
							fw.write(s.charAt(i));
						}
						fw.write("\n");
						s = skills.getText();
						fw.write("SKILLS:");
						for(int i=0;i<s.length();i++){
							fw.write(s.charAt(i));
						}
						fw.write("\n");
						s = experience.getText();
						fw.write("EXPERIENCE:");
						for(int i=0;i<s.length();i++){
							fw.write(s.charAt(i));
						}
					
						fw.write("\n---------------------------------------------------------------\n");
						fw.close();
						System.out.println("SUCCESS");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
		        	
		        } 	
		    }		
		}
		public static void main(String[] args){
			resume resume = new resume();
		}
	
	     


}

