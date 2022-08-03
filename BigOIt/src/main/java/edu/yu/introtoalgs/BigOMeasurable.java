package edu.yu.introtoalgs;

/** Defines an API for a class that wraps concrete algorithm implementations as
 * a function of a parameter "n" and measure algorithm performance.
 *
 * This class may not be altered IN ANY WAY.  With regard to subclasses,
 * students MAY NOT add ANY method to this API, NOR MAY they add a constructor
 * signature.  
 *
 * @author Avraham Leff
 */

public abstract class BigOMeasurable {

  /** Constructor
   */
  public BigOMeasurable() {
  }

  /** Set up internal data-structures etc as a function of "n": default
   * implementation.  The duration of this method MUST NOT be counted when
   * evaluating algorithm performance.
   */
  public void setup(final int n) {
    assert n>0: "n must be greater than 0";
    this.n = n;
  }

  /** Performs a single execution of an algorithm: MAY ONLY be invoked after
   * setup() has previously been invoked.  The algorithm must scale as a
   * function of the parameter "n" supplied to setup().
   *
   * NOTE: ONLY the duration of this method should be considered when
   * evaluating algorithm performance.
   */
  public abstract void execute();

  protected int n;
}
