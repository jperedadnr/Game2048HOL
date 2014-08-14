package org.hol.game2048;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.binding.Bindings;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 *  JAVAONE 2014 - Create the Game 2048 with Java 8 and JavaFX [HOL3244]
 *  @authors bruno.borges@oracle.com @brunoborges & pereda@eii.uva.es @jperedadnr
 */
public class Board extends Group {
    
    public static final int CELL_SIZE = 128;
    private static final int BORDER_WIDTH = (14 + 2) / 2;
    public static final int GRID_WIDTH = 4*CELL_SIZE+2*BORDER_WIDTH;
    private static final int TOP_HEIGHT = 92;
    private static final int GAP_HEIGHT = 50;
    
    private final VBox vGame = new VBox(0);
    private final HBox hMid=new HBox();
    private final HBox hBottom=new HBox();
    
    private final HBox hTop = new HBox(0);
    private final VBox vScore = new VBox(0);
    private final Label lblScore = new Label("0");
    private final Label lblBest = new Label("0");
    private final Label lblPoints = new Label();
    
    private final Group gridGroup = new Group();
    private final IntegerProperty gameMovePoints = new SimpleIntegerProperty(0);
    private final IntegerProperty gameScoreProperty = new SimpleIntegerProperty(0);
    private final Timeline animateAddedPoints = new Timeline();
    
    private final HBox overlay = new HBox();
    private final Label lOvrText= new Label();
    private final HBox buttonsOverlay = new HBox();
    private final Button bTry = new Button("Try again");
    private final Button bContinue = new Button("Keep going");
    
    private final BooleanProperty gameWonProperty = new SimpleBooleanProperty(false);
    private final BooleanProperty gameOverProperty = new SimpleBooleanProperty(false);
    private final BooleanProperty resetGame = new SimpleBooleanProperty(false);
    
    public Board(){
        // TO-DO: Step 3. Call create score
        
        // -->
        
        // TO-DO: Step 5. Call create grid
        
        // -->
        
        // TO-DO: Step 41. Call initGameProperties
        
        // -->
    }

    private void createScore() {
        // TO-DO: Step 3. Add the nodes to the top HBox
        
            
            // TO-DO: Step 10. Load css 
            
            // -->
        // -->
        
        hTop.setMinSize(GRID_WIDTH, TOP_HEIGHT);
        hTop.setPrefSize(GRID_WIDTH, TOP_HEIGHT);
        hTop.setMaxSize(GRID_WIDTH, TOP_HEIGHT);

        vGame.getChildren().add(hTop);
        
        hMid.setMinSize(GRID_WIDTH, GAP_HEIGHT);
        
        vGame.getChildren().add(hMid);
        
        // TO-DO: Step 32. Animate points added to score
        
        // -->
        
        // TO-DO: Step 33. bind lblPoints  to gameMovePoints with a “+” prefix, if points>0, 
        // and bind the lblScore text property with the gameScore property
        
        // -->
        
        // TO-DO: Step 34. Center points under vScore
        
        // -->
        
        // TO-DO: Step 35. Add a timeline to translate the lblPoints in Y from 20 to 100 
        // and reduce its opacity from 1 to 0 in 600 ms. 
        
        // -->
    }

    private Rectangle createCell(int i, int j){
        Rectangle cell=null;
        // TO-DO: Step 4. Create a squared rectangle, located over each coordinate (x,y), size CELL_SIZE
        
        // -->
        
        // TO-DO: Step 10. Load css 
        
        // -->
        return cell;
    }
    private void createGrid() {
        
        // TO-DO: Step 5 (Until Step 25). Add 4x4 cells to the gridGroup
        
        // TO-DO: Step 25. Use traverseGrid
        
        // -->
        
        // TO-DO: Step 10. Load css 
        
        // -->
        
        gridGroup.setManaged(false);
        gridGroup.setLayoutX(BORDER_WIDTH);
        gridGroup.setLayoutY(BORDER_WIDTH);

        hBottom.setMinSize(GRID_WIDTH, GRID_WIDTH);
        hBottom.setPrefSize(GRID_WIDTH, GRID_WIDTH);
        hBottom.setMaxSize(GRID_WIDTH, GRID_WIDTH);
        
        // TO-DO: Step 31. Clip the grid to avoid dropshadow effect moves it
        
        // -->
        hBottom.getChildren().add(gridGroup);
        
        vGame.getChildren().add(hBottom);
        getChildren().add(0,vGame);
    }
    
    public void addTile(Tile tile){
        // TO-DO: Step 8. Specify tile's location before adding it to the gridGroup
        
        // -->
        gridGroup.getChildren().add(tile);
    }
    
    public void moveTile(Tile tile, Location location){
        // TO-DO: Step 8. Translate the tile to the selected location
        
        // -->
    }
    
    
    public Group getGridGroup() {
        return gridGroup;
    }

    public void setPoints(int points){
        gameMovePoints.set(points);
    }
   
    public int getPoints() {
        return gameMovePoints.get();
    }
    
    public void addPoints(int points){
        // TO-DO: Step 32. add points to score, bind lblScore to gameScore
        
        // -->
    }
    
    public void animateScore() {
        // TO-DO: Step 35. Start animating points added. 
        
        // -->
    }
    
    private void initGameProperties() {
        overlay.setMinSize(GRID_WIDTH, GRID_WIDTH);
        overlay.setAlignment(Pos.CENTER);
        overlay.setTranslateY(TOP_HEIGHT + GAP_HEIGHT);

        overlay.getChildren().setAll(lOvrText);

        buttonsOverlay.setAlignment(Pos.CENTER);
        buttonsOverlay.setTranslateY(TOP_HEIGHT + GAP_HEIGHT + GRID_WIDTH / 2);
        buttonsOverlay.setMinSize(GRID_WIDTH, GRID_WIDTH / 2);
        buttonsOverlay.setSpacing(10);

        // TO-DO: Step 39. style buttons, set listeners to click. In both, remove overlay.
        // In bTry also remove tiles and reset all game properties
        
        // -->
        
        // TO-DO: Step 40. Add listeners to game over, won properties. Set style to 
        // overlay, set text and its style, add buttons, and add overlay to board
        
        // -->
    }
    
    public void setGameOver(boolean gameOver){
        gameOverProperty.set(gameOver);
    }
    
    public void setGameWin(boolean won){
        gameWonProperty.set(won);
    }
    
     public BooleanProperty resetGameProperty() {
        return resetGame;
    }
}
