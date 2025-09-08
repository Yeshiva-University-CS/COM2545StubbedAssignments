package edu.yu.introtoalgs;

/** Defines the API for the AsteroidAvoidance assignment using an abstract base
 * class which students will extend to provide a concrete class named
 * AsteroidAvoidance.  See the requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * @author Avraham Leff
 */

public abstract class AsteroidAvoidanceBase {

  /** Represents a "unit cell" of the space game's grid layout.
   */
  public enum SpaceUnit {
    EMPTY, ASTEROID, START, DEST
  }

  /** Constructor: client supplies a valid space game's grid layout.
   *
   * A valid game consists of N rows and M columns worth of SpaceUnit elements:
   * exactly one element is set to START, exactly one is set to DEST, and the
   * rest are either ASTEROID or EMPTY.
   *
   * @param game a valid game grid layout.  Client is responsible for supplying
   * a valid game layout (including "no jagged array"), client maintains
   * ownership.
   */
  public AsteroidAvoidanceBase(SpaceUnit[][] game) {
  }

  /** Returns the minimal distance of the optimal route from the START to the
   * DEST cell per the distance and optimal route semantics defined in the
   * requirements doc.
   *
   * @return the minimal distance of the optimal route.
   */
  public abstract int doIt();  
}
