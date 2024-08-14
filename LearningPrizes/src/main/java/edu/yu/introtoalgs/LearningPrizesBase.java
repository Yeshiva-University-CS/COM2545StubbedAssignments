package edu.yu.introtoalgs;

/** Defines the API for the LearningPrizes assignment using an abstract base
 * class which students will extend to provide a concrete class named
 * LearningPrizes.  See the requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * IMPORTANT design note: this class and its sub-classes need not be
 * thread-safe.
 *
 * IMPORTANT: It's the client's responsibility to invalidate a given iterator
 * instance if she invokes addTicket() after invoking awardedPrizeMoney().
 *
 * @author Avraham Leff
 */

import java.util.Iterator;

public abstract class LearningPrizesBase {

  /** Constructor: supplies the prize weighting constant, and initializes state
   * to no tickets added to the learning program.
   *
   * @param prizeWeightingConstant (a positive value) when used to calculate
   * awarded prize money, weights the result of the ("max - min") computation
   * to determine the amount that's actually awarded
   * @throws IllegalArgumentException if any of the pre-conditions are violated.
   */
  public LearningPrizesBase (double prizeWeightingConstant) {
    // no-op implementation 
  }

  /** Adds a ticket to the learning program.  A given child can add a ticket a
   * maximum of one time per day.
   *
   * @param day positive integer, that identifies the day in which the child
   * learned the specified number of hours.  Days need not be sequential (e.g.,
   * no tickets may have been submitted that day), but can never decrease in
   * value from ANY tickets submitted previously.  Whenever a ticket specifies
   * a day value greater than previously seen, this signifies a "new learning
   * program day": subsequent tickets that specify an earlier day are invalid
   * and must be rejected by the system.
   *
   * If fewer than two tickets were submitted on a given day, no prize money is
   * awarded for that day's learning, and the tickets remain in the pool
   * (potentially being awarded prizes on subsequent days)
   * 
   * @param childId non-negative integer, uniquely identifies the child.
   * @param hoursLearned positive-value, the number of hours learned on that
   * day by this child
   * @throws IllegalArgumentException if any of the pre-conditions are
   * violated.
   */
  public abstract void addTicket(int day, int childId, double hoursLearned);

  /** An iterator returning the prize money awarded on successive days (from
   *  the first day through the last day that tickets were processed).  Your
   *  implementation is allowed to throw throw UnsupportedOperationException()
   *  if the client invokes either forEachRemaining() or remove().
   *
   * IMPORTANT: by invoking this method, the client implicitly instructs the
   * implementation to compute prize money for the current day, followed by
   * "bumping the day counter" to end processing of tickets for the current day
   * and starting a new processing period.  Tickets that arrive after this
   * method is invoked must therefore be for a day that's later than the
   * current day.
   *
   * IMPLICATION: given a large pool of submitted tickets, the learning program
   * will calculate N prize money awards if clients invoke the iterator N times
   * on the existing pool of tickets (even if e.g., all tickets are for day
   * #1).  After those N invocations, the N days of prize money will be
   * available via N invocations of iterator.next()
   * 
   * @return Iterator over the sequence of awarded prize money.
   * @see addTicket
   */
  public abstract Iterator<Double> awardedPrizeMoney();

} // abstract base class  
