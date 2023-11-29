package twe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.*;
import javax.swing.*;

public class RSP extends JFrame implements ActionListener{

    static final int Rock = 0;
    static final int Paper = 1;
    static final int Scissor = 2;

    private JPanel panel;
    private JButton rock;
    private JButton paper;
    private JButton scissor;
    private JTextField output;
    private JTextField input;

    public RSP(){
        setTitle("가위,바위,보");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel(); 
        panel.setLayout(new GridLayout(0,3));

        input = new JTextField("하나를 선택하시오 ");
        output = new JTextField(20);

        rock = new JButton("ROCK");
        paper = new JButton("paper");
        scissor = new JButton("Scissor");

        rock.addActionListener(this);
        paper.addActionListener(this);
        scissor.addActionListener(this);
        
        panel.add(rock);
        panel.add(paper);
        panel.add(scissor);

        add(input, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        // add(rock, BorderLayout.EAST);
        add(output, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Random random = new Random();
        int computer = random.nextInt(3);
        
        if(e.getSource()== rock){
            if(computer == Scissor)
            output.setText("사용자 승리");
        else if (computer == Paper) 
            output.setText("cpu 승리");
        else 
            output.setText("비겼습니다");
        }
        else if (e.getSource() == paper){
            if(computer == Rock)
                output.setText("사용자 승리");
        else if (computer == Scissor)
                output.setText("cpu 승리");
        else 
            output.setText("무승부");
        }
        else if (e.getSource() == scissor){
            if(computer == Rock)
                output.setText("cpu 승리");
        else if (computer == Paper)
                output.setText("사용자 승리");
        else 
            output.setText("무승부");
        }
    }
}