package edu.yu.introtoalgs;

import java.util.*;

public class GraphsAndMazes {

  /** A immutable coordinate in 2D space.
   *
   * Students must NOT modify the constructor (or its semantics) in any way,
   * but can ADD whatever they choose.
   */
  public static class Coordinate { 
    public final int x, y;
    
    /** Constructor, defines an immutable coordinate in 2D space.
     *
     * @param x specifies x coordinate
     * @param y specifies x coordinate
     */
    public Coordinate(final int x, final int y) {
      this.x = x;
      this.y = y;
    }

    /** Add any methods, instance variables, static variables that you choose
     */
  } // Coordinate class

  /** Given a maze (specified by a 2D integer array, and start and end
   * Coordinate instances), return a path (beginning with the start
   * coordinate, and terminating wih the end coordinate), that legally
   * traverses the maze from the start to end coordinates.  If no such
   * path exists, returns an empty list.  The path need need not be a
   * "shortest path".
   *
   * @param maze 2D int array whose "0" entries are interpreted as
   * "coordinates that can be navigated to in a maze traversal (can be
   * part of a maze path)" and "1" entries are interpreted as
   * "coordinates that cannot be navigated to (part of a maze wall)".
   * @param start maze navigation must begin here, must have a value
   * of "0"
   * @param end maze navigation must terminate here, must have a value
   * of "0"
   * @return a path, beginning with the start coordinate, terminating
   * with the end coordinate, and intervening elements represent a
   * legal navigation from maze start to maze end.  If no such path
   * exists, returns an empty list.  A legal navigation may only
   * traverse maze coordinates, may not contain coordinates whose
   * value is "1", may only traverse from a coordinate to one of its
   * immediate neighbors using one of the standard four compass
   * directions (no diagonal movement allowed).  A legal path may not
   * contain a cycle.  It is legal for a path to contain only the
   * start coordinate, if the start coordinate is equal to the end
   * coordinate.
   */
  public static
    List<Coordinate> searchMaze
    (final int[][] maze, final Coordinate start, final Coordinate end)
  {
    // fill me in
    return null;                // fix this!
  }

  /** minimal main() demonstrates use of APIs
   */
  public static void main (final String[] args) {
    final int[][] exampleMaze = {
      {0, 0, 0},
      {0, 1, 1},
      {0, 1, 0}
    };

    final Coordinate start = new Coordinate(2, 0);
    final Coordinate end = new Coordinate(0, 2);
    final List<Coordinate> path = searchMaze(exampleMaze, start, end);
    System.out.println("path="+path);
  }

}
