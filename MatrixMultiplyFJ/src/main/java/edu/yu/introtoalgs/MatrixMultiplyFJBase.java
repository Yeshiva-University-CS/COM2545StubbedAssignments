package edu.yu.introtoalgs;

/** Defines the API for the MatrixMultiplyFJ assignment using an abstract base class
 * which students will extend to provide a concrete class named MatrixMultiplyFJ.
 * See the requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * @author Avraham Leff
 */

public abstract class MatrixMultiplyFJBase {

  /** Constructor: client specifies the threshold values (with respect
   * to the dimensions of a "n by n" matrix) at which a Fork-Join
   * implementation of multiply should switch over to a serial
   * implementation.
   *
   * @param multiplyThreshold specifies that matrix multiplication for matrices
   * of size that are smaller than or equal to the threshold must be processed
   * using a serial algorithm rather than via FJ decomposition, must be greater
   * than 0.
   * @param addThreshold specifies that matrix addition for matrices
   * of size that are smaller than or equal to the threshold must be
   * processed using a serial algorithm rather than via FJ
   * decomposition, must be greater than 0.
   * @throws IllegalArgumentException if the pre-conditions are violated
   */
  public MatrixMultiplyFJBase(int multiplyThreshold, int addThreshold) {
    // no-op implementation
  }

  /** Multiplies matrices a and b.  The implementation (for BOTH the explicit
   * multiplication operations AND the implicit addition operations) MUST be
   * based on using the JDK's Fork-Join (either RecursiveTask or
   * RecursiveAction classes).  The relevant FJ thresholds are supplied by the
   * constructor.
   *
   * NOTE: if the constructor thresholds are less than or equal to the
   * size of the arrays (either the explicit parameters supplied here
   * or in the arrays constructed during FJ decomposition), the
   * implementation MUST use the straightforward serial algorithms for
   * matrix multiplication and addition.
   *
   * @param a Represents a "matrix", n by n, client maintains ownership.  It is
   * the client's responsibility to ensure that the matrix is square and the
   * same dimensions as the other parameter.
   * @param b Represents a "matrix", n by n, client maintains ownership.  It is
   * the client's responsibility to ensure that the matrix is square and the
   * same dimensions as the other parameter.
   * @return Result of multiplying the two matrices.
   * @throws RuntimeException if anything goes wrong
   */
  public abstract double[][] multiply(double[][] a, double[][] b);
} // base class
