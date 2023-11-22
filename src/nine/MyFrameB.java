package nine;

import java.awt.*;
import javax.swing.*;

public class MyFrameB extends JFrame {
    // 생성자    
    public MyFrameB(){
        setTitle("BorderLayout Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // 프레임 디폴트 -> BorderLayout 프레임을 생성하지 않아도 됨 

        setLayout(new BorderLayout());

        add(new JButton("Center"),BorderLayout.CENTER);
        add(new JButton("Line Start"),BorderLayout.LINE_START);// or west 동일함 
        add(new JButton("Line End"),BorderLayout.LINE_END); // or East 
        add(new JButton("Page Start"),BorderLayout.PAGE_START); // or north 
        add(new JButton("Page End"),BorderLayout.PAGE_END); // or south 
        
        setVisible(true);
    }
}
