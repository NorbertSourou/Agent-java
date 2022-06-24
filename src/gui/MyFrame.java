package gui;

import agents.AcheteurAgent;
import containers.AcheteurContainer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel userLabel = new JLabel("ACHETEUR");
    JButton loginButton = new JButton("SOUMETTRE");
    JLabel passwordLabel = new JLabel("VENDEUR");
    JTextField userTextField = new JTextField();
    JTextField passwordField = new JTextField();
    JButton resetButton = new JButton("SOUMETTRE");
    JCheckBox showPassword = new JCheckBox("Show Password");
    private AcheteurAgent acheteurAgent;

    public AcheteurAgent getAcheteurAgent() {
        return acheteurAgent;
    }

    public void setAcheteurAgent(AcheteurAgent acheteurAgent) {
        this.acheteurAgent = acheteurAgent;
    }

    public MyFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(150, 150, 250, 30);
        passwordField.setBounds(150, 220, 250, 30);
//        showPassword.setBounds(150, 250, 150, 30);
        loginButton.setBounds(420, 150, 150, 30);
        resetButton.setBounds(420, 220, 150, 30);


    }

    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if (userText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Champ vide");
            } else {
                AcheteurContainer acheteurContainer = new AcheteurContainer(userText);
//                agentController1.start();
//                JOptionPane.showMessageDialog(this, );

//                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
//            }  if (userText.equalsIgnoreCase("mehtab") && pwdText.equalsIgnoreCase("12345")) {
//                JOptionPane.showMessageDialog(this, "Login Successful");
//            } else {
//                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
//            }

            }
            //Coding Part of RESET button
            if (e.getSource() == resetButton) {
                userTextField.setText("");
                passwordField.setText("");
            }
            //Coding Part of showPassword JCheckBox
            if (e.getSource() == showPassword) {
                if (showPassword.isSelected()) {
//                passwordField.setEchoChar((char) 0);
                } else {
//                passwordField.setEchoChar('*');
                }


            }
        }

    }
}

