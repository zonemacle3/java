package eight;

import javax.swing.*;

public class FrameTest {
public static void main(String[] args) {
    // 컨테이너 생성 (JFrame 객체 생성)
    JFrame j = new JFrame();
    j.setSize(300,200); // frame의 크기 
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // frame 안에 있는 모든걸 
    j.setVisible(true); // 컨테이너 만든걸 화면에 보여줄건지 선택하는것 
}
    
}