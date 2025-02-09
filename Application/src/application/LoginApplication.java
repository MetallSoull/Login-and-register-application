package application;

import javax.swing.JLabel;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPasswordField;

public class LoginApplication implements ActionListener {

    private static JTextField userText;
    private static JPasswordField passwordText;
    private static JFrame loginFrame;
    private static JPanel loginPanel;
    private static JButton submitButton;
    private static JLabel passwordLabel;
    private static JLabel loginLabel;
    private static JLabel successLabel;
    private static JLabel notSuccessLabel;
    private static String userLogin = "lul";
    private static String userPassword = "lul2";

    LoginApplication() {

        JFrame loginFrame = new JFrame();
        JPanel loginPanel = new JPanel();

        loginFrame.setLocationRelativeTo(null);
        loginFrame.setSize(450,200);
        loginFrame.setResizable(false);
        loginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginFrame.setTitle("Login");
        loginFrame.add(loginPanel);

        loginPanel.setLayout(null);

        loginLabel = new JLabel();
        loginLabel.setText("Login: ");
        loginLabel.setBounds(10,20,100,45);
        loginPanel.add(loginLabel);

        userText = new JTextField();
        userText.setBounds(50,33,150,20);
        loginPanel.add(userText);

        passwordLabel = new JLabel();
        passwordLabel.setText("Password : ");
        passwordLabel.setBounds(10,50,100,45);
        loginPanel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(80,63,200,20);
        loginPanel.add(passwordText);

        submitButton = new JButton();
        submitButton.setText("Submit");
        submitButton.setBounds(10,95,100,25);
        submitButton.setVisible(true);
        submitButton.addActionListener(this);
        loginPanel.add(submitButton);

        successLabel = new JLabel("");
        successLabel.setBounds(10,130,125,25);
        loginPanel.add(successLabel);

        notSuccessLabel = new JLabel("");
        notSuccessLabel.setBounds(10,130,200,25);
        loginPanel.add(notSuccessLabel);

        loginFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String getUserText = userText.getText();
        String getPasswordText = passwordText.getText();
        if(getUserText.equals(userLogin) && getPasswordText.equals(userPassword)) {
            successLabel.setText("Success");
        } else {
            successLabel.setText("Not success, try again");
        }
    }
}
