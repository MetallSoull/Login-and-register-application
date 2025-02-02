package application;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RegisterApplication implements ActionListener {

    JButton uploadFileButton = new JButton("Upload file");
    private static JButton registerButton;
    RegisterApplication() {

        JFrame newFrame = new JFrame("Registration");
        JPanel newPanel = new JPanel();

        newPanel.setLayout(null);

        newFrame.setSize(450,450);
        newFrame.setLocationRelativeTo(null);
        newFrame.setResizable(false);
        newFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        newFrame.add(newPanel);

        uploadFileButton.setFocusable(false);
        uploadFileButton.setBounds(145,20,125,35);
        uploadFileButton.addActionListener(this);
        newPanel.add(uploadFileButton);

        JLabel uploadFileLabel = new JLabel("Upload profile picture: ");
        uploadFileLabel.setBounds(10,10,150,50);
        newPanel.add(uploadFileLabel);

        JLabel enterFirstName = new JLabel("First name: ");
        enterFirstName.setBounds(10,50,100,50);
        newPanel.add(enterFirstName);

        JTextField firstNameTextField = new JTextField();
        firstNameTextField.setBounds(85,65,100,20);
        newPanel.add(firstNameTextField);

        JLabel enterSecondName = new JLabel("Your nickname: ");
        enterSecondName.setBounds(9,75,100,50);
        newPanel.add(enterSecondName);

        JTextField secondNameTextField = new JTextField();
        secondNameTextField.setBounds(100,90,100,20);
        newPanel.add(secondNameTextField);

        JLabel enterEmail = new JLabel("Email: ");
        enterEmail.setBounds(10,100,100,50);
        newPanel.add(enterEmail);

        JTextField emailTextField = new JTextField();
        emailTextField.setBounds(50,115,175,20);
        emailTextField.setVisible(true);
        newPanel.add(emailTextField);

        JLabel createPassword = new JLabel("Create your password: ");
        createPassword.setBounds(10,125,150,50);
        newPanel.add(createPassword);

        JTextField passwordTextField = new JTextField();
        passwordTextField.setBounds(150,140,200,20);
        newPanel.add(passwordTextField);

        JLabel repeatPassword = new JLabel("Repeat your password: ");
        repeatPassword.setBounds(10, 150, 150, 50);
        newPanel.add(repeatPassword);

        JTextField repeatPasswordTextField = new JTextField();
        repeatPasswordTextField.setBounds(150,165,200,20);
        newPanel.add(repeatPasswordTextField);

        JLabel chooseGender = new JLabel("Gender: ");
        chooseGender.setBounds(10,175,75,50);
        newPanel.add(chooseGender);

        String[] genderChoose = {"Male", "Female"};
        JComboBox comboBox = new JComboBox(genderChoose);
        comboBox.setVisible(true);
        comboBox.setBounds(65,190,100,20);
        newPanel.add(comboBox);

        JLabel enterAddress = new JLabel("Address: ");
        enterAddress.setBounds(10,215,100,20);
        newPanel.add(enterAddress);

        JTextField addressTextField = new JTextField();
        addressTextField.setBounds(70,215,150,20);
        newPanel.add(addressTextField);

        JLabel enterPhoneNumber = new JLabel("Phone: ");
        enterPhoneNumber.setBounds(10,240,100,20);
        newPanel.add(enterPhoneNumber);

        JTextField phoneTextField = new JTextField();
        phoneTextField.setBounds(60,240,150,20);
        newPanel.add(phoneTextField);

        JLabel enterBirthday = new JLabel("Birthday:");
        enterBirthday.setBounds(10,260,100,20);
        newPanel.add(enterBirthday);
        JLabel dayBirthday = new JLabel("Day \n" +
                "↓\n");
        dayBirthday.setBounds(10,280,100,20);
        newPanel.add(dayBirthday);

        SpinnerModel valueNumber = new SpinnerNumberModel(1,1,30,1);
        JSpinner daySpinner = new JSpinner(valueNumber);
        daySpinner.setBounds(10,300,50,20);
        newPanel.add(daySpinner);

        JLabel monthBirthday = new JLabel("Month " +
                "↓");
        monthBirthday.setBounds(80,280,100,20);
        newPanel.add(monthBirthday);

        SpinnerModel secondValueNumber = new SpinnerNumberModel(1,1,12,1);
        JSpinner monthSpinner = new JSpinner(secondValueNumber);
        monthSpinner.setBounds(80, 300,50,20);
        newPanel.add(monthSpinner);

        JLabel yearBirthday = new JLabel("Year" +
                "↓");
        yearBirthday.setBounds(165,280,100,20);
        newPanel.add(yearBirthday);

        SpinnerModel thirdValueModel = new SpinnerNumberModel(2000, 1970,2010,2000);
        JSpinner yearSpinner = new JSpinner(thirdValueModel);
        yearSpinner.setBounds(165,300,50,20);
        newPanel.add(yearSpinner);

        registerButton = new JButton("Register");
        registerButton.addActionListener(this);
        registerButton.setFocusable(false);
        registerButton.setBounds(165,350,100,35);
        newPanel.add(registerButton);

        newFrame.setVisible(true);
    }
    @Override

    public void actionPerformed(ActionEvent e) {
        if(uploadFileButton.equals(e.getSource())) {
            JFileChooser file_upload = new JFileChooser();
            int res = file_upload.showOpenDialog(null);
            if(res==JFileChooser.APPROVE_OPTION) {
                File file_path = new File(file_upload.getSelectedFile().getAbsolutePath());
            }
        }
        if(registerButton.equals(e.getSource())) {
            JOptionPane.showMessageDialog(null, "You have been successfully registered!");
        }
    }
}