package twe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame_Inner extends JFrame{
    
    private JButton button;
    private JLabel label;
    
    // 버튼, 라벨을 맴버변수로 선언하는 이유!
    // 생성자, actionPerfomed() 메소드에서 사용하기 때문 

    // 생성자 선언 
    public MyFrame_Inner() {

        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("2. 내부클래스 활용 예제");

        JPanel panel = new JPanel();
        button = new JButton("버튼을 누르시오!");
        label = new JLabel("머뭇거릴 틈이 없다!");

        // 버튼 이벤트 -> 버튼에 리스너 등록 
        button.addActionListener(new MyListener());

        panel.add(button);
        panel.add(label);

        this.add(panel); // 프레잉에 패널을 올림 
        this.setVisible(true);
    }
    
    // 클래스 안에 새로운 클래스 선언
    // 내부 클래스 활용
    private class MyListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == button) { // e에게 받은 소스가 button이면 
            label.setText("마침내 버튼이 눌렸다앗!!");
            }
        }
    }
}