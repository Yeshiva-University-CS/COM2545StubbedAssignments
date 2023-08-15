package edu.yu.introtoalgs;

/** Defines the TxSortFJ API through an abstract base class.  Students MAY NOT
 * add constructors to the one defined below, nor may they add add any public
 * methods.
 *
 * @author Avraham Leff
 */

import java.util.List;

public abstract class TxSortFJBase {

  /** Constructor.
   *
   * @param transactions a list of transactions, possibly not sorted.
   */
  public TxSortFJBase(List<TxBase> transactions) {
  }

  /** Returns an array of transactions, sorted in ascending order of
   * TxBase.time() values: any instances with null TxBase.time() values precede
   * all other transaction instances in the sort results.
   *
   * @return the transaction instances passed to the constructor, returned as
   * an array, and sorted as specified above.  Students MAY ONLY use the
   * ForkJoin and their own code in their implementation.
   */
  public abstract TxBase[] sort();


} // abstract base class
