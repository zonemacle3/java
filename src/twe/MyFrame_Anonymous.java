package twe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame_Anonymous extends JFrame{ // 무명 클래스 
    
 
    private JButton button;
    private JLabel label;
    
    public MyFrame_Anonymous(){

        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("4. 無名클래스");

        JPanel panel = new JPanel();
        button = new JButton("버튼을 누르시오!");
        label = new JLabel("머뭇거릴 틈이 없다!");
        /*
        // 무명 클래스 활용 
        button.addActionListener(new ActionListener() {
            // 무명클래스는 actionListener 인터페이스를 구혀남
            // 무명클래스의 객체도 동시에 생성됨

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button){
                    label.setText("무명클래스의 버튼이 눌렀다앗!!!");
                }
            }
        });
         */
        // 람다식 활용 
        button.addActionListener(e -> {
            label.setText("5. 람다식 엄청좋다앗!!");
        });

        panel.add(button);
        panel.add(label);
        
        this.add(panel);
        this.setVisible(true);
    }
}
