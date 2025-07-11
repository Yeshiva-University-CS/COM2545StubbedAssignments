package edu.yu.introtoalgs;

/** Defines the API for the DigitalCounterSequence assignment using an abstract
 * base class which students will extend to provide a concrete class named
 * DigitalCounterSequence.  See the requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * Design note: implementors may assume a single-threaded environment.
 *
 * @author Avraham Leff
 */
public abstract class DigitalCounterSequenceBase {

  /** Constructor supplies the initial digital counter configuration for all
   * counters.
   *
   * @param initialConfiguration specifies the values of each counter in the
   * sequence, in left-to-right order, corresponding to counter #1, ...,
   * counter #n.  Array size is at least one.  Every array element must be must
   * be in the range 0..9 (inclusive).  Client is responsible for supplying a
   * valid parameter and maintains ownership.
   */
  public DigitalCounterSequenceBase(int[] initialConfiguration) {
  }
   
  /** Returns the sum of the numbers on the counters specified by
   * lRange..rRange (inclusive).
   *
   * IMPORTANT: this method has a side effect!  After computing the sum, all
   * counter values in the specified range are incremented.
   *
   * @param lRange the label of the leftmost counter in the range of counters:
   * must be no less than 1, no greater than number of counters, and not more
   * than rRange.
   * @param rRange the label of the rightmost counter in the range of counters:
   * must be no less than 1, no greater than number of counters, and not less
   * than lRange.
   * @return the sum of all counter values in the specified range.
   * @throws IllegalArgumentException if the parameter requirements are
   * violated.
   */
  public abstract int sum(int lRange, int rRange);
}
