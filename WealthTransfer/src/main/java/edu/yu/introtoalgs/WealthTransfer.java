package edu.yu.introtoalgs;

/** Defines the API for the WealthTransfer assignment: see the requirements
 * document for more information.
 *
 * Students MAY NOT change the constructor signature.  My test code will only
 * invoke the API defined below.
 *
 * @author Avraham Leff
 */

public class WealthTransfer {

  /** Constructor: specifies the size of the population.
   *
   * @param populationSize a positive integer specifying the number of people
   * in the population.  Members of the population are uniquely identified by
   * an integer 1..populationSize.  Initial wealth transfer must be initiated
   * by the person with id of "1".
   */
  public WealthTransfer(final int populationSize) {
    // fill me in
  } // constructor

  /** Specifies that one person want to make a wealth transfer to another
   * person.
   *
   * @param from specifies who is doing the wealth transfer, must correspond to
   * a valid population id
   * @param to specifies who is receiving the wealth transfer, must correspond
   * to a valid population id, and can't be identical to "from"
   * @param percentage the percentage of "from"'s wealth that will be
   * transferred to "to": must be an integer between 1..100
   * @param isWealthSquared if true, the wealth received is the square of the
   * money transferred
   * @throws IllegalArgumentException if the parameter Javadoc specifications
   * aren't satisfied or if this "from" has previously specified a wealth
   * transfer to this "to".
   */
  public void intendToTransferWealth(final int from, final int to,
                                     final int percentage,
                                     final boolean isWealthSquared) {
    // fill me in
  }

  /** Specifies the wealth that the person must have in order for the overall
   * wealth transfer problem to be considered solved.
   *
   * @param id must correspond to a member of the population from 2..populationSize
   * @param wealth the wealth that the designated person must have as a result
   * of wealth transfers, must be positive.
   * @throw IllegalArgumentException if parameter Javadoc specifications aren't
   * met.
   */
  public void setRequiredWealth(final int id, final int wealth) {
    // fill me in
  }

  /** Solves the wealth transfer problem by determining the MINIMAL amount of
   * wealth that "person with id of 1" must transfer such that all members of
   * the population receive the wealth that they have been promised.
   *
   * The amount of wealth that a person has been promised is specified by
   * invocations of setRequiredWealth().  The amount of wealth that a person
   * actually receives is specified by invocations of intendToTransferWealth().
   * The "person with id of 1" initiates all wealth transfers between members
   * of the population.  This method returns the minimum amount of that
   * initiating wealth transfer that will satisfy the remaining population's
   * needs.
   *
   * NOTE: at the time that this method is invoked, all persons transfering
   * wealth MUST be on record as intending to transfer 100 percent of their
   * wealth.  If this pre-condition doesn't hold, the implementation MUST throw
   * an IllegalStateException in lieu of solving the problem.
   *
   * @return the minimum amount transfered by person with id #1: must be
   * accurate to four digits after the decimal point.
   */
  public double solveIt() {
    return 0.0;
  }
} // class
