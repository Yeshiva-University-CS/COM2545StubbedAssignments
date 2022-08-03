 package edu.yu.introtoalgs;

/** Defines the API for the BigOIt assignment: see the requirements
 * document for more information.
 *
 * Students MAY NOT change the constructor signature.  My test code will only
 * invoke the API defined below.
 *
 * @author Avraham Leff
 */

public abstract class BigOItBase{
  /** No-argument constructor.
   */
  public BigOItBase() {
    // no-op implementation in this base class
  }

  /** Given the name of a class that implements the BigOMeasurable API, creates
   * and executes instances of the class, such that by measuring the resulting
   * performance, can return the "doubling ratio" for that algorithm's
   * performance.
   *
   * See extended discussion in Sedgewick, Chapter 1.4, on the topic of
   * doubling ratio experiments.
   *
   * @param bigOMeasurable name of the class for which we want to compute a
   * doubling ratio.  The client guarantees that the corresponding class
   * implements the BigOMeasurable API, and can be constructed with a
   * no-argument constructor.  This method is therefore able to first construct
   * instances of this class, invoke "setup(n)" for whatever values of "n" are
   * desired, and then invoke "execute()" to measure the performance of a
   * single invocation of the algorithm.  The client is responsible for
   * ensuring that invocation of setup(n) produces a suitably populated
   * (perhaps randomized) set of state scaled as a function of n.
   * @param timeOutInMs number of milliseconds allowed for the computation.  If
   * the implementation has not computed an answer by this time, it should
   * return NaN.
   * @return the doubling ratio for the specified algorithm if one can be
   * calculated, NaN otherwise.
   * @throws IllegalArgumentException if bigOMeasurable parameter doesn't
   * fulfil the contract specified above or if some characteristic of the
   * algorithm is at odds with the doubling ratio assumptions.
   */
  abstract public double doublingRatio(String bigOMeasurable, long timeOutInMs);

} // class
