package eight;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*; // FlowLayout

public class MyFrame extends JFrame{
    public MyFrame(){ // 생성자를 통해 객체를 실행했을때 이렇게 실행되도록 

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("Zone Macle");

        setLayout(new FlowLayout());
        JButton button = new JButton("버튼");
        this.add(button); // 객체를 추가하고 실행할거면 add 

        setVisible(true);
    }
}