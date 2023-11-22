package nine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 이벤트 처리 클래스
// 1. ActionListener 클래스를 활용  -> 인터페이스 형태로 
public class MyListenerD implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        JButton b = (JButton) e.getSource();
        b.setText("마침내 버튼이 눌렸습니다."); // 버튼의 텍스트가 바뀜

        JLabel l = (JLabel) e.getSource();
        l.setText("마침내 버튼이 눌렸습니다.");
    }
}
