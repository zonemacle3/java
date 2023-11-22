package nine;

import java.awt.*;
import java.util.concurrent.Flow;

import javax.swing.*;

public class MyFrameF extends JFrame{
    // 생성자 선언
   public MyFrameF(){
    setTitle("FlowLayout Test");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // 패널 생성
    JPanel panel = new JPanel(); // 패널생성

    // 배치관리자
    panel.setLayout(new FlowLayout(FlowLayout.CENTER));

    // 버튼 생성 추가 
    panel.add(new JButton("Button0"));
    panel.add(new JButton("Button1"));
    panel.add(new JButton("Button2"));
    panel.add(new JButton("Button3"));
    panel.add(new JButton("Button4"));
    panel.add(new JButton("Button5"));
    panel.add(new JButton("Button6"));
    panel.add(new JButton("Button7"));
    panel.add(new JButton("Button8"));
    panel.add(new JButton("Button9"));
    
    add(panel); // 버튼 추가

    setVisible(true);
   }
}