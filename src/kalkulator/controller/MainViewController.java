/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator.controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author triastowo
 */
public class MainViewController implements Initializable {

  @FXML
  private TextField txtFormula;

  @FXML
  private TextField txtResult;

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    // TODO
  }

  @FXML
  public void calculate(ActionEvent event) {
    
    try {
    
      ScriptEngineManager manager = new ScriptEngineManager();
      ScriptEngine engine = manager.getEngineByName("js");
      Object result = engine.eval(txtFormula.getText());
      txtResult.setText(result.toString());
      
    } catch (ScriptException ex) {
      Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
    }
    
  }

}
