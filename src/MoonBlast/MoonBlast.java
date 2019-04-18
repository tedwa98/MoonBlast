/*
 * File: MoonBlast.java
 * Author: Shawn Smith ssmith84@uab.edu
 * Assignment:  MoonBlast - EE333 Spring 2019
 * Vers: 1.0.0 03/25/2019 SOS - initial coding
 *
 * Credits:  (if any for sections of code)
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uab.tedwa98.ee333;

import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javax.swing.*;
import java.awt.*;
import javafx.geometry.Pos;

/**
 *
 * @author Shawn Smith ssmith84@uab.edu
 */
public class MoonBlast extends Application{
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Shoot!");
        
        String musicFile = "Laser_Shoot2.wav";
        
        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer shoot = new MediaPlayer(sound);
        
        
        
        
        Button shootButton = new Button("Shoot");
        Button qButton = new Button("q");
        qButton.setMaxSize(162, 162);
        Button wButton = new Button("w");
        wButton.setMaxSize(162, 162);
        Button eButton = new Button("e");
        eButton.setMaxSize(162, 162);
        Button aButton = new Button("a");
        aButton.setMaxSize(162, 162);
        Button sButton = new Button("s");
        sButton.setMaxSize(162, 162);
        Button dButton = new Button("d");
        dButton.setMaxSize(162, 162);
        Button zButton = new Button("z");
        zButton.setMaxSize(162, 162);
        Button xButton = new Button("x");
        xButton.setMaxSize(162, 162);
        Button cButton = new Button("c");    
        cButton.setMaxSize(162, 162);   
        
            shootButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    shoot.stop();
                   shoot.play();
                }
            });
   
        
//        StackPane winder = new StackPane();
//        winder.getChildren().add(shootButton);
//        winder.getChildren().add(aButton);
//        winder.getChildren().add(qButton);
//        primaryStage.setScene(new Scene(winder, 480, 640));
//        primaryStage.show();

         StackPane winder = new StackPane(aButton, qButton, wButton, eButton, sButton, dButton, zButton, xButton, cButton);
        Scene scene = new Scene(winder, 480, 480);
        StackPane.setAlignment(aButton, Pos.CENTER_LEFT);
        StackPane.setAlignment(sButton, Pos.CENTER);
        StackPane.setAlignment(qButton, Pos.TOP_LEFT);
        StackPane.setAlignment(wButton, Pos.TOP_CENTER);
        StackPane.setAlignment(eButton, Pos.TOP_RIGHT);
        StackPane.setAlignment(dButton, Pos.CENTER_RIGHT);
        StackPane.setAlignment(zButton, Pos.BOTTOM_LEFT);
        StackPane.setAlignment(xButton, Pos.BOTTOM_CENTER);
        StackPane.setAlignment(cButton, Pos.BOTTOM_RIGHT); 
        
 
        
        primaryStage.setScene(scene);
  
        primaryStage.show();
        
    }
}
