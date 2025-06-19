package edu.yu.introtoalgs;

/** Defines the API for the WeirdSort assignment using an abstract base class
 * which students will extend to provide a concrete class named WeirdSort.  See
 * the requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * @author Avraham Leff
 */
public abstract class WeirdSortBase {

  /** Constructor.
   *
   * @param toBeSorted 0..n-1 array of numbers to be sorted: elements are
   * distinct and are each in the range [1..n].  Client is responsible ensuring
   * the above properties and client maintains ownership.
   */
  public WeirdSortBase(final int[] toBeSorted) {
  }
   
  /** Returns an array 0..n whose ith element is the number of swaps performed
   * in the ith phase of WeirdSortBase.  (There is no "phase 0".)  If it
   * chooses to (not) do so, the implementation need not do the actual
   * sort. Implementor maintains ownership.
   *
   * IMPORTANT: because phases are numbered 1..n, there are n+1 elements in the
   * returned array with element 0 ignored by the client.  See the requirements
   * doc for an example.
   */
  public abstract int[] swapThem();
}
