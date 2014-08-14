
package org.hol.game2048;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *  JAVAONE 2014 - Create the Game 2048 with Java 8 and JavaFX [HOL3244]
 *  @authors bruno.borges@oracle.com @brunoborges & pereda@eii.uva.es @jperedadnr
 */
public class GridOperator {
    
    private static final List<Integer> traversalX = IntStream.range(0, 4).boxed().collect(Collectors.toList());
    private static final List<Integer> traversalY = IntStream.range(0, 4).boxed().collect(Collectors.toList());
    
    public static int traverseGrid(IntBinaryOperator func) {
        AtomicInteger at = new AtomicInteger();
        // TO-DO: Step 24. Traverse grid, applyinf the functional to every cell, returning the 
        // accumulated result
        
        // -->
        return at.get();
    }

    public static void sortGrid(Direction direction){
        // TO-DO: Step 26. Sort TraversalX, traversalY, so for Right or Down directions 
        // they are taken in reverse order
        
        // -->
    }
}
