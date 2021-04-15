/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author teel6
 */
public class Name extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        int integer = 0 + (int)(Math.random() * ((360 - 0) + 1));
        
        Text name = new Text (250, 175, "Daniel Teel");
        name.setRotate(integer);
        
        Group root = new Group(name);
        Scene scene = new Scene(root, 500, 350, Color.YELLOW);

        primaryStage.setTitle("Name");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
