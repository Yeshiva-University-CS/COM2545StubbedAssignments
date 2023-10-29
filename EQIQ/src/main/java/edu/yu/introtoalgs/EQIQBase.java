package edu.yu.introtoalgs;

/** Defines the API for the EQIQ assignment using an abstract base class which
 * students will extend to provide a concrete class named EQIQ.  See the
 * requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * @author Avraham Leff
 */

public abstract class EQIQBase {

  /** Constructor: supplies the information needed to solve the EQIQ problem.
   * When the constructor invocation completes successfully, clients invocation
   * of every other API method must return in O(1) time.
   *
   * @param totalQuestion the number of questions on the candidate interview
   * test, must be greater than 1
   * @param eqSuccessRate the ith element of this array specifies the success
   * rate of the ith candidate for EQ questions.  Client maintains ownership.
   * @param iqSuccessRate the ith element of this array specifies the success
   * rate of the ith candidate for IQ questions.  Client maintains ownership.
   *
   * NOTE: the size of the two arrays must be identical, and greater than one.
   * @param nepotismIndex the index in the above arrays that specifies the
   * values of the nepotism candidate.  Candidate indices are numbered
   * 0..nCandidates -1.
   */
  public EQIQBase(int totalQuestions,
                  double[] eqSuccessRate,
                  double[] iqSuccessRate,
                  int nepotismIndex)
  {
    // fill me in!
  }

  /** Return true iff some combination of EQ and IQ questions allow the
   * "nepotism candidate" to win.
   */
  public abstract boolean canNepotismSucceed();

  /** If canNepotismSucceed() is true, returns the number of EQ questions
   * (accurate to three decimal places) in the optimal configuration for the
   * nepotism candidate; otherwise, returns -1.0
   */
  public abstract double getNumberEQQuestions();

  /** If canNepotismSucceed() is true, returns the number of IQ questions
   * (accurate to three decimal places) in the optimal configuration for the
   * neptotism candidate; otherwise, returns -1.0
   */
  public abstract double getNumberIQQuestions();

  /** If canNepotismSucceed() is true, returns the number of SECONDS (accurate
   * to three decimal places) by which the nepotism candidate completes the
   * test ahead of the next best candidate; ootherwise, returns -1.0
   */
  public abstract double getNumberOfSecondsSuccess();
} // abstract base class
