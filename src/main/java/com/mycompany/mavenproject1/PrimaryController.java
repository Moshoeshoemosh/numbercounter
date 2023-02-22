package com.mycompany.mavenproject1;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML
    private Button increasebtn;
    @FXML
    private Button decreasebtn;
    @FXML
    private Label label;
    @FXML
    private Label counter;

    @FXML
   public void increment(ActionEvent e){
       int num=Integer.parseInt(counter.getText());
       counter.setText(Integer.toString(num+1));
   }
    @FXML
    public void decrement(ActionEvent e){
       int num=Integer.parseInt(counter.getText());
       counter.setText(Integer.toString(num-1));
   }

   
}
