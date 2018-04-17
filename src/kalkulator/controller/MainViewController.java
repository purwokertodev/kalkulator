/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

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
    System.out.println("bubba");
  }

}
