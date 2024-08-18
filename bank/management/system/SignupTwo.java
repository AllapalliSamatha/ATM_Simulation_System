

package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
   
    JTextField pan,aadhar;
    JRadioButton syes,sno,eyes,eno;
    JButton nextButton;
    JComboBox religion,category,occupation,education,income;
String formno;

    SignupTwo(String formno) {
        this.formno=formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION PAGE 2");
        

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel nameLabel = new JLabel("Religion:");
        nameLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        nameLabel.setBounds(100, 140, 100, 30);
        add(nameLabel);

        String valReligion[] ={"Hindu","Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        add(religion);
        
        
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        String valcategory[] ={"General","OBC","SC","ST","Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel dobLabel = new JLabel("Income:");
        dobLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        dobLabel.setBounds(100, 240, 200, 30);
        add(dobLabel);
        
        String incomecategory[] ={"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
        income= new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        
        JLabel genderLabel = new JLabel("Educational:");
        genderLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        genderLabel.setBounds(100, 290, 200, 30);
        add(genderLabel);
        

        JLabel emailLabel = new JLabel("Qualification:");
        emailLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        emailLabel.setBounds(100, 315, 200, 30);
        add(emailLabel);
        
        String educationValues[] ={"Under Graduation","Graduate","Post Graduation","Doctrate","Others"};
        education= new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
         

       

        JLabel maritalLabel = new JLabel("Occupation:");
        maritalLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        maritalLabel.setBounds(100, 390, 200, 30);
        add(maritalLabel);

        
         String occupationValues[] ={"Salaried","Self Employed","Business","Student","Retired","Others"};
         occupation= new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        

       

        JLabel addressLabel = new JLabel("PAN Number:");
        addressLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        addressLabel.setBounds(100, 440, 200, 30);
        add(addressLabel);

        pan= new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);

        JLabel cityLabel = new JLabel("Aadhar Number:");
        cityLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        cityLabel.setBounds(100, 490, 200, 30);
        add(cityLabel);

        aadhar= new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);

        JLabel stateLabel = new JLabel("Senior Citizen:");
        stateLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        stateLabel.setBounds(100, 540, 200, 30);
        add(stateLabel);
        
        syes= new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(420, 540, 120, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
         ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(syes);
        maritalGroup.add(sno);
        
        
        
        
        
        
        
        
        

        
        JLabel pinLabel = new JLabel("Existing Account:");
        pinLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        pinLabel.setBounds(100, 590, 200, 30);
        add(pinLabel);
        
        
        
         eyes= new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(420, 590, 120, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup emaritalGroup = new ButtonGroup();
        emaritalGroup.add(eyes);
        emaritalGroup.add(eno);

        
        nextButton = new JButton("Next");
        nextButton.setBackground(Color.BLACK);
        nextButton.setForeground(Color.WHITE);
        nextButton.setFont(new Font("Raleway", Font.BOLD, 14));
        nextButton.setBounds(620, 660, 80, 30);
        nextButton.addActionListener(this);
        add(nextButton);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        //if (ae.getSource() == nextButton) {
           String formno = ""; // Initialize as needed
           String sreligion = (String)religion.getSelectedItem();
           String scategory = (String)category.getSelectedItem();
           String sincome=(String)income.getSelectedItem();
           String seducation=(String)education.getSelectedItem();
           String soccupation=(String) occupation.getSelectedItem();
           String seniorcitizen=null;
           if(syes.isSelected()){
                seniorcitizen="Yes";
            }else if(sno.isSelected()){
                seniorcitizen="No";
}
            String existingaccount="null";
             if(eyes.isSelected()){
             existingaccount="Yes";
}             else if(eno.isSelected())
{
               existingaccount="No";
}
            String span=pan.getText();
            String saadhar=aadhar.getText();
            //  PAN and Aadhar validation  numbers
            if (!isValidPan(span)) {
                JOptionPane.showMessageDialog(this, "Invalid PAN Number! Please enter a valid PAN.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!isValidAadhar(saadhar)) {
                JOptionPane.showMessageDialog(this, "Invalid Aadhar Number! Please enter a valid Aadhar number (12 digits).", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            
            try {
                    Conn c=new Conn();
                     String query = "INSERT INTO signuptwo VALUES ('" + formno + "', '" + sreligion + "', '" + scategory + "','" + sincome + "', '" + seducation+ "','" + soccupation + "','" + span + "', '" +saadhar + "', '" + seniorcitizen+ "', '" + existingaccount+ "')";
                    c.s.executeUpdate(query);
                    
                   setVisible(false);
              new SignupThree(formno).setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
     private boolean isValidPan(String pan) {
       
        return pan.matches("[A-Z|a-z]{5}[0-9]{4}[A-Z|a-z]{1}");  // PAN Number validation
    }

    private boolean isValidAadhar(String aadhar) {
        // Aadhar format regex: Should be exactly 12 digits
        return aadhar.matches("[0-9]{12}");
    }

    public static void main(String[] args) {
        new SignupTwo("");
    }       
}

