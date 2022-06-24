package ifri;

import containers.AcheteurContainer;
import containers.ConsommateurContainer;
import containers.MainContainer;
import containers.VendeurContainer;
import gui.MyFrame;

import javax.swing.*;

public class SMA {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        MyFrame frame = new MyFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(10, 10, 700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);

//
        MainContainer maincontainer = new MainContainer();
        ConsommateurContainer consommateurContainer = new ConsommateurContainer();
        AcheteurContainer acheteurContainer = new AcheteurContainer();
        VendeurContainer vendeurContainer = new VendeurContainer();


    }

}
