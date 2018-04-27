/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jswing;

/**
 *
 * @author whony
 */
import java.awt.event.*;  
public class Handle_event implements ActionListener {
    Index index;
   public Handle_event(Index index){
        this.index = index;
    }
    public void actionPerformed(ActionEvent e){  
        index.input_name.setText("Hello GOO");
    }     
}
