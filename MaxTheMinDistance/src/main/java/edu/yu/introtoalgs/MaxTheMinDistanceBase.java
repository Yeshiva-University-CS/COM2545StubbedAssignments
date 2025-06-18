package edu.yu.introtoalgs;

/** Defines the API for the MaxTheMinDistance assignment using an abstract base
 * class which students will extend to provide a concrete class named
 * MaxTheMinDistance.  See the requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * @author Avraham Leff
 */

import java.util.*;

public abstract class MaxTheMinDistanceBase {

  /** Constructor.
   *
   * @param L the left-hand value of the range (inclusive) over which solveIt()
   * will look for a solution.
   * @param R the right-hand value of the range (inclusive) over which solveIt()
   * will look for a solution.
   * @param evens array of distinct, even, positive-valued integers.  The array
   * contains at least one element.  Client's responsibility to supply valid
   * values, and client maintains ownership.
   */
  public MaxTheMinDistanceBase(final int L, final int R, final int[] evens) {
    // your sub-classed implementation may want to add code here
  }

  /** Returns an odd integer in the range [L, R] (inclusive) that satisfies the
   * "max the min" criterion defined in the requirements document.
   */
  public abstract int solveIt();
} // abstract base class  
