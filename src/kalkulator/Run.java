/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author triastowo
 */
public class Run extends Application {
  
  @Override
  public void start(Stage primaryStage) {
    try {
      
      Parent parent = FXMLLoader.load(Run.class.getResource("view/MainView.fxml"));
      Scene scene = new Scene(parent);
      primaryStage.setScene(scene);
      primaryStage.setTitle("Aplikasi Kalkulator");
      primaryStage.show();
      
      
    } catch (IOException ex) {
      Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    launch(args);
  }
  
}
