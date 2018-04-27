package com.jswing;
import javax.swing.*; 

/**
 *
 * @author whony
 */
public class Index {
    JTextField input_name;
    public Index(){
       System.out.println("Hello World");
       JFrame frame = new JFrame("New Windowns");
       JButton btn = new JButton("Click"); 
       JLabel  title = new JLabel("Don't Click");
       input_name =  new JTextField();
       input_name.setBounds(60,20,150,30);
       JTextField input_pass =  new JTextField();
       input_pass.setBounds(60,55,150,30);
       btn.setBounds(90, 100,80,30);
       //
       Handle_event event = new Handle_event(this);
       btn.addActionListener(event);
    
       frame.add(input_name);
       frame.add(input_pass);
       frame.add(btn);
       frame.setSize(300,300);
       frame.setLayout(null);
       frame.setLocationRelativeTo(null);  
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
       frame.setVisible(true);    
    }
}
