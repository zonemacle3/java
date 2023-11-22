package nine;

import java.awt.*;
import javax.swing.*;

public class MyFlowLayout extends JFrame{
    JPanel p1;
    
    public MyFlowLayout(){

        setSize(300,200);
        setTitle("zone's Kitchen");

        p1 = new JPanel();
        p1.setLayout(new GridLayout(4,3));// or 0,3

        for(int i=0;i<10;i++){
            p1.add(new JButton("Button" + i));
        }
        add(p1);

        setVisible(true);
    }
}