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
package MoonBlast;

import java.io.File;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

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
        
        String asteroidPic = "Asteroid.png";
        
        Image asteroid = new Image(new File(asteroidPic).toURI().toString());
        ImageView imageView = new ImageView(asteroid);
        RotateTransition rT = new RotateTransition();
        ScaleTransition sT = new ScaleTransition(Duration.millis(5000));
        
        
        rT.setDuration(Duration.millis(5000));
        rT.setNode(imageView);
        sT.setNode(imageView);
        rT.setByAngle(360);
        sT.setByX(1.5);
        sT.setByY(1.5);
        rT.setCycleCount(5);
        sT.setCycleCount(5);
        rT.setAutoReverse(false);
        sT.setAutoReverse(false);
        sT.play();
        rT.play();
        
        imageView.setX(50); 
        imageView.setY(25); 
      
        //setting the fit height and width of the image view 
        imageView.setFitHeight(455); 
        imageView.setFitWidth(500); 

        //Setting the preserve ratio of the image view 
        imageView.setPreserveRatio(true);  
        
        Group root = new Group(imageView);
        Scene theScene = new Scene( root, 600,500 );
        primaryStage.setScene( theScene );

        primaryStage.show();
        
        
        
    }
}
