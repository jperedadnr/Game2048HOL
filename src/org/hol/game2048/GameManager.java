package org.hol.game2048;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.util.Duration;

/**
 *  JAVAONE 2014 - Create the Game 2048 with Java 8 and JavaFX [HOL3244]
 *  @authors bruno.borges@oracle.com @brunoborges & pereda@eii.uva.es @jperedadnr
 */
public class GameManager extends Group {
    
    private Board board;
    private final List<Location> locations = new ArrayList<>();
    private final Map<Location, Tile> gameGrid = new HashMap<>();
    private final ParallelTransition parallelTransition = new ParallelTransition();
    private volatile boolean movingTiles = false;
    private int tilesWereMoved=0;
    private final Set<Tile> mergedToBeRemoved = new HashSet<>();
    
    /**
     * GameManager is a Group containing a Board that holds a grid and the score
     * a Map holds the location of the tiles in the grid
     * 
     * The purpose of the game is sum the value of the tiles up to 2048 points
     * Based on the Javascript version: https://github.com/gabrielecirulli/2048
     */
    public GameManager(){
        // TO-DO: Step 2. Create board and it to gameManager
        
        // -->
        
        // TO-DO: Step 42. Add listener to reset game
        
        // -->
        
        // TO-DO: Step 15. call initilize gameGrid
        
        // -->
        
        // TO-DO: Step 9. call start game to display a tile on the board
        
        // -->
    }

     /**
     * Initializes all cells in gameGrid map to null
     */
    private void initializeGameGrid() {
        // TO-DO: Step 15 (Until Step 25). Clear the lists, add all locations, and call it before startGame
        
        // TO-DO: Step 25. Use traverseGrid
            
        // -->
        
    }
    
    /**
     * Starts the game by adding 1 or 2 tiles at random locations
     */
    private void startGame() {
        // TO-DO: Step 9 (Until Step 16). Create a new random tile at a random location
        
        // TO-DO: Step 16. Create a new random tile at a random location
        
        // -->
    }
    
    /**
     * Redraws all tiles in the <code>gameGrid</code> object
     */
    private void redrawTilesInGameGrid() {
        // TO-DO: Step 16. Add all valid tiles to board
        
        // -->
    }
    
    /**
     * Moves the tiles according to given direction
     * At any move, takes care of merge tiles, add a new one and perform the
     * required animations
     * It updates the score and checks if the user won the game or if the game is over 
     * 
     * @param direction is the selected direction to move the tiles
     */
    public void move(Direction direction) {
        // TO-DO: Step 20. Quit if animation is playing
        
        // -->

        // TO-DO: Step 13 (Until Step 18): get a list of tiles, remove them from the board, 
        // create new tiles at an offset location if valid (limits, no other tile)
        
        // -->
        
        
        // TO-DO: Step 18 (Until Step 25). Use gameGrid instead of gridgroup
        // moving the existing tiles to the farthest location, and updating the map.
        // Note: the IntStreams are not well ordered for the moment
        
            // TO-DO: Step 20. Animate tiles movement
        
            // -->
        // -->
        
        // TO-DO: Step 25 (Until Step 45). Replace the IntStreams with the traverseGrid method
            
            // TO-DO: Step 26. Sort grid before traversing it
            
            // -->
            // TO-DO: Step 32. reset points
            
            // -->
            
                    // TO-DO: Step 29. Get tile for an offset, check if it's a valid tile, not merged, and
                    // check if tiles can be merged 
                            // TO-DO: Step 32. add points
                            
                            // -->
                            // TO-DO: Step 38. Check for a winning tile
                                    // TO-DO: Step 41. set game win
                                    
                                    // -->
                            // -->
                    // -->
        // -->    
            
        // TO-DO: Step 45: Use optionalTile to traverse the grid, using an atomicInteger to 
        // return the results

        // -->
        
        // TO-DO: Step 35. Call animate score
        
        // -->
        
        // TO-DO: Step 20. Get a randomLocation, check not null, create random tile, add to board and to map
                // TO-DO: Step 30. Remove the tiles in the set from the gridGroup and clear the set. 
                // For all the tiles on the board: set to false their merged value
                
                // -->
                
                // TO-DO: Step 23. Start animation and block movingTiles till it has finished
                        // TO-DO Until Step 25
                        
                        // -->
                        // TO-DO: Step 25. Check if tiles moved to allow new tile
                        
                        // -->  
                
                        // TO-DO Until Step 37
                        
                        // -->
                        // TO-DO: Step 37. Game over only if no pair of mergeable tiles available
                                // TO-DO: Step 41. set game over
                                
                                // -->
                        // -->  
                // -->
        // -->       
    }
    
     /**
     * Searchs for the farthest empty location where the current tile could go
     * @param location of the tile
     * @param direction of movement
     * @return a location
     */
    private Location findFarthestLocation(Location location, Direction direction) {
        Location farthest=location;
        // TO-DO: Step 17. Search for the farthest location in the direction of movement
        // with no tile and inside the grid
        
        // -->
        return farthest;
    }

    /**
     * Animation that moves the tile from its previous location to a new location 
     * @param tile to be animated
     * @param newLocation new location of the tile
     * @return a timeline 
     */
    private Timeline animateExistingTile(Tile tile, Location newLocation) {
        Timeline timeline = new Timeline();
        // TO-DO: Step 19. Animate tiles movement from actual location to new location in 65ms
        
        // -->
        return timeline;
    }
    
    /**
     * Finds a random location or returns null if none exist
     *
     * @return a random location or <code>null</code> if there are no more
     * locations available
     */
    private Location findRandomAvailableLocation() {
        Location location=null;
        // TO-DO: Step 21. From empty tiles remaining, get a random position
        
        // -->
        return location;
    }
    
    /**
     * Adds a tile of random value to a random location with a proper animation
     * 
     * @param randomLocation 
     */
    private void addAndAnimateRandomTile(Location randomLocation) {
        // TO-DO: Step 22. Scale from 0 to 1 in 125 ms the new tile added to the board
        
            // TO-DO: Step 37. After last movement on full grid, check if there are movements available
                
                // TO-DO: Step 41. set game over

                // -->
            // -->
        // -->
    }
    
    /**
     * Animation that creates a pop effect when two tiles merge
     * by increasing the tile scale to 120% at the middle, and then going back to 100% 
     * @param tile to be animated
     * @return a sequential transition 
     */
    private SequentialTransition animateMergedTile(Tile tile) {
        // TO-DO: Step 28. sequential animation, with two scale animations, 
        // from 1 to 1.2, ease_in, and from 1.2 to 1 ease_out, in 80 ms each
        
        // -->
        return new SequentialTransition();
    }
    
    /**
     * Finds the number of pairs of tiles that can be merged
     * 
     * This method is called only when the grid is full of tiles, 
     * what makes the use of Optional unnecessary, but it could be used when the 
     * board is not full to find the number of pairs of mergeable tiles and provide a hint 
     * for the user, for instance 
     * @return the number of pairs of tiles that can be merged
     */
    private int mergeMovementsAvailable() {
        final AtomicInteger numMergeableTile = new AtomicInteger();
        // TO-DO: Step 36 (Until Step 44). Traverse grid in two directions, looking for 
        // pairs of mergeable tiles
        
        // TO-DO: Step 44. Use optionalTile to find pairs of mergeable tiles
        
        // -->
        return numMergeableTile.get();
    }
    
    /**
     * optionalTile allows using tiles from the map at some location, whether they
     * are null or not
     * @param loc location of the tile
     * @return an Optional<Tile> containing null or a valid tile
     */
    private Optional<Tile> optionalTile(Location loc) { 
        // TO-DO: Step 43. Return an Optional of nullable from a given location on the map gameGrid
        
        // -->
        return null;
    }
}
