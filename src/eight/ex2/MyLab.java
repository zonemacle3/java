package eight.ex2;

import java.awt.*;
import javax.swing.*;

public class MyLab {
    public static void main(String[] args) {

        JFrame f = new JFrame();

        f.setSize(400, 250);
        f.setTitle("온도변환기");
        f.setVisible(true);
        // 프레임 생성 

        // 패널 생성 
        JPanel Panel = new JPanel();

        f.add(Panel); // 프레임객체가 패널을 삽입

        JLabel label1 = new JLabel("화씨 온도"); 
        Panel.add(label1);

        JTextField field1 = new JTextField(15); // 텍스트의 개수 
        Panel.add(field1);

        JLabel label2 = new JLabel("섭씨 온도");
        Panel.add(label2); 

        JTextField field2 = new JTextField(15); // 텍스트의 개수 
        Panel.add(field2);

        JButton button = new JButton("변환");
        Panel.add(button);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}