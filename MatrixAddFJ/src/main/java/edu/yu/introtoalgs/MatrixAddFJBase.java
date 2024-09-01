package edu.yu.introtoalgs;

/** Defines the API for the MatrixAddFJ assignment using an abstract base class
 * which students will extend to provide a concrete class named MatrixAddFJ.
 * See the requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * @author Avraham Leff
 */

public abstract class MatrixAddFJBase {

  /** Constructor: client specifies the threshold value "n" (in a "n by n"
   * matrix) at which a Fork-Join implementation of add should switch over to a
   * serial implementation.
   *
   * @param addThreshold specifies that matrix addition for "n" greater than or
   * equal to the threshold must be processed using a serial algorithm rather
   * than via FJ decomposition, must be greater than 0.
   */
  public MatrixAddFJBase(int addThreshold) {
    // no-op implementation
  }

  /** Adds matrices a and b.  The implementation MUST be based on using the
   * JDK's Fork-Join (either RecursiveTask or RecursiveAction classes).  The FJ
   * threshold is supplied by the constructor.
   *
   * NOTE: if the addThreshold is greater than or equal to the size of the add
   * threshold, the implementation MUST use the straightforward serial
   * algorithm.
   *
   * @param a Represents a "matrix", n by n, client maintains ownership.  It is
   * the client's responsibility to ensure that the matrix is square and the
   * same dimensions as the other parameter.
   * @param b Represents a "matrix", n by n, client maintains ownership.  It is
   * the client's responsibility to ensure that the matrix is square and the
   * same dimensions as the other parameter.
   * @return Result of adding the two matrices.
   */
  public abstract double[][] add(final double[][] a, final double[][] b);
} // base class
