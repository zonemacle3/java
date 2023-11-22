package nine;

import java.awt.*;
import javax.swing.*;

public class MyFrameG extends JFrame{
    public MyFrameG(){
    setTitle("GridLayout Test");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setLayout(new GridLayout(0,3)); // GridLayout 생성 

    add(new JButton("Button1"));
    add(new JButton("Button2"));// or west 동일함 
    add(new JButton("Button3")); // or East 
    add(new JButton("B4")); // or north 
    add(new JButton("lONG bUTTON 5")); // or south 

    setVisible(true);

    }
}