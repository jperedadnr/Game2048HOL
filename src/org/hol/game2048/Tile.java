package org.hol.game2048;

import java.util.Random;
import javafx.geometry.Pos;
import javafx.scene.control.Label;

/**
 *  JAVAONE 2014 - Create the Game 2048 with Java 8 and JavaFX [HOL3244]
 *  @authors bruno.borges@oracle.com @brunoborges & pereda@eii.uva.es @jperedadnr
 */
public class Tile extends Label {
    
    private int value;
    private Location location;
    private boolean merged;

    public static Tile newRandomTile() {
        // TO-DO. Create random value, 90% chance 2, 10% 4
        
        // -->
        return newTile(2);
    }
    
    public static Tile newTile(int value) {
        return new Tile(value);
    }
    
    private Tile(int value) {
        // TO-DO. Step 6. Create tile 
        
        // -->
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean isMerged() {
        return merged;
    }

    public void setMerged(boolean merged) {
        this.merged = merged;
    }

    @Override
    public String toString() {
        return "Tile{" + "value=" + value + ", location=" + location + ", merged=" + merged + '}';
    }
    
    public void merge(Tile another) {
        // TO-DO: Step 27. Add to tile's value the value of the tile to be merged to, 
        // set the text with the new value and replace the old style ‘game-title-“-value with the new one
        
        // -->
    }
    
    public boolean isMergeable(Tile anotherTile) {
        // TO-DO: Step 27. Check it this.tile can be merged with anotherTile 
        
        // -->
        return false;
    }        
}
