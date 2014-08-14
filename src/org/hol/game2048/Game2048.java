package org.hol.game2048;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *  JAVAONE 2014 - Create the Game 2048 with Java 8 and JavaFX [HOL3244]
 *  @authors bruno.borges@oracle.com @brunoborges & pereda@eii.uva.es @jperedadnr
 */
public class Game2048 extends Application {
    
    private GameManager gameManager;
    
    @Override
    public void init() {
        // TO-DO: Step 10. Load font when css is enabled
        
        // -->
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        StackPane root=new StackPane();
        // TO-DO: Step 1. Add gameManager to root
        
        // -->
        
        Scene scene = new Scene(root, 600, 700);
        // TO-DO: Step 10. Load css 
        
        // -->
        
        // TO-DO: Step 14. enable arrow keys to move the tiles
        
        // -->
        
        primaryStage.setTitle("2048FX");
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
