package edu.yu.introtoalgs;

/** Defines the API for the QuestForOil assignment: see the requirements
 * document for more information.
 *
 * Students MAY NOT change, or add to, the APIs below.  My test code will
 * only invoke the API defined below.
 *
 * @author Avraham Leff
 */

public abstract class QuestForOilBase {

  /** Constructor supplies the map.
   *
   * @param map a non-null, N by M (not necessarily a square!), two-dimensional
   * matrix in which each element is either an 'S' (safe) or a 'U' (unsafe) to
   * walk on. It's the client's responsibility to ensure that the matrix isn't
   * "jagged". The client relinquishes ownership to the implementation.
   */
  public QuestForOilBase(char[][] map) {
    // no-op implementation
  }

  /** Specifies the initial "start the search" square, explore the map to find
   * the maximum number of squares contiguous to that square (including the
   * "start the search" square itself).
   *
   * Note: the client is allowed to repeatedly invoke this method, e.g., with
   * different start search squares, on the same QuestForOil instance.
   *
   * @param row the row of the initial "start the search" square, 0..N-1
   * indexing.
   * @param column the column of the initial "start the search" square, 0..M-1
   * indexing.
   * @return the maximum number of squares contiguous to the inital square.
   */
  public abstract int nContiguous(int row, int column);
} // class QuestForOilBase
