package edu.yu.introtoalgs;

/** Defines the API for the CountTheMoves assignment using an abstract base
 * class which students will extend to provide a concrete class named
 * CountTheMoves.  See the requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * @author Avraham Leff
 */

import java.util.*;

public abstract class CountTheMovesBase {
  /** Represents a "unit" of the board's layout: PEG represents a peg, HOLE
   * represents a HOLE into which a PEG can be placed, and BOARD represents a
   * unit that is neither a PEG or a HOLE.
   */
  public enum BoardUnit {
    PEG, HOLE, BOARD
  }

  public final static int N_ROWS = 7;
  public final static int N_COLUMNS = 7;

  /** Constructor: a valid game board in a given state.
   *
   * A valid game board consists of N_ROWS, each consisting of N_COLUMNS.  Rows
   * are numbered 0..n-1 as are columns.  It's the client's responsibility to
   * supply a valid game board, and to ensure that no board element is null.
   *
   * @param board game board in a given state.  Client maintains ownership.
   */
  public CountTheMovesBase(BoardUnit[][] board) {
  }

  /** Returns the number of distinct valid "one move" state changes that can be made
   * from the board supplied to the constructor.
   *
   * @return number of distinct valid one move state changes
   */
  public abstract int countThem();

} // abstract base class  
