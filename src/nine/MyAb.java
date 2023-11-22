package nine;

import java.awt.*;
import javax.swing.*;

public class MyAb extends JFrame{
    
    JButton b1;
    private JButton b2, b3;

    public MyAb(){
    
    setTitle("Absolute Position Test");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setSize(500,400);

    JPanel p = new JPanel();
    
    p.setLayout(null); // 배치관리자를 쓰지 않는다. 

    b1 = new JButton("Button1");
    p.add(b1);
    // p.add(new JButton("Button1"));
    b2 = new JButton("Button2");
    p.add(b2);
    b3 = new JButton("Button3");
    p.add(b3);

    b1.setBounds(20,5,95,30); // (x,y,w,h)
    b2.setBounds(55,45,105,70);
    b3.setBounds(180,15,105,90);

    add(p);

    setVisible(true);
    // add(panel);

    }
}
