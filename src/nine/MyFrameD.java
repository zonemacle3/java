package nine;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

// 화면 설계 클래스
public class MyFrameD extends JFrame/*implements ActionListener*/{
 private JButton b;
 private JLabel l;

 // 생성자 생성
 public MyFrameD(){

    this.setSize(300,200);
    this.setTitle("이벤트 예제");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();
    b = new JButton("버튼을 누르시오");
    l = new JLabel("아직 버튼이 눌러지지 않았습니다.");
    // 버튼 리스너를 등록 
    b.addActionListener(new MyListenerD()); // 독립객체를 생성 
    
    p.add(b); // 패널에 b버튼 추가 
    p.add(l); // 패널에 l라벨 추가 

    this.add(p); // 프레임에 패널 추가 
    this.setVisible(true); // on
 }
}
