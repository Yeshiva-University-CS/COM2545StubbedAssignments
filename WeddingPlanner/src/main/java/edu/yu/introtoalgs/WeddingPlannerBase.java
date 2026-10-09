package edu.yu.introtoalgs;

/** Defines the API for the WeddingPlanner assignment using an abstract base
 * class which students extend to provide a concrete class named
 * WeddingPlanner.  See the requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * @author Avraham Leff
 */

import java.util.List;

public abstract class WeddingPlannerBase {

  /** Constructor.
   *
   * NOTE: Performance is measured from the constructor invocation until
   * maxWeddingDuration() returns a value.
   */
  public WeddingPlannerBase() {
    // base class doesn't add function
  }

  /** Specifies that the specified friend is available to attend the wedding
   * from time L (inclusive) to time R (exclusive).
   *
   * @param id uniquely identifies the friend with an id that ranges from
   * 0..n-1 (inclusive).  Client is responsible for suppling a valid parameter.
   * @param L left-boundary (client is responsible for supplying a L > 0, and
   * that L < R))of the friend's availabilty to attend the wedding.
   * @param R right-boundary (client is responsible for supplying a R > 0) of
   * the friend's availabilty to attend the wedding.
   */
  public abstract void addFriendsAvailabilty(int id, int L, int R);

  /** Returns the left (inclusive) and right (exclusive) interval boundaries of
   * a maximum wedding duration that's possible under the constraint that at
   * least K friends attend the wedding in the a given interval (L (inclusive),
   * R (exclusive)).
   *
   * @param K at least K friends (client is responsible for supplying a K>0)
   * must attend the wedding or the wedding will not be held.  Oy!
   * @return a 2 element array where int[0] is L and int[i] is R, and L and R
   * specify a maximum duration of a valid wedding interval such that at least
   * K friends attend the wedding throughout the scheduled wedding.  Return
   * null if the constraints cannot be met.
   */
  public abstract int[] maxWeddingDuration(int K);

} // abstract base class
