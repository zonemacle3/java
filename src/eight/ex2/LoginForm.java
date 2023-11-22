package eight.ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame{

 // Frame을 구현하는 JFrame을 상속받음

 
 /*
 - JFrame은 Container클래스의 객체를 만들어서 add()메소드로 element를 추가했다면,
 - JPanel은 JFrame안에 Pane을 추가해서, 그 Pane 안에 element를 add()메소드로 추가하는 방식이다.
 */
 
 JPanel panel1, panel2;
 JTextField id;
 JPasswordField password;
 JButton confirm, cancel;
 
 public LoginForm(){


 

       panel1=new JPanel();  // pane 1을 Frame에 추가.
       panel1.setLayout(new GridLayout(2,2)); 

//2행 2열로 pane의 화면을 분할.

       id=new JTextField(10);
       password=new JPasswordField(10);

 

  panel1.add(new JLabel("아이디", JLabel.LEFT));
  panel1.add(id);
  id.setToolTipText("ID를 입력하세요");
  
  panel1.add(new JLabel("비밀번호",JLabel.LEFT));
  panel1.add(password);
  password.setToolTipText("비밀번호를 입력하세요");
  


// 패널 2번 
  panel2=new JPanel(); // pane 2를 Frame에 추가.
  confirm=new JButton("확인");
  cancel=new JButton("취소");
  
  // this : 클래스 자체를 가리킴
  panel2.add(confirm);
  panel2.add(cancel); 

 



  getContentPane().add(panel1, "Center");
  getContentPane().add(panel2, "South");
  /* JFrame을 상속받았으므로, getContentPane()앞에 JFrame 객체가 생략된 것이다.
   ( ex. JFrame e;

   e.getContentPane() )

   */
  
  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  this.setSize(200,120);
  this.setVisible(true);
  // this : 클래스 자체를 가리킴
  

 }
}

