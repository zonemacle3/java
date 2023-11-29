package twe;

import java.awt.event.*;

import javax.swing.*;

// 3.메인클래스가 직접 이벤트 처리 
public class MyFrame extends JFrame implements ActionListener{

    private JButton button;
    private JLabel label;
    
    // 버튼, 라벨을 맴버변수로 선언하는 이유!
    // 생성자, actionPerfomed() 메소드에서 사용하기 때문 

    // 생성자 선언 
    public MyFrame(){

        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("3. 메인클래스에서 이벤트 처리");

        JPanel panel = new JPanel();
        button = new JButton("버튼을 누르시오!");
        label = new JLabel("머뭇거릴 틈이 없다!");

        button.addActionListener(this); // 객체이벤트 등록(클래스에서 바로 처리)

        panel.add(button);
        panel.add(label);
        
        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == button){
            label.setText("MyFrame 클래스 버튼이 눌럿다앗!!");
        }
    }   
}