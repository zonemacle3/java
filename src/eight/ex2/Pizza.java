package eight.ex2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Pizza  extends JFrame{
    public static Component button;

    public static void main(String[] args) {

        JFrame f = new JFrame();

        f.setLocation(200, 300);
        f.setSize(600,150);
        f.setTitle("피자");


        // 프레임 생성 
        JPanel panel1, panel2;
        JTextField id;
        JPasswordField password;
        JButton confirm, cancel;

        // 분할 
        JPanel Panel = new JPanel(); // 패널 1번 
        Panel.setLayout(new GridLayout(2,2)); 
    
        // 패널 1번 
        JLabel label1 = new JLabel("피자집에 어서오거라.",JLabel.LEFT); 
        Panel.add(label1);


        // 패널 2번 
        JPanel Panel2 = new JPanel(); // 패널 2번 

        JButton b1 = new JButton("콤보피자");
        JButton b2 = new JButton("포테이토피자");
        JButton b3 = new JButton("불고기피자");

        JLabel label2 = new JLabel("개수");
        JTextField te = new JTextField(15);

        Panel2.add(b1);
        Panel2.add(b2);
        Panel2.add(b3);
        Panel2.add(label2);
        Panel2.add(te);

     

        f.getContentPane().add(Panel, "Center");
        f.getContentPane().add(Panel2, "South");

        f.setVisible(true);
    }
}