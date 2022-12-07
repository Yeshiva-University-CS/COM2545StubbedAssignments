package edu.yu.introtoalgs;

/** Defines the API for the LinelandNavigation assignment: see the requirements
 * document for more information.
 *
 * Students MAY NOT change the constructor signature.  My test code will only
 * invoke the API defined below.
 *
 * @author Avraham Leff
 */

public class LinelandNavigation {

  /** Even though Lineland extends forward (and backwards) infinitely, for
   * purposes of this problem, the navigation goal cannot exceed this value
   */
  public final static int MAX_FORWARD = 1_000_000;

  /** Constructor.  When the constructor completes successfully, the navigator
   * is positioned at position 0.
   *
   * @param g a positive value indicating the minimim valued position for a
   * successful navigation (a successful navigation can result in a position
   * that is greater than g).  The value of this parameter ranges from 1 to
   * MAX_FORWARD (inclusive).
   * @param m a positive integer indicating the exact number of positions that
   * must always be taken in a forward move. The value of this parameter cannot
   * exceed MAX_FORWARD.
   * @throws IllegalArgumentException if the parameter values violate the
   * specified semantics.
   */
  public LinelandNavigation(final int g, final int m) {
    // fill me in!
  }

  /** Adds a mined line segment to Lineland (an optional operation).
   *
   * NOTE: to simplify computation, assume that no two mined line segments can
   * overlap with one another, even at their end-points.  You need not test for
   * this (although if it's easy to do so, consider sprinkling asserts in your
   * code).
   *
   * @param start a positive integer representing the start (inclusive)
   * position of the line segment
   * @param end a positive integer represending the end (inclusive) position of
   * the line segment, must be greater or equal to start, and less than
   * MAX_FORWARD.
   */
  public void addMinedLineSegment(final int start, final int end) {
    // fill me in!
  }


  /** Determines the minimum number of moves needed to navigate from position 0
   * to position g or greater, where forward navigation must exactly m
   * positions at a time and backwards navigation can be any number of
   * positions.
   *
   * @return the minimum number of navigation moves necessary, or "0" if no
   * navigation is possible under the specified constraints.
   */
  public final int solveIt() {
    return -1;
  }
} // LinelandNavigation
