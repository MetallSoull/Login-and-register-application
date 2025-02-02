package application;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseOperation implements ActionListener {


    JButton loginButton = new JButton();
    JButton registerButton = new JButton();
    ChooseOperation() {
        JFrame newFrame = new JFrame("Application");
        JPanel newPanel = new JPanel();
        newFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        newFrame.setResizable(false);
        newFrame.setSize(450,200);
        newFrame.setLocationRelativeTo(null);
        newFrame.add(newPanel);
        newPanel.setLayout(null);

        loginButton.setText("Login");
        loginButton.setBounds(75,65,100,25);
        loginButton.addActionListener(this);
        loginButton.setFocusable(false);
        newPanel.add(loginButton);

        registerButton.setText("Register");
        registerButton.setBounds(260,65,100,25);
        registerButton.addActionListener(this);
        registerButton.setFocusable(false);
        newPanel.add(registerButton);

        newFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginButton) {
            LoginApplication loginApplication = new LoginApplication();
        } else if(e.getSource()==registerButton) {
            RegisterApplication registerButton = new RegisterApplication();
        }
    }
}