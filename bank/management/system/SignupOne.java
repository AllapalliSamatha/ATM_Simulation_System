package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.util.regex.Pattern;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {
    
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinTextField;
    JRadioButton male, female, married, unmarried, other;
    JDateChooser dateChooser;
    JButton nextButton;

    SignupOne() {
        setLayout(null);

        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 30));
        formno.setBounds(100, 20, 700, 40);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        nameLabel.setBounds(100, 140, 100, 30);
        add(nameLabel);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        JLabel fnameLabel = new JLabel("Father's Name:");
        fnameLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        fnameLabel.setBounds(100, 190, 200, 30);
        add(fnameLabel);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);

        JLabel dobLabel = new JLabel("Date Of Birth:");
        dobLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        dobLabel.setBounds(100, 240, 200, 30);
        add(dobLabel);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        genderLabel.setBounds(100, 290, 200, 30);
        add(genderLabel);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 80, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(400, 290, 100, 30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel emailLabel = new JLabel("Email Address:");
        emailLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        emailLabel.setBounds(100, 340, 200, 30);
        add(emailLabel);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);

        JLabel maritalLabel = new JLabel("Marital Status:");
        maritalLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        maritalLabel.setBounds(100, 390, 200, 30);
        add(maritalLabel);

        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(420, 390, 120, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(550, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        addressLabel.setBounds(100, 440, 200, 30);
        add(addressLabel);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);

        JLabel cityLabel = new JLabel("City:");
        cityLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        cityLabel.setBounds(100, 490, 200, 30);
        add(cityLabel);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);

        JLabel stateLabel = new JLabel("State:");
        stateLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        stateLabel.setBounds(100, 540, 200, 30);
        add(stateLabel);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);

        JLabel pinLabel = new JLabel("Pin Code:");
        pinLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        pinLabel.setBounds(100, 590, 200, 30);
        add(pinLabel);

        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinTextField.setBounds(300, 590, 400, 30);
        add(pinTextField);

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
        if (ae.getSource() == nextButton) {
            String formno = ""; // Initialize as needed
            String name = nameTextField.getText();
            String fname = fnameTextField.getText();
            String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
            String gender = male.isSelected() ? "Male" : (female.isSelected() ? "Female" : "");
            String email = emailTextField.getText();
            String marital = married.isSelected() ? "Married" : (unmarried.isSelected() ? "Unmarried" : (other.isSelected() ? "Other" : ""));
            String address = addressTextField.getText();
            String city = cityTextField.getText();
            String state = stateTextField.getText();
            String pin = pinTextField.getText();
             if (name.isEmpty() || fname.isEmpty() || dob.isEmpty() || gender.isEmpty() || email.isEmpty() || marital.isEmpty() || address.isEmpty() || city.isEmpty() || state.isEmpty() || pin.isEmpty()) {
                JOptionPane.showMessageDialog(null, "All fields are required");
            } else if (!isValidName(name)) {
                JOptionPane.showMessageDialog(null, "Invalid name. Only alphabetic characters and spaces are allowed.");
            } else if (!isValidName(fname)) {
                JOptionPane.showMessageDialog(null, "Invalid father's name. Only alphabetic characters and spaces are allowed.");
            } else if (!isValidAddress(address)) {
                JOptionPane.showMessageDialog(null, "Invalid address. It should be at least 5 characters long and can contain letters, numbers, spaces, and common punctuation.");
            } else if (!isValidCityOrState(city)) {
                JOptionPane.showMessageDialog(null, "Invalid city. Only alphabetic characters and spaces are allowed.");
            } else if (!isValidCityOrState(state)) {
                JOptionPane.showMessageDialog(null, "Invalid state. Only alphabetic characters and spaces are allowed.");
            } else if (!isValidEmail(email)) {
                JOptionPane.showMessageDialog(null, "Invalid email format.");
            } else if (!isValidPin(pin)) {
                JOptionPane.showMessageDialog(null, "Invalid pin code. It should be a 6-digit number.");
            } else{

            try {
                if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Name is required");
                } else {
                    Conn c=new Conn();
                     String query = "INSERT INTO signup VALUES ('" + formno + "', '" + name + "', '" + fname + "','" + dob + "', '" + gender+ "','" + email + "','" + marital + "', '" + address + "', '" + city + "', '" + pin + "', '" + state + "')";
                    c.s.executeUpdate(query);
                    setVisible(false);
                    new SignupTwo(formno).setVisible(true);
                }
            } catch (Exception e) {
                System.out.println("Exception occurred: " + e);
            }
        }
    }
}
private boolean isValidName(String name) {
        return name.matches("[a-zA-Z ]+");
    }

    private boolean isValidAddress(String address) {
        return address.length() >= 5 && address.matches("[a-zA-Z0-9 ,.-]+");
    }

    private boolean isValidCityOrState(String input) {
        return input.matches("[a-zA-Z ]+");
    }

    private boolean isValidPin(String pin) {
        return pin.matches("\\d{6}");
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
    public static void main(String[] args) {
        new SignupOne();
    }       
}
