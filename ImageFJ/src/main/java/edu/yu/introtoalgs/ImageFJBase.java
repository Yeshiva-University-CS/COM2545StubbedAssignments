package edu.yu.introtoalgs;

/** Defines the API for the ImageFJ assignment using an abstract base class
 * which students extend to provide a concrete class named ImageFJ.  See the
 * requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * Students are encouraged to provide a parallel implementation based on FJ.
 *
 * @author Avraham Leff
 */

public abstract class ImageFJBase {

  /** Constructor:
   *
   * @param input the raw grayscale input image layers.  The number of rows N
   * need not equal the number of columns M, but each row is of size M, and
   * both M and N are > 0. Client maintains ownership and is responsible for
   * providing valid (not null, not empty, valid pixel values etc) input.
   * @param K the "decomposition factor" discussed in the requirements
   * document: in tandmem with the number of cores returned by
   * Runtime.getRuntime().availableProcessors() and the total work (number of
   * rows in input) specify the sequential threshold for this problem instance.
   * K is greater than 0.0, and client is responsible for providing a valid
   * parameter.
   */
  public ImageFJBase(int[][] input, double K) {
    // base class ctor provides a no-op implementation
  }

  /** Returns the blurred version (according to the requirements document
   * algorithm) of the input array.
   *
   * @return the blurred version of the input.
   */
  public abstract int[][] blurIt();

  /** A utility method that you can optionally use to safely retrieve a pixel
   * value from the matrix.  If the coordinates are out of bounds, it "clamps"
   * to the nearest valid edge pixel.
   */
  protected final int getPixelClamped(int[][] matrix, int row, int col) {
    int r = Math.max(0, Math.min(row, matrix.length - 1));
    int c = Math.max(0, Math.min(col, matrix[0].length - 1));
    return matrix[r][c];
  }

} // abstract base class
